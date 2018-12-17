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
public class Teacher {
    
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
    
    private  String teacher_id ;
    private  String teacher_name ;
    private  String teacher_lesson ;
    private  String teacher_contact ;
    
    private  String combo_column ;
    private  String kriteria ;
    
    public int Insert_Teacher (){
        int i = 0;
        this.Koneksi();
       
        if(teacher_id.equals("")){
            JOptionPane.showMessageDialog(null, "Please Insert Teacher ID");
        }else{
            if(teacher_name.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Teacher Name");
            }else{
                if(teacher_lesson.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Insert Teacher Lesson");
                }else{
                    if(teacher_contact.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Insert Teacher Contact");
                    }else{
                        if(teacher_contact.matches("[0-9]+")){
                            try{    
                                String ins = "INSERT INTO teacher (Teacher_ID, Teacher_Name, Teacher_Lesson,"
                                        + " Teacher_Contact) VALUES (?,?,?,?)";
                                PreparedStatement ps = con.prepareStatement(ins);
                                ps.setString(1, teacher_id);
                                ps.setString(2, teacher_name);
                                ps.setString(3, teacher_lesson);
                                ps.setString(4, teacher_contact);
                                int rt = ps.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Teacher Has Been Saved");

                                i = 1;
                            }catch(SQLException e){
                                JOptionPane.showMessageDialog(null, "Failed To Saved Teacher");
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
    public int Delete_Teacher (){
        int i = 0;
        this.Koneksi();
        if(teacher_id.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria TO Search, Update Or Delete");
            }else{
                try{
                    stat = con.prepareStatement("DELETE FROM teacher WHERE Teacher_ID = ?");
        
                    stat.setString(1, teacher_id);
                    stat.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Delete Data Succses");
                i = 1;
                }catch(SQLException qwef){
                JOptionPane.showMessageDialog(null, "Can't Show Table Teacher");
                }
                
            }
        
        return i;
    
    }
    
   public int Update_Teacher(){
        int i = 0;
        this.Koneksi();
        
        try{
            if(kriteria.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update Or Delete");
            }else{
                if(teacher_id.equals("")|teacher_name.equals("")|teacher_lesson.equals("")|teacher_contact.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
                }else{
                    if(teacher_contact.matches("[0-9]+")){
                        String str = "UPDATE teacher SET "
                                + "Teacher_ID ='"+teacher_id+"',"
                                + "Teacher_Name ='"+teacher_name+"',"
                                + "Teacher_Lesson ='"+teacher_lesson+"',"
                                + "Teacher_Contact ='"+teacher_contact+"'"
                                + "WHERE "+ combo_column +" = '"+ kriteria +"'";
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

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_lesson() {
        return teacher_lesson;
    }

    public void setTeacher_lesson(String teacher_lesson) {
        this.teacher_lesson = teacher_lesson;
    }

    public String getTeacher_contact() {
        return teacher_contact;
    }

    public void setTeacher_contact(String teacher_contact) {
        this.teacher_contact = teacher_contact;
    }

    public String getCombo_column() {
        return combo_column;
    }

    public void setCombo_column(String combo_column) {
        this.combo_column = combo_column;
    }

    public String getKriteria() {
        return kriteria;
    }

    public void setKriteria(String kriteria) {
        this.kriteria = kriteria;
    }


  
    
    
}
