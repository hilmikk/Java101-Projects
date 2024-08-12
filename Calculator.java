import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int a,b;

            System.out.println("Select your operator\n+\n-\n*\n/");
            String op = inp.next();
            System.out.println("Your first number:");
            a = inp.nextInt();
            System.out.println("Your second number: ");
            b = inp.nextInt();

            switch (op) {
                case "+" -> System.out.println(a+b);
                case "-" -> System.out.println(a-b);
                case "*" -> System.out.println(a*b);
                case "/" -> {
                    double c= a/b;
                    System.out.println(c);
                }
                default -> System.out.println("Choose a valid operator*");




            }
        }
        


        
    }
    
}
