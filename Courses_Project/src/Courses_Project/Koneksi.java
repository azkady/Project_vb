package Courses_Project;

import java.sql.*;
import javax.swing.*;

public class Koneksi {
    static Connection con = null;
    public void Koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");           
            String url = "jdbc:mysql://localhost/courses_project";
            String username = "root";
            String password = "";           
            con = DriverManager.getConnection(url, username, password);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Lost Connection With Database");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Syntax Error To Database");
        }
    }
}
