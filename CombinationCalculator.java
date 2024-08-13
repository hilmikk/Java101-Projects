import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number 1 to combinate: ");
        int n = in.nextInt();
        System.out.println("Number 2 to combinate: ");
        int r = in.nextInt();

        int tot1 = 1 ;
        int tot2 = 1 ;
        int tot3 = 1 ;

        for(int i=1; i<=n;i++){
            tot1*=i;

        }
        for(int i=1; i<=r;i++){
            tot2*=i;
            
        }
        for(int i=1; i<=(n-r);i++){
            tot3*=i;
            
        }
        System.out.println(tot1/tot2/tot3);

    }
    
}
