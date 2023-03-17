package test;

import org.junit.jupiter.api.Test;
import homework_1.zadanie1_3;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class zadanie3_test {
    @Test
    void checkIfTextApppended(){
        zadanie1_3.appendText("Test text");
        String text = "";
        try {
            File myObj = new File("src/homework_1/text_file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                text += data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String lastText = text.substring(text.length()-9);
        System.out.println(lastText);
        assert lastText.equals("Test text");
    }

}
