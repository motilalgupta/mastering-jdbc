import java.sql.*;

public class
JDBCDemo {
    // 1. Load the Driver Class
    // 2. Get Connection from Database
    // 2. Create Statement
    // 3. Execute Query
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root",
                    "your_password");
            Statement statement = con.createStatement();
            String query = ("select * from student");
            ResultSet rs = statement.executeQuery(query);
            System.out.println("----------Read Data----------");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" | "+ rs.getString("name")+" | "+
                        rs.getInt("age"));
            }
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
