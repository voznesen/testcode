import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int[] arR = {1,2,3,4,5,6,7,8};
    int[] arL = {1,2,3,4,5,6,7,8};
    System.out.println(Arrays.toString(arR));
    rotateRight(3, arR);
    System.out.println(Arrays.toString(arR));

    // rotate left on 3
    int numberOfRotations = arL.length - 3;
    System.out.println(Arrays.toString(arL));
    rotateRight(numberOfRotations, arL);
    System.out.println(Arrays.toString(arL));
  }

  private static void rotateRight(int numberRotations, int[] ar) {
    int lastIndex = ar.length - 1;
    reverse(ar, 0, lastIndex);
    reverse(ar, 0, numberRotations - 1);
    reverse(ar, numberRotations, lastIndex);
  }

  private static void reverse(int[] ar, int startIndex, int endIndex) {
    while (startIndex < endIndex) {
      swap(ar, startIndex, endIndex);
      startIndex++;
      endIndex--;
    }
  }

  private static void swap(int[] ar, int i, int j) {
    int ii = i;
    int jj = j;
    int tmp = ar[i];
    ar[i] = ar[j];
    ar[j] = tmp;
  }
}
