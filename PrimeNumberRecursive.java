import java.util.Scanner;   
public class PrimeNumberRecursive {
    static int isPri (int num, int i){
        if(num==i){
            return 1;
        }
        else{
            if(num%i == 0){
                return 0;
            }
            return isPri(num,i+1);
        }
        
        

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Your number: ");
        int a = in.nextInt();

        if (isPri(a,2)==1){
            System.out.println("Prime");

        }
        else{
            System.out.println("not prime");
        }
        
    }
    
}
