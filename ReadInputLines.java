import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 0;
        
        Scanner sc = new Scanner(System.in);
        //System.out.println("Printing the file passed in:");
        while(sc.hasNextLine()) {
            i++;
            System.out.println(i + " " + sc.nextLine());
        }
        
    }
}
