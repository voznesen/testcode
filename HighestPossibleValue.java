import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by evoznesensky on 1/31/18.
 *
 * The program find the highest possible value of all input blocks, please not highest value will be evaluated as highest numeric value,
 * i.e. with respect to number max/min number limitation of Java
 *
 * Implementation:
 *
 * Approach: To get the highest value we should sort the digits in descendant order (NB! phase 2 check that the result is a valid number)
 * Create array with 10 members where index will correspondent to the number from input and
 * the value will hold the count of occurrences of this number
 * Loop through the array starting from the end and generate string with digit 9 (last index), taken <value> times.
 * Find max values by comparing values of sorted blocks as numbers
 * Print out the highest possible value
 *
 * Complexity - we go through the input once, i.e O(n)!!!
 */
public class HighestPossibleValue {

  private static void foo(String[] blocks) {
    System.out.println("blocks: " + Arrays.asList(blocks));
    // validate blocks
    if (blocks == null || blocks.length == 0) {
      System.out.println("Highest possible value has not been found!");
      return;
    }

    String[] sortedBlocks = new String[blocks.length];
    for (int k = 0; k < blocks.length; k++) {
      if (blocks[k] == null) {
        sortedBlocks[k] = null;
        continue;
      }
      String curString = blocks[k];
      System.out.println("curString: " + curString);
      // the int[] array initialized to zeros by default
      int[] a = new int[10];

      for (Character c : curString.toCharArray()) {
        int d = Character.getNumericValue(c);
        a[d] = a[d] + 1;
      }

      // StringBuilder is used to store characters (digits) to generate the result
      StringBuilder sb = new StringBuilder();
      for (int i = a.length - 1; i >= 0; i--) {
        int count = a[i];
        String t = Integer.toString(i);
        for (int j = 0; j < count; j++) {
          sb.append(t);
        }
      }
      System.out.println(sb);
      sortedBlocks[k] = sb.toString();
    }

    System.out.println("sortedBlocks: " + Arrays.asList(sortedBlocks));

    // we have array of sorted blocks
    // the highest possible value has the longest block, that is not zero(s);
    // if more than one are the same length as the longest block, then compare them lexicographically
    int indexOfTheLongest = -1;
    int maxLength = 0;

    for (int i = 0; i < sortedBlocks.length; i++) {
      if (sortedBlocks[i] == null) {
        continue;
      }
      String curSortedBlock = sortedBlocks[i];
      int curLength = 0;
      int curIndex = i;
      if (curSortedBlock.substring(0,1) == "0") {
        curLength = 0;
      } else {
        curLength = curSortedBlock.length();
      }

      if (curLength > maxLength) {
        maxLength = curLength;
        indexOfTheLongest = i;
      } else if (curLength == maxLength) {
        // compare two strings of the same length lexicographically
        int compareResult = curSortedBlock.compareTo(sortedBlocks[indexOfTheLongest]);
        if (compareResult > 0) {
          // new highest
          indexOfTheLongest = i;
        }
      }
    }

    // check if highest has not been found
    if (indexOfTheLongest == -1) {
      System.out.println("Highest possible value has not been found!");
      return;
    }

    System.out.println("Highest possible value: " + blocks[indexOfTheLongest]);
  }

  public static void main(String[] argv) {
    // First input value is number of input blocks
    // Take the block of numbers from input as string
    Scanner in = new Scanner(System.in);
    int numBlocks;
    try {
      numBlocks = in.nextInt();
    } catch (Exception e) {
      System.out.println("Please provide valid number of blocks!");

      return;
    }

    System.out.println("numBlocks: " + numBlocks);
    String[] blocks = new String[numBlocks];
    int i = 0;
    while (numBlocks-- > 0) {
      String block = in.next();
      // validate the input right away
      try {
        Double d = Double.parseDouble(block);
        blocks[i++] = block;
      } catch (Exception e) {
        // do nothing
      }
    }

    // output the highest value
    foo(blocks);

    in.close();
  }
}
