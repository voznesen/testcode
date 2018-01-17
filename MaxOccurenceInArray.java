import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MaxOccurenceInArray {

  static int birthdayCakeCandles(int n, int[] arry) {
    Map<Integer, Integer> newMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());
    int num = 0;
    int count = 0;
    for (int i = 0; i < arry.length; i++) {
      if (newMap.containsKey(arry[i])) {
        count = newMap.get(arry[i]);
        newMap.put(arry[i], ++count);
      } else {
        newMap.put(arry[i], 1);
      }
    }

    Set<Map.Entry<Integer, Integer>> set = newMap.entrySet();
    List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
      @Override
      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return (o2.getValue()).compareTo(o1.getValue());
      }
    });

    for (Map.Entry<Integer, Integer> entry : list) {
      //System.out.println(entry.getKey() + " ==== " + entry.getValue());
      num = entry.getValue();
      break;
    }
    return num;
  }

  public static void main(String[] args) {

    int n = 5;
    int[] ar = {1,2,2,2,2,3,3,};

    int result = birthdayCakeCandles(n, ar);
    System.out.println(result);
  }
}
