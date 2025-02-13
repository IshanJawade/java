        // 1. import the package
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {

        //  2. load and register
        Class.forName("org.postgresql.Driver");

        //  3. create connection
        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "PostGreSQL";
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established");

        //  4. create and execute statement
        String sql = "select sid, sname, semail from student where sid = 1";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        System.out.println("Records found: " + rs.next());

        String name = rs.getString("sname");
        String email = rs.getString("semail");
        System.out.println("Student Name: " + name +"\nStudent Email: " + email);

        //  5. close
        con.close();
        System.out.println("Connection Closed");
    }
}
