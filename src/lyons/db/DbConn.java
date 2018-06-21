package lyons.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * 连接mysql数据库
 * @author lyons(hzd)
 */
public class DbConn
{
	private static String user = "hzd";
	private static String passwd = "hero0630";
	
	private static String url = "jdbc:mysql://localhost:3306/shopping";
	private static String driver = "com.mysql.jdbc.Driver";
	/**
	 * 静态块加载驱动，避免重复加载
	 */
	static{
		try{
			Class.forName(driver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	/**
	 * 单例模式返回数据库链接
	 */
	public static  Connection getconn(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,user,passwd);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("fail to access to db");
		}
		return conn;
	}

}
