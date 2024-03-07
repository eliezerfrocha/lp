import java.io.IOException;
import java.util.Scanner;

/**
 * 1014 - Consumption
 */
public class Consumption {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        double y = s.nextDouble();
        s.close();

        double media = x / y;
        
        System.out.println(String.format("%.3f km/l", media)); 
    }
}
