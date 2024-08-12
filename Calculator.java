import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b;

        System.out.println("Select your operator +\n-\n*\n/");
        String op = inp.next();
        System.out.println("Your first number:");
        a = inp.nextInt();
        System.out.println("Your second number: ");
        b = inp.nextInt();

        switch (op) {
            case "+" :
                System.out.println(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "/" :
            double c= a/b;
                System.out.println(c);
                break;
            default :
                System.out.println("Choose a valid operator*");




        }
        


        
    }
    
}
