import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try(Scanner in =new Scanner(System.in)){
            System.out.println("Year: ");
            int year= in.nextInt();

            System.out.print(year + " is ");

            int leap1 = year%4;
            int leap2 = year%100;
            int leap3 = year%400;

            if(leap1==0){
                if(leap2==0){
                    if(leap3==0){
                        System.out.println("a leap year");
                    }
                    else{
                        System.out.println("NOT a leap year");
                    }
                }
                else{
                    System.out.println("a leap year");
                }
                }
            else{
                System.out.println("NOT a leap year");
            }




        }
    }
    
}
