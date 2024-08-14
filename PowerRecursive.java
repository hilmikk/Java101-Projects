import java.util.Scanner;
public class PowerRecursive {
    static int pow (int a, int b){
        int tot;
        if (b==0)
            return 0;
        if(b==1){
            return a;
        }
        tot=pow(a,b-1)*a;
        return tot;

    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a ; int b;
            System.out.println("First base then exp.");
            a = in.nextInt(); b = in.nextInt();
            System.out.println(pow(a,b));
        }
        
    }
    
}
