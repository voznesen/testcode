import java.util.Scanner;

/**
 * Created by evoznesensky on 1/14/18.
 */
public class SumSquareOdds {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int T = in.nextInt();

    for (int j = 1; j <= T; j++) {
      int N = in.nextInt();
      long sum = 0;

      for (int i = 1; i <= N; i++) {
        int z = (i - 1) * 2 + 1;
        sum += Math.pow(z, 2.0);
      }

      System.out.println(sum);
    }
  }
}
