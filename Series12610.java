import java.util.Scanner;

/**
 * Created by evoznesensky on 1/14/18.
 */
public class Series12610 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();

    while(T-- > 0) {
      int num = in.nextInt();
      long[] series = new long[num + 1];
      long nThTerm = 0;
      series[0] = 0;
      for (int i = 1; i <= num; i++) {
        series[i] = series[i - 1] + i;
        if (i == num) {
          System.out.println(series[i]);
        }
      }
    }
  }
}
