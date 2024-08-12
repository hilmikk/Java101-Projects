import java.util.Scanner;

public class VATwithVariables {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double price;
            System.out.println("Price for product:");
            price= input.nextDouble();

            Double vatrate = (price<1000) ? 0.18:0.08 ;

            

            double vat= vatrate*price;
            double total= vat + price;
            
            System.out.println("Price: " + price);
            System.out.println("VAT Rate: " + vatrate);
            System.out.println("VAT: " + vat);
            System.out.println("Total: " + total);
        }

        


        
        
    }
    
}
