import java.sql.*;

public class GetWholeDatabase {
    public static void main(String[] args) throws Exception {
        // create connection
        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "PostGreSQL";
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established");

        // create and execute statements
        String readSQL = "select * from student";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(readSQL);

        // rs.next jumps to the next row in the table and returns true if it successes else false
        while(rs.next()){
            System.out.print(rs.getInt("sid")+" ");
            System.out.print(rs.getString("sname") + " ");
            System.out.println(rs.getString("semail"));
        }

        // Create record
        String createSQL = "insert into student values (5, 'Max Payne', 'maxpayne@remedy.com')";
        int row = st.executeUpdate(createSQL);
        if(row > 0) System.out.println(row + " rows affected");
        else System.out.println("somethings wrong");

        // Update recode
        String updateSQL = "update student set sname='Ishan Jawade' where sid=1";
        row = st.executeUpdate(updateSQL);
        if(row > 0) System.out.println(row + " rows affected");
        else System.out.println("somethings wrong");

        // delete record
        String deleteSQL = "delete from student where sname='Pratik Kakade'";
        row = st.executeUpdate(deleteSQL);
        if(row > 0) System.out.println(row + " rows affected");
        else System.out.println("somethings wrong");

        // close the connection
        con.close();
        System.out.println("Connection closed");
    }
}
