package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vickydb", "root", "1234");
			Statement createStatement = connection.createStatement();
//			boolean execute = createStatement.execute("create table test(id int)");
//			boolean execute = createStatement.execute("alter table test add column Name varchar(40)");
//			boolean execute = createStatement.execute("insert into test values ( 1,'Raj')");
//			boolean execute = createStatement.execute("insert into test values ( 2,'Rambo')");
//			boolean execute1 = createStatement.execute("insert into test values ( 3,'Nikil')");
//			boolean execute2 = createStatement.execute("insert into test values ( 4,'Kamal')");
//			boolean execute = createSttatement.execute("insert into test1 values ({1,'Raj'},{2,'Kamal'},{3,'Rambo'},{4,'Kobe'})");
//			System.out.println(execute);
//			System.out.println(execute1);
//			System.out.println(execute2);
			ResultSet rs=createStatement.executeQuery("select * from test"); 
			while(rs.next()) {  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
