import java.util.Scanner;

public class GradeAverageWithVariables {
    public static void main(String[] args) {


        try (Scanner input = new Scanner(System.in)) {
            int mathg, phyg, chemg, turg, histg, musg;
            int ave;


            System.out.println("Your Grade for math:");
            mathg = input.nextInt();
            System.out.println("Your Grade for physics:");
            phyg = input.nextInt();
            System.out.println("Your Grade for chemistry:");
            chemg = input.nextInt();
            System.out.println("Your Grade for turkish:");
            turg = input.nextInt();
            System.out.println("Your Grade for history:");
            histg = input.nextInt();
            System.out.println("Your Grade for music:");
            musg = input.nextInt();
            ave=(mathg+phyg+chemg+turg+histg+musg)/6;
            String success = (ave>=60) ? "Successful" : "Unsuccessful";


            System.out.println("Your average is: "+ ave);
            System.out.printf(success);
        }


    }
}
