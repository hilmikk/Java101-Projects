import java.util.Scanner;

public class NumbersAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your number: ");

        int a = in.nextInt();
        int sum = 0;
        int numofnum = 0;


        for(int i=0 ; i<=a ; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                sum += i;
                numofnum++;

            }

     

        }
        double ave = sum/numofnum;
            if(numofnum!=0){
            System.out.println("Average: " + ave );
            }
       
    }
    
}
