import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root",
                    "your_password");
            Statement statement = con.createStatement();
            String query = ("insert into student (id,name,age) values(4,'Mohit',40)");
            int update = statement.executeUpdate(query);
            System.out.println("Inserted "+update+" rows");

            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
