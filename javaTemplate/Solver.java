import java.io.*;
import java.util.*;

public class Solver {
    public static void solve(Scanner input, PrintStream output) throws IOException {
        int T = input.nextInt();
        for(int caseNum=0; caseNum<T; caseNum++){
            //...
            //algorithm
            //...
            output.println("Case #"+(caseNum+1)+": ");
        }
    }

    public static void main(String args[]) {
        File iFile = new File((args.length >= 1)? args[0] : "input.txt");
        File oFile = new File((args.length >= 2)? args[1] : "output.txt");
        try(Scanner input = new Scanner(iFile);
            PrintStream output = new PrintStream(oFile)
        ) {
            solve(input, output);
        } catch (IOException e) {
            System.out.println("Error in IO; Aborting");
            e.printStackTrace();
        }
    }
}

