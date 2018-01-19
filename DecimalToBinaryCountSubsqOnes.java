import java.util.*;

public class DecimalToBinaryCountSubsqOnes {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String binaryString = Integer.toBinaryString(n);

    int currentNumOfOnes = 0;
    int maxNumOfOnes = 0;
    char[] ar = binaryString.toCharArray();
    for (int i = 0; i < ar.length; i++) {
      if ('1' == ar[i]) {
        currentNumOfOnes += 1;
      } else {
        currentNumOfOnes = 0;
      }

      maxNumOfOnes = Math.max(currentNumOfOnes, maxNumOfOnes);
    }
    System.out.println(maxNumOfOnes);
  }
}
