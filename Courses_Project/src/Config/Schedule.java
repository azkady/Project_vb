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
public class Schedule {
    
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
    
    private String room_schedule ;
    private String room_id ; 
    private String teacher_id ;
    private String student_class ;
    private String start_time ; 
    private String end_time ;
    private String date ;
    
    private String table_column;
    private String kriteria;
    
    
    public int Insert_Schedule (){
        int i = 0;
        this.Koneksi();
        
        if(room_schedule.equals("")){
            JOptionPane.showMessageDialog(null, "Please Insert Room Schedule");
        }else{
            if(teacher_id.equals("")){
              JOptionPane.showMessageDialog(null, "Please Insert Teacher ID");  
            }else{
                if(student_class.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Insert Student Class");
                }else{
                    if(start_time.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Insert Start Time");
                    }else{
                        if(end_time.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Insert End Time");
                        }else{
                            if(date.equals("")){
                                JOptionPane.showMessageDialog(null, "Please Insert Date");
                            }else{
                                try{    
                                    String ins = "INSERT INTO room_schedule (Room_Schedule, Room_ID, Teacher_ID, "
                                            + "Student_Class, Start_Time, End_Time, Date) VALUES (?,?,?,?,?,?,?)";
                                    PreparedStatement ps = con.prepareStatement(ins);
                                    ps.setString(1, room_schedule);
                                    ps.setString(2, room_id);
                                    ps.setString(3, teacher_id);
                                    ps.setString(4, student_class);
                                    ps.setString(5, start_time);
                                    ps.setString(6, end_time);
                                    ps.setString(7, date);
                                    int rt = ps.executeUpdate();
                                    JOptionPane.showMessageDialog(null, "Room Schedule Has Been Saved");
                                    
                                    i = 1;
                                }catch(SQLException sqlex){
                                    JOptionPane.showMessageDialog(null, "Failed To Saved Room Schedule");
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return i;
    
    }
    
    public int Delete_Schedule (){
        int i = 0;
        this.Koneksi() ;
        
        try{
            if(kriteria.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update or Delete");
            }else{
                String str = "DELETE FROM room_schedule WHERE "+ table_column +" = '"+ kriteria +"'";
                PreparedStatement ps = con.prepareStatement(str);
                int rs = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Delete Data Succses");
                i = 1;
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(null, "Can't Show Table Room Schedule");
        }
        return i;
    
    }
    
    public int Update_Schedule(){
    
        int i = 0;
        this.Koneksi() ;

        try{
            
            if(kriteria.equals("")){
                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update or Delete");
            }else{
                if(room_schedule.equals("")|teacher_id.equals("")|student_class.equals("")|start_time.equals("")|end_time.equals("")|date.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
                }else{
                    String str = "UPDATE room_schedule SET "
                    + "Room_Schedule ='"+room_schedule+"',"
                    + "Room_ID ='"+room_id+"',"
                    + "Teacher_ID ='"+teacher_id+"',"
                    + "Student_Class ='"+student_class+"',"
                    + "Start_Time ='"+start_time+"',"
                    + "End_Time ='"+end_time+"',"
                    + "Date ='"+date+"'"
                    + "WHERE "+ table_column +" = '"+ kriteria +"'";
                    PreparedStatement ps = con.prepareStatement(str);
                    int rs = ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update Data Succses");
                    
                    i = 1;
                }
            }
        }catch(SQLException qwef){
            JOptionPane.showMessageDialog(null, "Failed Update Data Room Schedule");
        }
        
        return i;
    
    }

        
//        public int Update_Schedule(){
//        int i = 0;
//        this.Koneksi();
//        
//        try{
//            if(kriteria.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update Or Delete");
//            }else{
//                if(room_schedule.equals("")|teacher_id.equals("")|student_class.equals("")|start_time.equals("")|end_time.equals("")|date.equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
//                }else{
//                    if(start_time.matches("[0-9]+")){
//                        String str = "UPDATE room_schedule SET "
//                    + "Room_Schedule ='"+room_schedule+"',"
//                    + "Room_ID ='"+room_id+"',"
//                    + "Teacher_ID ='"+teacher_id+"',"
//                    + "Student_Class ='"+student_class+"',"
//                    + "Start_Time ='"+start_time+"',"
//                    + "End_Time ='"+end_time+"',"
//                    + "Date ='"+date+"'"
//                    + "WHERE "+ table_column +" = '"+ kriteria +"'";
//                        PreparedStatement ps = con.prepareStatement(str);
//                        int rs = ps.executeUpdate();
//                        JOptionPane.showMessageDialog(null, "Update Data Succses");
//                        
//                        i = 1;
//                    }else{
//                        JOptionPane.showMessageDialog(null, "Please Update Start Time Correctly");
//                    }
//                }
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(null, "Failed Update Data Schedule");
//        }
//        
//        
//        return i;
//    
//    }
        
        
//        try{
//            
//            if(kriteria.equals("")){
//                JOptionPane.showMessageDialog(null, "Please Insert Kriteria To Search, Update or Delete");
//            }else{
//                if(room_schedule.equals("")|teacher_id.equals("")|student_class.equals("")|start_time.equals("")|end_time.equals("")|date.equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Insert All Data");
//                }else{
//                    String str = "UPDATE room_schedule SET "
//                    + "Room_Schedule ='"+room_schedule+"',"
//                    + "Room_ID ='"+room_id+"',"
//                    + "Teacher_ID ='"+teacher_id+"',"
//                    + "Student_Class ='"+student_class+"',"
//                    + "Start_Time ='"+start_time+"',"
//                    + "End_Time ='"+end_time+"',"
//                    + "Date ='"+date+"'"
//                    + "WHERE "+ table_column +" = '"+ kriteria +"'";
//                    PreparedStatement ps = con.prepareStatement(str);
//                    int rs = ps.executeUpdate();
//                    JOptionPane.showMessageDialog(null, "Update Data Succses");
//                    
//                    i = 1;
//                }
//            }
//        }catch(SQLException qwef){
//            JOptionPane.showMessageDialog(null, "Failed Update Data Room Schedule");
//        }
//        
//        return i;
//    }
    

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
    
    public String getRoom_schedule() {
        return room_schedule;
    }

    public void setRoom_schedule(String room_schedule) {
        this.room_schedule = room_schedule;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
