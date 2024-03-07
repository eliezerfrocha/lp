import java.util.Scanner;

/**
 * 1011 - Sphere
 */
public class Sphere {
    public static Double pi = 3.14159;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double raio = s.nextDouble();    
        s.close();

        double volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);      
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}
