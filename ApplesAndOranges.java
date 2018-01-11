import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ApplesAndOranges {

  static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
    // Complete this function
    int[] result = new int[2];
    //result[0] = 0;
    //result[1] = 0;
    for (int r = 0; r < result.length; r++) {
      result[r] = 0;
    }
    for (int i = 0; i < apple.length; i++) {
      //System.out.println("a:" + a + ",  apple[i]:" + apple[i] + ", s:" + s + ", t:" + t);
      if (a + apple[i] >= s && a + apple[i] <= t) {
        result[0] += 1;
      }
    }

    for (int i = 0; i < orange.length; i++) {
      if (b + orange[i] >= s && b + orange[i] <= t) {
        result[1] += 1;
      }
    }

    return result;
  }

  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int s = in.nextInt();
//    int t = in.nextInt();
//    int a = in.nextInt();
//    int b = in.nextInt();
//    int m = in.nextInt();
//    int n = in.nextInt();


    int s = 2;
    int t = 3;
    int a = 1;
    int b = 5;
    int m = 1;
    int n = 1;

    int[] apple = new int[m];
    for(int apple_i = 0; apple_i < m; apple_i++){
      apple[apple_i] = 2; // in.nextInt();
    }
    int[] orange = new int[n];
    for(int orange_i = 0; orange_i < n; orange_i++){
      orange[orange_i] = -2; // in.nextInt();
    }
    int[] result = appleAndOrange(s, t, a, b, apple, orange);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
    }
    System.out.println("");
  }
}

