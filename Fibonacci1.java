import java.util.Scanner;

/**
 * Created by evoznesensky on 1/23/18.
 */
public class Fibonacci1 {

  public static int fibonacci(int n) {
    int fibN = 0;

    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    int[] fa = new int[n];
    fa[0] = 1;
    fa[1] = 1;

    for (int i = 2; i < n; i++) {
      fa[i] = fa[i - 1] + fa[i - 2];
    }

    return fa[n - 1];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int fibN = fibonacci(n);
    System.out.println(n + ": " + fibN);
  }
}
