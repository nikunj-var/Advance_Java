package temp;


import java.sql.*;

public class test {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp12","root","Nikunj@123");
			Statement st = cn.createStatement();
			st.execute("create table product(pid int)");
			System.out.println("Connected");
			cn.close();
		}
		catch(Exception e) {
			System.out.println(e);

		}
	}
}
