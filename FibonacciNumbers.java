import java.util.Scanner;
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Fibonacci number do you want? ");
        int n = in.nextInt();

        int a = 0 ;
        int b = 1 ;
        int temp;
        for(int i = 1 ; i<=n; i++){

            System.out.println(b);
            temp=a;
            a=b;
            b+=temp;

        }
    }
    
}
