import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        System.out.println("CHECK IF YOUR DATE IS VALID");

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Birth Year:");
            int year = in.nextInt();
            System.out.print("Your Chinese zodiac sign is: ");
            int index= year%12;
            switch (index) {
                case 0 -> System.out.println("Rat");
                case 1 -> System.out.println("Ox");
                case 2 -> System.out.println("Tiger");
                case 3 -> System.out.println("Rabbit");
                case 4 -> System.out.println("Dragon");
                case 5 -> System.out.println("Snake");
                case 6 -> System.out.println("Horse");
                case 7 -> System.out.println("Goat");
                case 8 -> System.out.println("Monkey");
                case 9 -> System.out.println("Rooster");
                case 10 -> System.out.println("Dog");
                case 11 -> System.out.println("Pig");
                default -> {
                }
            }
            

    
}
    }
}
