package connection.sdf;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseConfig {
	private static HikariDataSource dataSource;
	static {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:postgresql://172.30.10.136:5432/avengers_fcbs");
		config.setUsername("fcbsadm");
		config.setPassword("fcbsadm");
		config.setMaximumPoolSize(50); // Adjust the pool size as needed

		dataSource = new HikariDataSource(config);
	}

	public static HikariDataSource getDataSource() {
		return dataSource;
	}
}
