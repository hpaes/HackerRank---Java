import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class getCurrency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale localeINDIA = new Locale("en", "IN");

        NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyCH = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat currencyIN = NumberFormat.getCurrencyInstance(localeINDIA);

        String us  = currencyUS.format(payment);
        String china = currencyCH.format(payment);
        String france = currencyFR.format(payment);
        String india = currencyIN.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
