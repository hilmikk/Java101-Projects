import java.util.Scanner;

public class ActivityBot {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Weather Degree:");
        int heat = inp.nextInt();

        if(heat<5){
            System.out.println("Indoor activities are recommended");
        }
        if((heat>=5) && (heat<15)){
            System.out.println("Cinema is recommended");
        }
        if((heat>=15) && (heat<25)){
            System.out.println("Picnic is recommended");
        }
        if ((heat>=25) && (heat<50)){
            System.out.println("Swimming is recommended");
        }
        if (heat>50){
            System.out.println("Go to the Antarctica");
        }

        inp.close();
    }
    
}
