public class IsValidNumericInString {

  public static boolean isNumeric(String string) {
    return string.matches("^[-+]?\\d?(\\.\\d+)?$");
  }


  public static void main(String[] args) {

    String input = "-.0";

    System.out.println(input + ": " +isNumeric(input));
  }
}
