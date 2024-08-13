import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Your number: ");
        int a = in.nextInt();
        double sum = 0;
        
        for(double i = 1 ; i<=a; i++){
            sum +=(1/i);
        }
        System.out.println("Harmonic series of " + a +" is: " + sum);
    }
    
}
