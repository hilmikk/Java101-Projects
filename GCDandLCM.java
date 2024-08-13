import java.util.Scanner;
public class GCDandLCM{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Your 1st number: ");
        int n1 = in.nextInt();
        System.out.println("Your 2nd number: ");
        int n2 = in.nextInt();

        int gcd = 1 ;
        int i = 1; 

        while (i <= n1) {
            
            if (n1 % i == 0 && n2 % i == 0)
            {
                gcd = i;
        }
            i++;
        }
        System.out.println("GCD: "+ gcd);
        System.out.println("LCM: " + n1*n2/gcd);

        
    }
}