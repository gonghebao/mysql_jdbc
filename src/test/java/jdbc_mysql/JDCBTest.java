package jdbc_mysql;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.Test;

public class JDCBTest {
	@Test
	public void test(){
		Connection conn = null;
		try {
			conn = DBTool.getConnection();
			Statement smt = conn.createStatement();
			String sql = "CREATE TABLE user(id int(100),name char(20) ,salary double)";
			smt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBTool.close(conn);
		}
	}
	@Test
	public void test2(){
		Connection conn = null;
		try {
			conn = DBTool.getConnection();
			Statement smt = conn.createStatement();
			String sql = "INSERT INTO user VALUES(1,'bob',7000)";
			smt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBTool.close(conn);
		}
	}
	@Test
	public void test3(){
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			Statement smt = conn.createStatement();
			String sql = "INSERT INTO user VALUES(2,'tom',7000)";
			smt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBTool.close(conn);
		}
	}
}
