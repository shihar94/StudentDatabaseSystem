package msc2023msh;

import java.sql.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StudentDaoImpl manage = new StudentDaoImpl();
        //ArrayList<Student> students = manage.getALLStudent();
        Student stud = manage.getStudent(01);
        if(stud != null){
            System.out.println(stud.getIndexNo() + " " + stud.getName() + " " + stud.getDate() + " " + stud.getGpa());
        }
        String str="2015-03-31";
        Date date=Date.valueOf(str);//converting string into sql date
        //System.out.println(date);
        Student new1 = new Student(1,"Garp" ,date , 3.0);
        //manage.insertStudent(new1);
        //manage.deleteStudent(1);
    }
}