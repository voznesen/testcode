import java.util.HashMap;

/**
 * Created by evoznesensky on 1/9/18.
 */
public class RomanToDecimal {

  public static void main(String[] args) {
    String input = "cxlvii";
    System.out.println(convert(input));
  }

  private static int convert(String input) {
    if (null == input) {
      return 0;
    }

    int decimal = 0;
    char[] romanArray = input.toCharArray();

    HashMap romanToDecimal = new HashMap<Character, Integer>();
    romanToDecimal.put('i', 1);
    romanToDecimal.put('v', 5);
    romanToDecimal.put('x', 10);
    romanToDecimal.put('l', 50);
    romanToDecimal.put('c', 100);

    if (null == input) {
      return 0;
    }

    if (1 == input.length()) {
      return romanToDecimal.containsKey(romanArray[0]) ? (int) romanToDecimal.get(romanArray[0]) : 0;
    }

    // "cxlxvii";
    for (int i = 0; i < romanArray.length - 1; i++) {
      int current = (int) romanToDecimal.get(romanArray[i]);
      int next = (int) romanToDecimal.get(romanArray[i + 1]);

      if (current >= next) {
        decimal += current;
      } else if (current < next) {
        decimal -= current;
      }
    }
    decimal += (int) romanToDecimal.get(romanArray[romanArray.length - 1]);

    return decimal;
  }
}
