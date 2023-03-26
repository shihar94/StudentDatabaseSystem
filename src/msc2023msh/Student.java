package msc2023msh;
import java.sql.Date;

public class Student {
    private int IndexNo;
    private String name;
    private Date date;
    private double gpa;

    public Student(int IndexNo, String name, Date date, double gpa) {
        this.IndexNo = IndexNo;
        this.name = name;
        this.date = date;
        this.gpa = gpa;
    }

    public int getIndexNo() {
        return IndexNo;
    }

    public void setIndexNo(int IndexNo) {
        this.IndexNo = IndexNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
