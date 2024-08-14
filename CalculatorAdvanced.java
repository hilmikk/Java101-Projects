import java.util.Scanner;
public class CalculatorAdvanced {
    static void minus(){
        try (Scanner scan = new Scanner(System.in)) {
            int a,b ;
            System.out.println("Numbers to substract ");
            a=scan.nextInt(); b =scan.nextInt();
            int tot= a-b;
            System.out.println (a +  "-" + b + " = " +  tot);
        }

    }

    static void add(){
        Scanner scan = new Scanner(System.in);
        int a,b ;
        System.out.println("Numbers to add ");
        a=scan.nextInt(); b =scan.nextInt();
        int tot = a+b;
        System.out.println(a +  "+" + b + " = " + tot );

    }

    static void mul(){
        Scanner scan = new Scanner(System.in);
        int a,b ;
        System.out.println("Numbers to multiply ");
        a=scan.nextInt(); b =scan.nextInt();
        System.out.println(a +  "*"+ b + " = " + a*b );


    }

    static void div(){
        Scanner scan = new Scanner(System.in);
        double a,b ;
        
        System.out.println("Numbers to divide: ");
        a=scan.nextInt(); b =scan.nextInt();
        double tot = a/b;
        if(b==0){
            System.out.println("You cannot divide 0");
        }
        System.out.println(a +  "/"+ b + " = " + tot );


    }
    
    static void pow(){
        Scanner scan = new Scanner(System.in);
        int a,b ;
        int tot= 1 ;
        System.out.println("Numbers to power (First base, second exponential ) : ");
        a=scan.nextInt(); b =scan.nextInt();
        for( int i= 1; i<=b; i ++){
            tot*=a;

        }
        System.out.println(a+ "^" + b + " = " + tot);

        

    }
    
    static void fac(){
        Scanner scan = new Scanner(System.in);
        int a ;
        System.out.println("Number to factorialize: ");
        a=scan.nextInt();
        int i = 1 ;
        int tot = 1 ;
        while(i<=a){
            tot*=i;
            i++;
        }
        System.out.println(a + "! = " + tot);

    }
    
    static void mod(){
        Scanner scan = new Scanner(System.in);
        int a,b ;
        System.out.println("Your number to calculate mod (First number, second mode ): ");
        a=scan.nextInt(); b =scan.nextInt();
        System.out.println(a + " in mode " + b  + " is " + a%b);


    }
    
    static void rec(){
        
        Scanner scan = new Scanner(System.in);
        int a,b ;
        System.out.println("Side lenghts of rectangle: ");
        a=scan.nextInt(); b =scan.nextInt();

        System.out.println("Area of rectangle: " + a*b);
        System.out.println("Perimeter of rectangle: " + (a+b)*2);


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String menu = "1- Add\n"
                + "2- Substract\n"
                + "3- Multiply\n"
                + "4- Divide\n"
                + "5- Power of a number\n"
                + "6- Factorial\n"
                + "7- Mod \n"
                + "8- Area and Perimeter for a rectangle\n"
                + "0- Exit" ;
        System.out.println(menu);
        int select;
        
        
        do { 
        System.out.print("Your operation: ");
        select = scan.nextInt();
            
        switch(select){
            case 1 :
                    add(); 
                    break;
            case 2 : 
                    minus(); 
                    break;
            case 3 : 
                    mul();  
                    break;
            case 4 : 
                    div(); 
                    break;
            case 5 : 
                    pow(); 
                    break;
            case 6 : 
                    fac(); 
                    break;
            case 7 : 
                    mod(); 
                    break;
            case 8 : 
                    rec(); 
                    break;
            case 0 : 
                    break;
            default : 
                    System.out.println("Please select a valid operator.");
        }
    } while(select!=0);
    
    }
}
