/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import Courses_Project.Koneksi;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Acer
 */
public class CClass {
    
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
    
    private String student_class;
    private String class_name;
    
    private String kriteria;
    private String combo_column;
    
    private String table_class;
    
    private DefaultTableModel model;
    
    
    
    
    public int Insert_Class (){
       int i = 0;
       this.Koneksi();
        if(student_class.equals("")){
            JOptionPane.showMessageDialog(null, "Please Insert Student Class");
        }else{
            if(class_name.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Class Name");
            }else{
                try{    
                    String ins = "INSERT INTO class (Student_Class, Class_Name) VALUES (?,?)";
                    PreparedStatement ps = con.prepareStatement(ins);
                    ps.setString(1, student_class);
                    ps.setString(2, class_name);
                    int rt = ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Class Has Been Saved");
                    
                     i = 1;
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Failed To Saved Class");
                }
            }
        }
        return i;
    
    }
    
    
    
    public int Delete_Class (){
        int i = 0;
        this.Koneksi();
        if(student_class.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria TO Search, Update Or Delete");
            }else{
                try{
                    stat = con.prepareStatement("DELETE FROM class WHERE Student_Class = ?");
        
                    stat.setString(1, student_class);
                    stat.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Delete Data Succses");
                i = 1;
                }catch(SQLException qwef){
                JOptionPane.showMessageDialog(null, "Can't Show Table Class");
                }
                
            }
        
        return i;
    
    }
    
    public int Update_Class (){
        int i = 0;
        this.Koneksi();
        
        try{
            if(kriteria.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Serach, Update Or Delete");
            }else{
                if(student_class.equals("")|class_name.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
                }else{
                    String str = "UPDATE class SET "
                    + "Student_Class ='"+student_class+"',"
                    + "Class_Name ='"+class_name+"'"
                    + "WHERE "+ combo_column +" = '"+ kriteria +"'";
                    PreparedStatement ps = con.prepareStatement(str);
                    int rs = ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update Data Succses");
                    
                    i=1;
                }
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(null, "Failed Update Data Class");
        }
    
        return i;
    }
    
    
    

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getTable_class() {
        return table_class;
    }

    public void setTable_class(String table_class) {
        this.table_class = table_class;
    }

    public String getKriteria() {
        return kriteria;
    }

    public void setKriteria(String kriteria) {
        this.kriteria = kriteria;
    }

    public String getCombo_column() {
        return combo_column;
    }

    public void setCombo_column(String combo_column) {
        this.combo_column = combo_column;
    }
    
    
    
}
