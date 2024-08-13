import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Your number: ");
            int num = in.nextInt();
            int digit = 0 ;
            int tempnum = num ;
            int sum = 0;
            while(tempnum!=0){
                tempnum /=10;
                digit++;
            }
            System.out.println("This number has " + digit + " digit/s ");

            tempnum=num;
            for(int i=0 ; i<digit ;i++){
                sum +=tempnum%10;
                tempnum = tempnum / 10;
            }
            System.out.println("Your number is: " + num);
            System.out.println("Sum of the digits: " + sum);
        }

    }    
}
