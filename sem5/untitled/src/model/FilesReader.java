package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class FilesReader implements Reader{
    @Override
    public List<Student> readStudent(String url) throws IOException {
        File file = new File(url);
        if (!file.exists()) throw new FileNotFoundException("Файл " + file.getPath() + " не существует");
        try (FileReader fileReader = new FileReader(file)) {
            return parseFile(fileReader);
        }
    }
    private List<Student> parseFile(FileReader fr) {
        try{
            Gson gson = new Gson();
            List<Student> list;
            Type studentListType = new TypeToken<List<Student>>() {}.getType();
            list = gson.fromJson(fr, studentListType);
            return list;
        } catch (RuntimeException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
