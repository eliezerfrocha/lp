import java.util.Scanner;
import java.io.IOException;

/**
 * 1002 - Area Of ACircle
 */
public class AreaOfACircle {
    public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		double raio = s.nextDouble();
		s.close();

		double area = 3.14159 * (raio * raio);
		System.out.println(String.format("A=%.4f", area)); 
	}
}
