package jdbc_mysql;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtil {
	private static BasicDataSource bds;
	static{
		Properties p = new Properties();
		try {
			p.load(DBUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String pwd = p.getProperty("pwd");
			String init=p.getProperty("init");
			String max = p.getProperty("max");
			bds = new BasicDataSource();
			bds.setDriverClassName(driver);
			bds.setUsername(user);
			bds.setUrl(url);
			bds.setPassword(pwd);
			bds.setInitialSize(Integer.parseInt(init));
			bds.setMaxActive(Integer.parseInt(max));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
			return bds.getConnection();
	}
	public static void close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
