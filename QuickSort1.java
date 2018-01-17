/**
 * Created by evoznesensky on 1/15/18.
 */
public class QuickSort1 {

  public static void main(String[] args) {

    int[] input = new int[]{4,2,1,3,5};

    int[] sorted = qss(input);

    String a = "a";
  }

  private static int[] qss(int[] data) {
    if (data.length < 1) {
      return data;
    }

    int pivotIndex = data.length / 2;
    int pivotValue = data[pivotIndex];

    int leftCount = 0;
    for (int i = 0; i < data.length; i++) {
      if (data[i] < pivotValue) {
        ++leftCount;
      }
    }

    int[] left = new int[leftCount];
    int[] right = new int[data.length - leftCount - 1];

    int l = 0;
    int r = 0;

    for (int i = 0; i < data.length; i++) {
      if (i == pivotIndex) {
        continue;
      }

      int val = data[i];

      if (data[i] < pivotValue) {
        left[l++] = val;
      } else {
        right[r++] = val;
      }
    }

    // sort the subsets

    left = qss(left);
    right = qss(right);

    // combine sorted
    System.arraycopy(left, 0, data, 0, left.length);
    System.arraycopy(right, 0, data, left.length + 1, right.length);

    return data;
  }
}
