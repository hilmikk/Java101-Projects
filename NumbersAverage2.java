
import java.util.Scanner;

public class NumbersAverage2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a ;
            int sum =0 ;
            do{
            System.out.println("Your number: ");
            a = in.nextInt();
            if(a % 4 ==0){
                sum+=a;
            }
            


   }while(a % 2 == 0);

            System.out.println("Sum: " + sum);
        }
    
}
}
