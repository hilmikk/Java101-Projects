
import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        System.out.println("CHECK IF YOUR DATE IS VALID");

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Month:");
            int month = in.nextInt();
            System.out.println("Day:");
            int day = in.nextInt();
            System.out.print("Your zodiac sign is: ");

            if(((month==3) && (day>=21)) || ((month==4) && (day<=19))){
                System.out.println("Aries");
            }
            else if(((month==4) && (day>=20)) || ((month==5) && (day<=20))){
                System.out.println("Taurus");
            }
            else if(((month==5) && (day>=21)) || ((month==6) && (day<=20))){
                System.out.println("Gemini");
            }
            else if(((month==6) && (day>=21)) || ((month==7) && (day<=22))){
                System.out.println("Cancer");
            }
            else if(((month==7) && (day>=23)) || ((month==8) && (day<=22))){
                System.out.println("Leo");
            }
            else if(((month==8) && (day>=23)) || ((month==9) && (day<=22))){
                System.out.println("Virgo");
            }
            else if(((month==9) && (day>=23)) || ((month==10) && (day<=22))){
                System.out.println("Libra");
            }
            else if(((month==10) && (day>=23)) || ((month==11) && (day<=21))){
                System.out.println("Scorpio");
            }
            else if(((month==11) && (day>=22)) || ((month==12) && (day<=21))){
                System.out.println("Sagittarius");
            }
            else if(((month==12) && (day>=22)) || ((month==1) && (day<=19))){
                System.out.println("Capricorn");
            }
            else if(((month==1) && (day>=20)) || ((month==2) && (day<=18))){
                System.out.println("Aquarius ");
            }
            else if(((month==2) && (day>=19)) || ((month==3) && (day<=20))){
                System.out.println("Pisces ");
            }
        }
        

    }
    
}
