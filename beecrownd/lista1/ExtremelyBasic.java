import java.util.Scanner;

/**
 * 1001 - Extremely Basic
 */
public class ExtremelyBasic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();

        System.out.println("X = " + (a + b));
    }
}