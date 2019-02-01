import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TSP_Parser {
    String problemName;
    String fileName = "";
    BufferedReader readingFile;


    TSP_Parser(String path_and_filename) {

        try {
            String line;
            FileReader reader = new FileReader(path_and_filename);
            this.readingFile = new BufferedReader(reader);
            while ((line = readingFile.readLine()) != null) {
                System.out.println(line);
                line.trim();

            }
            readingFile.close();
        } catch (IOException e) {
            System.out.println(e.getStackTrace().toString());
        }
    }
}
