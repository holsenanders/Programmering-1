import java.util.Scanner;
public class oppgave1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hvilket år vil du sjekke?");
        int year = input.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year == 400 ||  year == 4000 ||  year == 40000){
                    System.out.println("Dette er et skudd år!");
                }else{
                    System.out.println("Dette er ikke et skuddår!");
                }
            }else{
                System.out.println("Dette er et skuddår!");
            }

        }else{
            System.out.println("Dette året er ikke et skuddår!");
        }


    }
}
