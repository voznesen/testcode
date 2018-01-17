import java.io.*;
  import java.util.*;
  import java.text.*;
  import java.math.*;
  import java.util.regex.*;

public class NumberOfMax {

  static int birthdayCakeCandles(int n, int[] ar) {
    // Complete this function
    int highestSeen = -1;
    int totalSeen = 0;

    for (int i = 0; i < ar.length; i++) {
      if (highestSeen == ar[i]) {
        totalSeen += 1;
      }

      if (ar[i] > highestSeen) {
        highestSeen = ar[i];
        totalSeen = 1;
      }
    }

    return totalSeen;
  }

  public static void main(String[] args) {
    int n = 9;
    int[] ar = {3, 1, 2, 3, 2, 2, 2, 3, 3};

    int result = birthdayCakeCandles(n, ar);
    System.out.println(result);
  }
}