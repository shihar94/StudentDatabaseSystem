package msc2023msh;
import  msc2023msh.Student;
import java.util.ArrayList;

public interface StudentDao {

    public Student getStudent(int IndexNo);

    public ArrayList<Student> getALLStudent();

    public void insertStudent(Student student);

    //public void updateStudent(Student student);

    public void deleteStudent(int IndexNo);

}

