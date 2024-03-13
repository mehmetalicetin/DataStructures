package connection.sdf;

import java.sql.Connection;

public class Service {
	Connection connection;
	DBService dbService;

	public Service() {
		dbService = new DBService();
	}

	public void setConnection(Connection connection) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Service.setConnection :" + Thread.currentThread().getName());
		System.out.println("Service.setConnection :"+ connection.hashCode());
		this.connection = connection;
		dbService.setConnection(connection);
	}

	public void runMethod(){
		System.out.println("runMethod :" + Thread.currentThread().getName());
		System.out.println("runMethod :" +connection.hashCode());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public void runMethod(Connection connection){
		setConnection(connection);
	}
}
