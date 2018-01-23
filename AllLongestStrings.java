import java.util.Arrays;

/**
 * Created by evoznesensky on 1/20/18.
 */
public class AllLongestStrings {

  String[] allLongestStrings(String[] inputArray) {
    String[] res = new String[inputArray.length];
    int maxLength = 0;
    int currentLength = 0;
    int resIndex = 0;

    for (int i = 0; i < inputArray.length; i++) {
      String curString = inputArray[i];
      currentLength = curString.length();

      if (maxLength == currentLength) {
        res[resIndex++] = inputArray[i];
      } else if (maxLength < currentLength) {
        maxLength = currentLength;
        res = new String[inputArray.length - i];
        resIndex = 0;
        res[resIndex++] = inputArray[i];
      }
    }

    return Arrays.copyOfRange(res, 0, resIndex);
  }
}


