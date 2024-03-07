import java.util.Scanner;

/**
 * 1006 - Average 2
 */
public class Average02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        s.close();
        
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.println(String.format("MEDIA = %.1f" , media));
    }
}
