package connection.sdf;

import java.sql.Connection;

public class DBService {
	private Connection connection;

	public DBService() {
	}

	public void setConnection(Connection connection) {
		System.out.println("DBService.setConnection : "+ connection.hashCode());
		this.connection = connection;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
