import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        //double perc = (tipPercent + taxPercent) / (double) 100;
        //System.out.println(perc);
        double totalCostRaw = mealCost * (1 + (tipPercent + taxPercent)/(double)100);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalCostRaw);
      
        // Print your result
        System.out.printf("The total meal cost is %s dollars.", totalCost);
    }
}

