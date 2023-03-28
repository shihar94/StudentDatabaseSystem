package main.java.msc2023msh;
import main.java.msc2023msh.StudentDao;
import java.util.ArrayList;
import java.sql.*;
public class StudentDaoImpl implements StudentDao {
    private ArrayList<Student> students;

    public ArrayList<Student> getStduents() {
        return students;
    }

    @Override
    public Student getStudent(int IndexNo){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msc2023","root","");
            Statement stmt = con.createStatement();
            String statementSql = "select * from student where IndexNo=" + IndexNo;
            ResultSet rs = stmt.executeQuery(statementSql);
            while(rs.next()){
                Student student1 = new Student(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getDouble(4));
                return student1;
            }

        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Student not available in System");
        return null;
    }

    @Override
    public ArrayList<Student> getALLStudent(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msc2023","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            while(rs.next()){
                //System.out.println(rs.getInt(1) + " "+"  "+rs.getString(2)+"  "+rs.getDate(3)+" "+rs.getDouble(4));
                Student student1 = new Student(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getDouble(4));
                students.add(student1);
            }

        }catch(Exception e){
            System.out.println(e);
        }

        return students;
    }

    @Override
    public void insertStudent(Student student){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msc2023","root","");
            Statement stmt = con.createStatement();
            String statementSql = "INSERT INTO student (IndexNo,Name,DOB,GPA) VALUES ("+
                    +student.getIndexNo()+",\""+student.getName()+"\",\""+student.getDate()+"\","+student.getGpa()+")";
            int result = stmt.executeUpdate(statementSql);
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void deleteStudent(int IndexNo){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msc2023","root","");
            Statement stmt = con.createStatement();
            String statementSql = "delete from student where IndexNo = " + IndexNo;
            int result = stmt.executeUpdate(statementSql);
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }


    }

}
