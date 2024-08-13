import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("How many numbers you would like to sort? ");
            int num = in.nextInt();

            int i=2 ;

            System.out.print("Number " + "1" + ": ");
            int real = in.nextInt();
            int max=real;
            int min=real;


            while(i<=num){

                System.out.println();
                System.out.print("Number " + i + ": ");
                real = in.nextInt();

                if (real<min){
                    min=real;
                    
                }
                

                if (real>max){
                    max=real;
                }
                i++;
            }
            System.out.println("Max: " + max + "\nMin: " + min);
        }

    }
    
}
