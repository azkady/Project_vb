/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

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
public class Student {
    
    Connection con;
    Statement stmt;
    PreparedStatement stat;
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
    
    private String student_id;
    private String student_name;
    private String student_class;
    private String student_contact;
  
    private String table_column;
    private String kriteria;
    
    public int Insert_Student (){
        
       int i = 0;
       this.Koneksi();
       
        
        if(student_id.equals("")){
            JOptionPane.showMessageDialog(null, "Please Insert Student ID");
        }else{
            if(student_name.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Student Name");
            }else{
                if(student_class.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Insert Student Class");
                }else{
                    if(student_contact.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Insert Student Contact");
                    }else{
                        if(student_contact.matches("[0-9]+")){
                            try{    
                                String ins = "INSERT INTO student (Student_ID, Student_Name, Student_Class,"
                                            + " Student_Contact) VALUES (?,?,?,?)";
                                PreparedStatement ps = con.prepareStatement(ins);
                                ps.setString(1, student_id);
                                ps.setString(2, student_name);
                                ps.setString(3, student_class);
                                ps.setString(4, student_contact);
                                int rt = ps.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Student Has Been Saved");
                                
                                 i = 1;
                            }catch(SQLException e){
                                JOptionPane.showMessageDialog(null, "Failed To Saved Student");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Please Insert Contact Correctly");
                        }
                    }
                }
            }
        }
        return i;
        
    }
    
     public int Delete_Student (){
        int i = 0;
        this.Koneksi();
        if(kriteria.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria TO Search, Update Or Delete");
            }else{
                try{
                    stat = con.prepareStatement("DELETE FROM student WHERE student_ID = ?");
        
                    stat.setString(1, kriteria);
                    stat.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Delete Data Succses");
                i = 1;
                }catch(SQLException qwef){
                JOptionPane.showMessageDialog(null, "Can't Show Table Teacher");
                }
                
            }
        
        return i;
    
    }
    
    public int Update_Student(){
        int i = 0;
        this.Koneksi();
        
        try{
            if(kriteria.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update Or Delete");
            }else{
                if(student_id.equals("")|student_name.equals("")|student_class.equals("")|student_contact.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
                }else{
                    if(student_contact.matches("[0-9]+")){
                        String str = "UPDATE student SET "
                                + "Student_ID ='"+student_id+"',"
                                + "Student_Name ='"+student_name+"',"
                                + "Student_Class ='"+student_class+"',"
                                + "Student_Contact ='"+student_contact+"'"
                                + "WHERE "+ table_column +" = '"+ kriteria +"'";
                        PreparedStatement ps = con.prepareStatement(str);
                        int rs = ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Update Data Succses");
                        
                        i = 1;
                    }else{
                        JOptionPane.showMessageDialog(null, "Please Update Contact Correctly");
                    }
                }
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(null, "Failed Update Data Student");
        }
        
        
        return i;
    
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }

    public String getStudent_contact() {
        return student_contact;
    }

    public void setStudent_contact(String student_contact) {
        this.student_contact = student_contact;
    }

    public String getTable_column() {
        return table_column;
    }

    public void setTable_column(String table_column) {
        this.table_column = table_column;
    }

    public String getKriteria() {
        return kriteria;
    }

    public void setKriteria(String kriteria) {
        this.kriteria = kriteria;
    }

   
    
}
