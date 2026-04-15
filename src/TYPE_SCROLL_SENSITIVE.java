import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class TYPE_SCROLL_SENSITIVE {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root",
                    "your_password");
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery("select * from student");
            System.out.println("-----------Original Data----------");
            Map<Integer,Integer> original = new HashMap<>();
            while (rs.next()){
                original.put(rs.getInt("id"),rs.getInt("age"));
            }
            System.out.println(original);

            System.out.println("-----Reflect updated data-----");
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
