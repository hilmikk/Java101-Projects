
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        double height,weight,bmi;


        System.out.println("Your height as m: ");
        height = input.nextDouble();
        System.out.println("Your weight as kg: ");
        weight = input.nextDouble();

        bmi=weight/height/height;
        System.out.println("Your BMI: " + bmi);


    } 
    
}
}