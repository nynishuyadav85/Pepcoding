import java.io.*;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("../input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("../output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dig = scn.nextInt();

        // int nod = 0;

        // for (int i = 1 ; i <= n ;  i++) {
        //  int div =  i % 10 ; 
        //  nod++;
        // }
        // System.out.println(nod);
    }
}