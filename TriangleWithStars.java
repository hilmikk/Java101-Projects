import java.util.Scanner;
public class TriangleWithStars {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Select a number for a triangle shape:  ");
        int n = in.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println("");
            for(int j=0 ; j<=2*i-2 ; j++){
                System.out.print("*");
            }
        

    }
    
}
}
