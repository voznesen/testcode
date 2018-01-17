import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        // Complete this function
        int z = 1;
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n - i - 1; j++) {
                s += " ";
            }
            for (int j = n - i - 1 ; j < n; j++) {
                s += "#";
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}

