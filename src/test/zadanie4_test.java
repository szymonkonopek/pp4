package test;

import org.junit.jupiter.api.Test;
import homework_1.Zajecia;


public class zadanie4_test {
    @Test
    void addingStudent(){
        Zajecia zajecia = new Zajecia();
        zajecia.enrollStudent("Szymon");
        assert zajecia.toString().equals("[Szymon]");
    }

    @Test
    void addingToManyStudents(){
        Zajecia zajecia = new Zajecia();
        for (int i = 0; i < 11; i++){
            zajecia.enrollStudent("Szymon" + i);
        }

        assert zajecia.students.size() <= 10;
    }
}
