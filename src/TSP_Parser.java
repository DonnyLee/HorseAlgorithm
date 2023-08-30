import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TSP_Parser {
    String regexPattern2DCoordinate = "\\d+\\s+\\d+\\.\\d+\\s+\\d+\\.\\d+";
    String regexPattern3DCoordinate = "\\d+\\s+\\d+\\.\\d+\\s+\\d+\\.\\d+\\s+\\d+\\.\\d+";
    int typeDimension = 0;
    TSP_Parser(String path_and_filename) {
        try {
            String line = "";
            BufferedReader fileReader = new BufferedReader(new FileReader(path_and_filename));
            while ((line = fileReader.readLine()) != null) {
                if (typeDimension == 0) {
                    Pattern pattern = Pattern.compile(regexPattern3DCoordinate);
                    if (pattern.matcher(line).find()) {
                        this.typeDimension = 3;
                        break;
                    } else if (Pattern.compile(regexPattern2DCoordinate).matcher(line).find()) {
                        this.typeDimension = 2;
                    }
                }


            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e.getStackTrace().toString());
        }
    }
}
