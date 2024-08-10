import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        double radius,angle,area;

       

        System.out.println("Radius: ");
        radius = input.nextDouble();
        System.out.println("Your central angle as degrees: ");
        angle = input.nextDouble();

        area=pi*radius*radius*angle/360;
        System.out.println("Your area of your sector: " + area);       
    }
    
}
