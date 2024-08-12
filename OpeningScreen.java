import java.util.Scanner;

public class OpeningScreen {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Username: ");
            String username = input.nextLine();
            System.out.println("Password");
            String password = input.nextLine();


            if  ((username.equals("ardahan")) && (password.equals("4141")))
            {
                System.out.println("Welcome to Facebook");
            }
            else {
                System.out.println("Entry denied");
            }
        }
    }
    
}
