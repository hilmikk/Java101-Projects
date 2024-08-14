import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Your number: ");

            int num = in.nextInt();

            int i=1;
            int sum = 0 ;
            while(i<num){
                if(num % i == 0){
                    sum+=i;
                }
                i++;
            }
            if(sum == num){
                System.out.println(num+ " is a perfect number");
            }
            else{
                System.out.println(num+ " is not a perfect number");
            }
        }


    }
    
}
