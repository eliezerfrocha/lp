import java.util.Scanner;

/**
 * 1010 - Simple Calculate
 */
public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int codPeca1 = s.nextInt();
        int qtdPeca1 = s.nextInt();
        double valorPeca1 = s.nextDouble();

        int codPeca2 = s.nextInt();
        int qtdPeca2 = s.nextInt();
        double valorPeca2 = s.nextDouble();
        s.close();

        double custoTotal = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", custoTotal);   
    }
}
