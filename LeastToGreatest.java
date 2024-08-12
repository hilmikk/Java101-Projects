import java.util.Scanner;

public class LeastToGreatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("1st number: ");
        a=in.nextInt();
        System.out.println("2nd number: ");
        b=in.nextInt();
        System.out.println("3rd number: ");
        c=in.nextInt();

        System.out.println("Your numbers are\n" + "(a)" + a+ "\t(b)" + b+ "\t(c)" + c);

        if((a==b)||(b==c)||(a==c)){
            System.out.println("Write non-equal numbers");
        }
        else {
        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("a<b<c");
            }
            else{
                System.out.println("a<c<b");
            }
        }
        else if((b<c) && (b<a)){
            if(c<a){
                System.out.println("b<c<a");
            }
            else {
                System.out.println("b<a<c");
            }
        }
        else{
            if(b<a){
                System.out.println("c<b<a");
            }
            else{
                System.out.println("c<a<b");
            }
        }
        }
        
        


    }
}
    

