import java.util.Scanner;

public class Pattern {

    
    public static void pat(int num) {
        System.out.print(num + " ");
        if(num<=0){
            return;
        }
        pat(num-5);

        System.out.print(num + " ");
    }
        

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.println("Output:");
        pat(number);
    }
}
