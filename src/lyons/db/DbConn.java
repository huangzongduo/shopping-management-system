package lyons.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * ����oracle���ݿ�
 * @author lyons(zhanglei)
 */
public final class DbConn
{
	public static  Connection getconn()
	{
		Connection conn = null;
		
		String user   = "sys";
		String passwd = "sys";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";//orclΪoracle���ݿ�ʵ������
		System.out.println("4");
		//�Ѽ���������
		
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
		}catch (ClassNotFoundException e)
		{
			System.out.println("zhoabudao");
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url,user,passwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
