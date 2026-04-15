import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root",
                    "your_password");
            String query = ("insert into student (id,name,age) values (?,?,?)");
            PreparedStatement pstmt = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the id to insert in the Table: ");
            int id = sc.nextInt();
            System.out.print("Enter the name to insert in the Table: ");
            String name = sc.next();
            System.out.print("Enter the age to insert in the Table: ");
            int age = sc.nextInt();

            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setInt(3,age);
            pstmt.executeUpdate();

//            pstmt.setInt(1,103);
//            pstmt.setString(2,"Ganga");
//            pstmt.setInt(3,38);
//            pstmt.executeUpdate();

            System.out.println("Multiple rows inserted");
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
