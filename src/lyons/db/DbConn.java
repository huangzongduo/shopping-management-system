package lyons.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * ����mysql���ݿ�
 * @author lyons(hzd)
 */
public class DbConn
{
	private static String user = "hzd";
	private static String passwd = "hero0630";
	
	private static String url = "jdbc:mysql://localhost:3306/shopping";
	private static String driver = "com.mysql.jdbc.Driver";
	/**
	 * ��̬����������������ظ�����
	 */
	static{
		try{
			Class.forName(driver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	/**
	 * ����ģʽ�������ݿ�����
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
