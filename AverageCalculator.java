import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat,phy,chem,eng;


        System.out.println("Math score: ");
        mat = inp.nextInt();

        System.out.println("Physics score: ");
        phy = inp.nextInt();

        System.out.println("Chemistry score:");
        chem = inp.nextInt();

        System.out.println("English score: ");
        eng = inp.nextInt();

        int numberoflessons=0;
        int totalgrade=0;

        if((mat<100) && (mat>0)){
            numberoflessons++;
            totalgrade+=mat;
}
        if((phy<100) && (phy>0)){
            numberoflessons++;
            totalgrade+=phy;
}   
        if((chem<100) && (chem>0)){
            numberoflessons++;
            totalgrade+=chem;
}
        if((eng<100) && (eng>0)){
            numberoflessons++;
            totalgrade+=eng;
}       double average = totalgrade/numberoflessons;

        if(average>=55){
            System.out.println("Successful");
        }
        else{
            System.out.println("Unsuccessful");
        }
        System.out.println("Average: " + average);
    }
    
}
