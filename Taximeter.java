import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,add,price;
        System.out.println("Travelled distance: ");
        km = input.nextDouble();
        add = km*(2.2) ;
        price = add+10 ;
        price = (price>20) ? price:20.0 ;
        System.out.println("Travelled distance: " + km);
        System.out.println("Initial price: 10 ");
        System.out.println("Price per km : 2.2 ");
        System.out.println("Price: " + price);
        
        
    }
    
}
