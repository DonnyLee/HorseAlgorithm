import java.io.IOException;
import java.util.Random;

public class HorseAlgorithm {
    private Random rand = new Random();
    private int[] problem1D;


    public HorseAlgorithm () {
        System.out.println("Implementation");
    }

    public int[] generateProblem1D(int length) {
        int[] ret = new int[length];
        for (int i = 0; i < length ; i++) {
            ret[i] = rand.nextInt(100);
        }
        return ret;
    }




    public static void main(String[] args) throws IOException {
        String problemPath = "source\\berlin52.tsp";
//        TSP_Parser parserTest = new TSP_Parser(problemPath);

        String testString = "ABC: DEF";
        System.out.println(testString.split(":")[1]);



    }
}

