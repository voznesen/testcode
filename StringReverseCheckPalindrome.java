import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] charArray = A.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

