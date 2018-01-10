import java.util.Calendar;

/**
 * Created by evoznesensky on 1/10/18.
 */
public class DayOfWeek {

  public static void main(String[] args) {
        /*
        * Write your code here.
        */
    Calendar c = Calendar.getInstance();
    //Set month, starts with JANUARY = 0 !!
    c.set(Integer.parseInt("2015"), Integer.parseInt("08") - 1, Integer.parseInt("05"));
    //c.set(2004, 2, 29);

    System.out.println(c.get(Calendar.YEAR) + " " + c.get(Calendar.MONTH) + " " + c.get(Calendar.DAY_OF_MONTH));

    String weekDay = "";
    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
    System.out.println(dayOfWeek);

    if (Calendar.MONDAY == dayOfWeek) weekDay = "monday";
    else if (Calendar.TUESDAY == dayOfWeek) weekDay = "tuesday";
    else if (Calendar.WEDNESDAY == dayOfWeek) weekDay = "wednesday";
    else if (Calendar.THURSDAY == dayOfWeek) weekDay = "thursday";
    else if (Calendar.FRIDAY == dayOfWeek) weekDay = "friday";
    else if (Calendar.SATURDAY == dayOfWeek) weekDay = "saturday";
    else if (Calendar.SUNDAY == dayOfWeek) weekDay = "sunday";

    System.out.println(weekDay);


  //    Calendar cal = Calendar.getInstance();
  //    cal.set(Calendar.DAY_OF_MONTH, 29); //Set Day of the Month, 1..31
  //    cal.set(Calendar.MONTH,2); //Set month, starts with JANUARY = 0
  //    cal.set(Calendar.YEAR,2004); //Set year
  //    System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //Starts with Sunday, 6 = friday

    }
}
