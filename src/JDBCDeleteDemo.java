import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeleteDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root",
                    "your_password");
            Statement statement = con.createStatement();
            String query = "delete from student where id = 4";
            int deleted = statement.executeUpdate(query);
            System.out.println("Deleted "+deleted+" rows");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
