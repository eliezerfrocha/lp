import java.util.Scanner;

/**
 * 1009 - Salary with bonus
 */
public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String nome = s.next();
        double salarioFixo = s.nextDouble();
        double vendas = s.nextDouble();
        s.close();
        
        double total = ((vendas * 15) / 100) + salarioFixo;
        System.out.println(String.format("TOTAL = R$ %.2f" , total));
    }
}
