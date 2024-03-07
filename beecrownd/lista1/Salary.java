import java.util.Scanner;

/**
 * 1008 - Salary
 */
public class Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int funcionarios = s.nextInt();
        int horas = s.nextInt();       
        double valorPorHora = s.nextDouble();
        s.close();

        double salario = horas * valorPorHora;
        
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }   
}
