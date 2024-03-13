package connection.sdf;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedApp {
	private static final ThreadLocal<Connection> threadLocalConnection = ThreadLocal.withInitial(() -> {
		try {
			return DatabaseConfig.getDataSource().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	});

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(40);
		// Create and start multiple threads
		for (int i = 0; i < 100; i++) {
			Worker2 worker = new Worker2();
			executorService.execute(worker);
		}
	}

	static class Worker implements Runnable {
		Service service = new Service();
		@Override
		public void run() {
			while(true){
				// Obtain a connection from the pool
				try (Connection connection = DatabaseConfig.getDataSource().getConnection()) {
					// Perform work using the connection
					System.out.println(Thread.currentThread().getName() +"---------"+connection.hashCode());
					service.runMethod();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				// The connection is automatically returned to the pool when the try-with-resources block is exited
			}
		}
	}


	static class Worker2 implements Runnable {
		Service service = new Service();
		@Override
		public void run() {
			while(true){
				// Obtain a connection from the pool
				try (Connection connection = DatabaseConfig.getDataSource().getConnection()) {
					service.runMethod(connection);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				// The connection is automatically returned to the pool when the try-with-resources block is exited
			}
		}
	}
}
