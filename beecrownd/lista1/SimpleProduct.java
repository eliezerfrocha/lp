import java.util.Scanner;

/**
 * 1004 - Simple Product
 */
public class SimpleProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();

        int prod = a * b;
        
        System.out.println("PROD = " + prod);
    }
}
