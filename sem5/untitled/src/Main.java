import model.FilesReader;
import model.Student;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        FilesReader filesReader = new FilesReader();
        final double passingNote = 4.5;
        try {
            List<Student> studentList = filesReader.readStudent("resource/students.json");
            List<Student> studentExclusion = studentList.stream()
                    .filter(student -> student.getAverageNote() > passingNote)
                    .sorted((student1, student2) -> Double.compare(student2.getAverageNote(), student1.getAverageNote()))
                    .collect(Collectors.toList());
            System.out.println("Хорошие студенты: \n" + studentExclusion);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}