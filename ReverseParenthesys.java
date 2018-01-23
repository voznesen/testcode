/**
 * Created by evoznesensky on 1/23/18.
 *
 * s: "a(bc)de"
 * s: "a(bcdefghijkl(mno)p)q"
 * s: "co(de(fight)s)"
 * s: "Code(Cha(lle)nge)"
 */
public class ReverseParenthesys {

  String reverseParentheses(String s) {
    System.out.println(s);
    char[] ar = s.toCharArray();
    int count = 0;
    boolean toTmp = false;
    boolean timeToReverse = false;

    StringBuilder sbMain = new StringBuilder();
    StringBuilder sbTmp = new StringBuilder();

    for (int i = 0; i < ar.length; i++) {

      if (! (toTmp || ('(' == ar[i] || ')' == ar[i]))) {
        sbMain.append(ar[i]);
        continue;
      }

      if ('(' == ar[i]) {
        if (count == 0) {
          sbTmp = new StringBuilder();
          toTmp = true;
        }

        sbTmp.append('(');

        count += 1;

      } else if (')' == ar[i]) {
        count -= 1;

        sbTmp.append(')');


        if (count == 0) {
          toTmp = false;
          timeToReverse = true;
        }

      } else {
        sbTmp.append(ar[i]);
      }

      if (timeToReverse) {
        reverse(sbTmp);
        //System.out.println(sbTmp);
        sbMain.append(sbTmp);
        System.out.println("sbMain after append: " + sbMain);
        timeToReverse = false;
      }

    }

    String sTmp = sbMain.toString();
    System.out.println("sbMain after loop: " + sbMain);

    if (sTmp.indexOf('(') > -1 && sTmp.indexOf('(') > -1) {
      return reverseParentheses(sTmp);
    } else {
      return sTmp;
    }

  }

  void reverse(StringBuilder sb) {
    sb.delete(0, 1);
    //System.out.println(sb.length());
    sb.deleteCharAt(sb.length() - 1);
    sb.reverse();

    int count = 0;
    for (int i = 0; i < sb.length(); i++) {
      if ('(' == sb.charAt(i)) {
        sb.setCharAt(i, ')');
        continue;
      }

      if (')' == sb.charAt(i)) {
        sb.setCharAt(i, '(');
        continue;
      }
    }

    System.out.println("End of sb: " + sb);

  }


}
