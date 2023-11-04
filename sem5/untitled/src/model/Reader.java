package model;

import java.io.IOException;
import java.util.List;

public interface Reader {
    public List<Student> readStudent(String url) throws IOException;
}
