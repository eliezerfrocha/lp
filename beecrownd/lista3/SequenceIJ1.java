package lista3;
import java.util.Scanner;

public class SequenceIJ1 {
    public static void main(String[] args) {
        int I = 1;
        int J = 60;
        
        while (J >= 0) {
            System.out.println("I=" + I + " J=" + J);
            I += 3;
            J -= 5;
        }
    }
}
