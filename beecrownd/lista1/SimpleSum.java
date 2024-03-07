import java.io.IOException;
import java.util.Scanner;

/**
 * 1003 - Simple Sum
 */
public class SimpleSum {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();

        int soma = a + b;
        
        System.out.println("SOMA = " + soma);
    }
}
