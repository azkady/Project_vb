/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import Config.CClass;
import Config.Login;
import Config.Schedule;
import Config.Student;
import Config.Teacher;
import Courses_Project.FormAdmin;
import Courses_Project.SearchUpdateClass;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import static sun.invoke.util.ValueConversions.ignore;

/**
 *
 * @author Acer
 */
public class testing {
    
    public testing() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    //LOGIN---------------------------------------------------------------------
    
        
        @Test
        public void testLogin(){
        Login testLog=new Login();
        testLog.setUsername("adni");
        testLog.setPassword("adni20");
        int i = testLog.Input_Login();
         Assert.assertEquals(1,i);
        }
    
        
    //CLASS---------------------------------------------------------------------
    
        

        @Test
        public void testAddClass() {
        CClass testLog=new CClass();
        testLog.setStudent_class("10SC1");
        testLog.setClass_name("TIS PNJ");      
        int i = testLog.Insert_Class();
        Assert.assertEquals(1,i);   
        }
        
        
        @Test
        public void testUpdateClass() {
        CClass testLog=new CClass();
        testLog.setStudent_class("5SC1");
        testLog.setClass_name("TIPS PNJ");
        testLog.setKriteria("5SC1");
        testLog.setCombo_column("Student_Class");    
        int i = testLog.Update_Class();
        Assert.assertEquals(1,i);
        }
        
        
        @Test
        public void testDeleteClass() {
        CClass testLog=new CClass();
        testLog.setStudent_class("5SC1");
        int i = testLog.Delete_Class();
        Assert.assertEquals(1,i);
        }
        
        
    //TEACHER-------------------------------------------------------------------
        
        
        
        @Test
        public void testAddTeacher() {
        Teacher testLog=new Teacher();
        testLog.setTeacher_id("T002");
        testLog.setTeacher_name("Rijal Nurdin");
        testLog.setTeacher_lesson("Java Mapping Programme");
        testLog.setTeacher_contact("082246004103");
        int i = testLog.Insert_Teacher();
        Assert.assertEquals(1,i);   
        }
        
        
        @Test
        public void testUpdateTeacher() {
        Teacher testLog=new Teacher();
        testLog.setTeacher_id("T002");
        testLog.setTeacher_name("Rijal Nurdin");
        testLog.setTeacher_lesson("SQL Server Programming");
        testLog.setTeacher_contact("089940314899");
        testLog.setKriteria("T002");
        testLog.setCombo_column("Teacher_ID"); 
        int i = testLog.Update_Teacher();
        Assert.assertEquals(1,i);
        }
        
        
        @Test
        public void testDeleteTeacher() {
        Teacher testLog=new Teacher();
        testLog.setTeacher_id("T002");
        int i = testLog.Delete_Teacher();
        Assert.assertEquals(1,i);
        }
        
        
    //STUDENT
        
        
        
        @Test
        public void testAddStudent() {
        Student testLog=new Student();
        testLog.setStudent_id("P001");
        testLog.setStudent_name("Rahil Septiadi");
        testLog.setStudent_class("2sc4");
        testLog.setStudent_contact("089965774899");
        int i = testLog.Insert_Student();
        Assert.assertEquals(1,i);   
        }
        
        
        @Test
        public void testUpdateStudent() {
        Student testLog=new Student();
        testLog.setStudent_id("P001");
        testLog.setStudent_name("Rahil Septiadi Darmawan");
        testLog.setStudent_class("3sc1");
        testLog.setStudent_contact("082245005199");
        testLog.setKriteria("P001");
        testLog.setTable_column("Student_ID"); 
        int i = testLog.Update_Student();
        Assert.assertEquals(1,i);
        }
        
        
        @Test
        public void testDeleteStudent() {
        Student testLog=new Student();
        testLog.setKriteria("P001");
        int i = testLog.Delete_Student();
        Assert.assertEquals(1,i);
        }

        
     //SCHEDULE
        
        
        @Test
        public void testAddSchedule() {
        Schedule testLog=new Schedule();
        testLog.setRoom_schedule("RS009");
        testLog.setRoom_id("R09");
        testLog.setTeacher_id("T006");
        testLog.setStudent_class("3sc12");
        testLog.setStart_time("14.00");
        testLog.setEnd_time("17.00");
        testLog.setDate("Kamis, 9 Desember 2018asdasdasd");
        int i = testLog.Insert_Schedule();
        Assert.assertEquals(1,i);
         
        }
        
        
        @Test
        public void testUpdateSchedule() {
        Schedule testLog=new Schedule();
        testLog.setRoom_schedule("RS009");
        testLog.setRoom_id("R02");
        testLog.setTeacher_id("T005");
        testLog.setStudent_class("2sc4");
        testLog.setStart_time("14.00");
        testLog.setEnd_time("17.00"); 
        testLog.setDate("Kamis, 9 Desember 2018");
        testLog.setKriteria ("RS009");
        testLog.setTable_column("Room_Schedule"); 
        int i = testLog.Update_Schedule();
        Assert.assertEquals(1,i);
        }
        
       
        @Test
        public void testDeleteSchedule() {
        Schedule testLog=new Schedule();
        testLog.setKriteria("RS009");
        testLog.setTable_column("Room_Schedule"); 
        int i = testLog.Delete_Schedule();
        Assert.assertEquals(1,i);
        }
       
//        SEARCH ALL THE THING
        
//        @Ignore
//        @Test
//        public void testSearch_Class (){
//            SearchUpdateClass testLog = new SearchUpdateClass();
//            testLog.setA("Student_Class");
//            testLog.setB("2sc4");
//            int i = testLog.Search();
//             Assert.assertEquals(1,i);
//        
//        }
}
