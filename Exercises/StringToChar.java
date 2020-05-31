import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class StringToChar
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to
        STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        int i = 0;
        if (T >= 1 && T <= 10) {
            do {
                String S = scan.nextLine();
                StringBuilder odd = new StringBuilder();
                StringBuilder even = new StringBuilder();
                char[] myCharArray = S.toCharArray();
                for (int x = 0; x < S.length(); x++) {
                    if (x % 2 == 0) {
                        even.append(myCharArray[x]);
                    } else {
                        odd.append(myCharArray[x]);
                    }
                }
                System.out.println(even.toString() + " " + odd.toString());
                i++;
            } while(i < T);
        } else {
            System.out.println("Invalid number");
        }
        scan.close();
    }
}