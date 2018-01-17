import java.util.*;
import java.lang.*;
import java.io.*;

class IsIsogram {

  public static void main (String[] args) {

    Scanner in = new Scanner(System.in);
    int T = in.nextInt();

    for (int i = 1; i <= T; i++) {
      boolean isIsogram = true;
      String word = in.next();
      HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();

      char[] wordChar = word.toCharArray();
      for (int j = 0; j < wordChar.length; j++ ) {
        if (map.containsKey(wordChar[j])) {
          isIsogram = false;
          break;
        } else {
          map.put(wordChar[j], true);
        }
      }
      if (isIsogram) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }
}
