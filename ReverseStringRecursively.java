/**
 * Created by evoznesensky on 1/24/18.
 */
public class ReverseStringRecursively {

  public static String reverseRecursively(String str) {

    System.out.println("Beginning of reverseRecursively(): " + str);

    //base case to handle one char string and empty string
    if (str.length() < 2) {
      return str;
    }

    String res1 = reverseRecursively(str.substring(1));
    System.out.println("Res1: " + res1);

    String res2 =  "" + str.charAt(0);
    System.out.println("Res2: " + res2);

    String res = res1 + res2;

    System.out.println("Res: " + res);
    System.out.println("*************");

    return res;
  }


  public static void main(String[] args) {

    String inputS = "How";

    String reversed = reverseRecursively(inputS);

    System.out.println(reversed);
  }
}
