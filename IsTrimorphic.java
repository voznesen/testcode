import java.util.*;
import java.lang.*;
import java.io.*;

class IsTrimorphic {

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();

    while (T-- > 0) {
      int num = in.nextInt();
      long cube = (long) Math.pow(num, 3);
      if (isLastDigits(cube, num)) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }

  private static boolean isLastDigits(long cube, int num) {
    String cubeString = Long.toString(cube);
    String numString = Integer.toString(num);

    if (numString.equals(cubeString.substring(cubeString.length() - numString.length()))) {
      return true;
    }
    return false;
  }
}
