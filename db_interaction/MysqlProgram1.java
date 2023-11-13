package db_interaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlProgram1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/program1", "root", "RadheShyam");
//		System.out.println(con.isValid(10));
       Statement stmt = con.createStatement();
       //create table
      /* String query="create table automation(Id integer,name varchar(30))";
       int status = stmt.executeUpdate(query);
     System.out.println(status);  */
       
       //alter table
//       String query="alter table automation modify name varchar(20)";
//      int status=stmt.executeUpdate(query);
//      System.out.println(status);
      
      //insert table
     /* String query="insert into automation value(1,'SnehaMadhuri'),(2,'NishanthKumar'),(3,'Sukanya'),(4,'Subramanyam')";
       int status=stmt.executeUpdate(query);
       System.out.println(status);
      */
       
       //update query
       /*String query="update automation set id=8 where name='SnehaMadhuri'";
       int status=stmt.executeUpdate(query);
       System.out.println(status);
       */
       
       //Select Query
       /*String query="select* from automation order by name";
       String query2="select* from automation order by id";
       ResultSet rs=stmt.executeQuery(query2);
       while(rs.next())
       {
    	   System.out.print("id:-"+rs.getInt("id")+" ");
    	   System.out.println("name:-"+rs.getString("name"));
       }
       stmt.close();
       */
       
       //Select Join Query
       String query="select emp.firstname,emp.lastname,emp.salary,dep.depName,dep.depid from employee emp "+"inner join department dep on emp.deptid=dep.depid";
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
       {
    	   System.out.print("FirstName:-"+rs.getString("firstname"));
    	   System.out.print(" "+"LastName:-"+rs.getString("lastname"));
    	   System.out.print(" "+"Salary:-"+rs.getString("salary"));
    	   System.out.print(" "+"depName:-"+rs.getString("depName"));
    	   System.out.println(" "+"depId:-"+rs.getString("depid"));
       }
       stmt.close();
       
       
	}

}
