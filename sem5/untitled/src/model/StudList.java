package model;

import java.util.List;

public class StudList<Student> {
    private List<Student> students;

    public void addStud(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }
}
