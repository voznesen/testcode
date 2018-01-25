/**
 * Created by evoznesensky on 1/24/18.
 */
public class Permutations {

  public static void main(String[] args) {

    String input = "abc";

    permutation(input);
  }

  public static void permutation(String s) {
    permutation("", s);
  }

  private static void permutation(String p, String w) {
    if (w.isEmpty()) {
      System.out.println(p + w);
    } else {
      for (int i = 0; i < w.length(); i++) {
        permutation(
          p + w.charAt(i),
          w.substring(0, i) + w.substring(i + 1, w.length()));
      }
    }
  }
}
