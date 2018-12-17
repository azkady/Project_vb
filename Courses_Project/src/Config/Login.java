/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import Courses_Project.MainMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Login {
    
    Connection con;
    Statement stmt;
    Statement stat;
    ResultSet rs;
    
    public void Koneksi(){
        try{
            java.lang.Class.forName("com.mysql.jdbc.Driver");           
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
 
    private String username;
    private String password;
    
    public int Input_Login(){
        int i=0; 
               this.Koneksi();

        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Please Insert Username");
        }else{
            if(password.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Password");
            }else{
                try{   

                    String ins = "SELECT * FROM admin WHERE Username ='"+ username +"' AND Password = '"+ password +"'";
                    stat = con.createStatement();
                    ResultSet res = stat.executeQuery(ins);
                    if(res.next()){
                        JOptionPane.showMessageDialog(null, "Login Succses");
//                        this.setVisible(false);
                        new MainMenu().setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Username or Password Wrong");
                    }
                    i =1;
                }catch(SQLException sqlex){
                    JOptionPane.showMessageDialog(null, "SQL Syntax Error");
                }
            }
        }
        return i;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
