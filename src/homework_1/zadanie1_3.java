package homework_1;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class zadanie1_3 {
    public static void appendText(String text){
        try {
            FileWriter writter = new FileWriter("src/homework_1/text_file.txt", true);
            writter.write(text);
            writter.close();
        }

        catch (IOException e){
            System.out.println("Error...");
            System.out.println(e);
        }
    }
}
