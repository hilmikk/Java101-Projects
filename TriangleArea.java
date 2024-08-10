import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double s1,s2,s3,area2,area;

        System.out.println("Your side lengths of your triangle: ");
        s1 = input.nextDouble();
        s2 = input.nextDouble();s3 = input.nextDouble();

        double perimeter = s1 + s2 + s3 ;
        double index = perimeter/2 ;
        area2 = index*(index-s1)*(index-s2)*(index-s3);
        area = Math.sqrt(area2);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);


    }
    
}
