import java.util.*;
import java.lang.*;
import java.io.*;

class DiceGuess {

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    int comp = 7;

    while(T-- > 0) {
      int face = in.nextInt();
      System.out.println("" + (comp - face));
    }
  }
}

