import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CONCUR_READ_ONLYDemo {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root",
                    "your_password");
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "select * from student";
            ResultSet rs = statement.executeQuery(query);
            System.out.println("Fetching data in not live update mode");
            Thread.sleep(10000);
            rs.beforeFirst();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " +
                        rs.getInt("age"));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
