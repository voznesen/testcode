import java.util.*;
import java.lang.*;
import java.io.*;

class SumFifthPower2 {
  public static void main (String[] args) {
    //code
    Scanner in = new Scanner(System.in);

    int cases = in.nextInt();

    int case1 = in.nextInt();

    int case2 = in.nextInt();

    int case3 = in.nextInt();

    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;

    for (int i = 1; i <= case1; i++) {
      sum1 += Math.pow(i, 5);
      System.out.println(sum1);
    }

    for (int i = 1; i <= case2; i++) {
      sum2 += Math.pow(i, 5);
      System.out.println(sum2);
    }

    for (int i = 1; i <= case3; i++) {
      sum3 += Math.pow(i, 5);
      System.out.println(sum3);
    }

  }
}