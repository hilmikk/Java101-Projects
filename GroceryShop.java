import java.util.Scanner;

public class GroceryShop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pear,tomato,cucumber,peach,grapes;
        double total;


        System.out.println("Your desired kg of pear: ");
        pear = inp.nextInt();
        System.out.println("Your desired kg of tomato: ");
        tomato = inp.nextInt();
        System.out.println("Your desired kg of cucumber: ");
        cucumber = inp.nextInt();
        System.out.println("Your desired kg of peach: ");
        peach = inp.nextInt();
        System.out.println("Your desired kg of grapes: ");
        grapes = inp.nextInt();

        total=pear*2.14+3.67*tomato+1.11*cucumber+0.67*peach+12.3*grapes;

        System.out.println("Total: " + total);
    }
    
}
