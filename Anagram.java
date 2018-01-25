import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by evoznesensky on 1/23/18.
 */
public class Anagram {

  public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    ArrayList<Character> al1 = new ArrayList<Character>();
    ArrayList<Character> al2 = new ArrayList<Character>();
    for(int i = 0; i < s1.length(); i++){
      al1.add(s1.charAt(i));
      al2.add(s2.charAt(i));
    }
    Collections.reverse(al2);

    for (int i = 0; i < al1.size(); i++) {
      if (al1.get(i) != al2.get(i)) {
        return false;
      }
    }


    return true;
  }

  public static void main(String[] args) {

    String s1 = "base";
    String s2 = "esab";

    boolean isAnagram = isAnagram(s1, s2);
  }
}
