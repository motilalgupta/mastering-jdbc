import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TYPE_SCROLL_INSENSITIVE {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root",
                    "your_password");
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String query = "select * from student";
            ResultSet rs = statement.executeQuery(query);
            System.out.println("----------TPYE_SCROLL_INSENSITIVE, CONCUR_READ_ONLY----------");
            rs.last();
            System.out.println("Last Row: "+ rs.getInt("id")+" | "+ rs.getString("name")+
                    " | "+ rs.getInt("age"));
            rs.absolute(2);
            System.out.println("Second Row: "+ rs.getInt("id")+" | "+ rs.getString("name")+
                    " | "+ rs.getInt("age"));
            rs.first();
            System.out.println("First Row: "+rs.getInt("id")+" | "+ rs.getString("name")+
                    " | "+rs.getInt("age"));

            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
