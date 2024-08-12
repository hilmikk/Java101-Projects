import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int km, typ , age ;
            double price;

            System.out.println("Travelled distance: ");
            km = input.nextInt();
            System.out.println("Age: ");
            age = input.nextInt();
            System.out.println("Flight Type:\n (1) for one-way (2) for round-trip");
            typ = input.nextInt();

            if((km<0)   ||  (age<0) ||  ((typ!=1)   &&  (typ!=2))    ){
                System.out.println("Invalid");
            }
            else {
            price = km*0.1;
            System.out.println("Travelled distance: " + km);
            System.out.println("Price without any discount: " + price);
            if(age<12){
                price = price*0.5;
                System.out.println("Discounted price due to the age:" + price);
            }
            else if( (age>=12) && (age<=24)){
                price = price*0.9;
                System.out.println("Discounted price due to the age:" + price);
            }
            else if (age>=65){
                price = price*0.7;
                System.out.println("Discounted price due to the age:" + price);
            }

            if (typ==2){
                price=price*0.8;
                System.out.println("Total discounted price (One-Way): " + price);

            }
            else {
                System.out.println("Total discounted price (Round-Trip): " + price);
            }
            
   
}
        }
       

}
}
