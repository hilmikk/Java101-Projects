import java.util.Scanner;

public class PowersOf4and5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Your number: ");
            int a = in.nextInt();
            int j = 1 ;
            int i = 1;
            while(i<=a){
                
                System.out.println(i);
                i*=4;
            
            }
            while(j<=a){
                
                System.out.println(j);
                j*=5;
            
            }
        }

        
    }
    
}
