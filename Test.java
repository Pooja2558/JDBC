import java.sql.*;

 
public class Test {

	public static void main(String[] args) throws Exception {
		//load driver
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("Select * from Student");
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	    }
	    rs.close();
	    st.close();
	    con.close();
		
	}

}
