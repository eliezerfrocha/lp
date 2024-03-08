import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();

        System.out.print("> Hello my name is Java.");
        s.nextLine();
        
        System.out.println("> What is yours?");
        System.out.print("> ");
        String name = s.nextLine();

        System.out.printf("> Nice to meet you %s", name);
        System.out.println();
    }
}
