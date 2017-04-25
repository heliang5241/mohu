package day0425;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class ConnMysql {
	
	public static Connection getConnection() {
		Connection conn =null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1/ibeifeng?characterEncoding=utf8&useSSL=true";
			  String user="root";
			  String password="123456";
			  conn= (Connection) DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	  
	 public static void Query(Connection conn) throws SQLException, ClassNotFoundException{
		 
		 
	 	String sql = "select e.name,e.salary,d.name from emp e left join dept d on e.deptId = d.id where e.salary >9000 order by e.salary"; 
	 	ResultSet rs = conn.prepareStatement(sql).executeQuery();
	 	  while (rs.next()) {  
	          String name = rs.getString(1);  
	          String salary = rs.getString(2);  
	          String deptname = rs.getString(3);  
	          System.out.println(name   + "\t" + salary+ "\t" + deptname);  
	      }
	      rs.close();  

	}
public static void main(String args[]) throws ClassNotFoundException, SQLException{
	Connection conn =getConnection();
	Query(conn);

}
}
