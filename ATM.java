import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String username,password;
            int balance = 2300;
            int op ;

            for(int i=1; i<=3 ; i++){
            
            System.out.println("Your username: ");
            username = in.nextLine();
            System.out.println("Your password: ");
            password = in.nextLine();

            if(username.equals("bise") && password.equals("izmit")){
                do{
                System.out.println("------------------");
                System.out.println("Welcome to DEVBANK");
                System.out.println("------------------");
                System.out.println("How can we help you today?");
                System.out.println("(1) for  Cash Deposit\n(2) for  Cash Withdrawal\n(3) for Balance Inquiry\n(4) for Exit");
                op= in.nextInt();
                switch(op){
                    case 1 -> {
                        int money;
                        System.out.println("Deposit: ");
                        money = in.nextInt();
                        balance+=money;
                        }
                    case 2 -> {
                        int money2;
                        System.out.println("Withdrawal: ");
                        money2 = in.nextInt();
                        if(money2>balance){
                            System.out.println("Your balance cannot be below 0.\n");
                        }
                        else{
                            balance-=money2;
                        }
                        }

                    case 3 -> System.out.println("Your balance: " + balance);
                    case 4 -> System.out.println("Have a great day!\n");
                        
                    default -> System.out.println("Please select a valid operator\n");

                }
            }while(op!=4);
                
                break;
            }

            else {
                if(i==3){
                    System.out.println("Your card has been blocked.");
                }
                else{
                    System.out.println("Try again. ");

                }
                }
            }
        }



    }
    
}
