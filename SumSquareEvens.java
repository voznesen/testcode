import java.util.*;
import java.lang.*;
import java.io.*;

class SunSquareEvens {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int j = 0; j < T; j++) {
      int N = sc.nextInt();
      long res = 0;

      for (int i = 1; i <= N; i++) {
        res += (long) Math.pow((double) i * 2, 2.0);
      }
      System.out.println(res);
    }
  }
}