import java.util.Scanner;

/**
 * 1005 - Average 1
 */
public class Average01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        s.close();

        double media = ((3.5 * a) + (7.5 * b))/11;

        System.out.println(String.format("MEDIA = %.5f" , media));
        System.out.printf("MEDIA = %.5f" , media);
        System.out.println("MEDIA = " + media);
    }
}