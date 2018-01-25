import java.io.*;

class IntegerToStringWithCommas {

  public static void main (String[] args) {
    // read from input
    int inputInt = 5678901;

    // convert integer to string, then to char array
    // iterate from end adding "," every 4 th pos, if not last; use StringBuillder
    String s;
    int digit;

    StringBuilder sb = new StringBuilder();

    while (inputInt != 0) {
      digit = inputInt % 10;
      sb.append(digit + "");
      inputInt /= 10;
    }
    sb.reverse();

    String sTemp = sb.toString();
    char[] arTmp = sTemp.toCharArray();

    System.out.println(arTmp);
    StringBuilder sbTemp = new StringBuilder();

    int countComPos = 0; // check if it should start from o

    for (int i = arTmp.length - 1; i >= 0; i--) {
      sbTemp.append(arTmp[i]);
      countComPos++;
//      System.out.println(arTmp[i] + " i: " + i + " countComPos: " + countComPos);
      if (countComPos == 3 && i != 0) {
        sbTemp.append(',');
        countComPos = 0; // check if zero
      }
    }

    sbTemp.reverse();
    System.out.println(sbTemp);
  }
}

