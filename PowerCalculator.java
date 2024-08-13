import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Base: ");
            int base = in.nextInt();
            System.out.println("Exponent: ");
            int exp = in.nextInt();
            int total=1;


            for(int i=1; i<=exp; i++){
                total*=base;
                
            }
            System.out.println("TOTAL: " + total);
        }
        
    }
    
}
