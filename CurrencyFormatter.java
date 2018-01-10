import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        String us = NumberFormat.getCurrencyInstance().format(payment);
        String india = java.text.NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.CHINA).format(payment);        
        String france = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

