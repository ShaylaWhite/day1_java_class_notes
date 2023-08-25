package day02;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\shayl\\OneDrive\\Desktop\\Unit 2\\core-java\\src\\main\\java\\day02\\Hidden-Figures-Kathrine-WOMEN.pdf";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
