import java.util.Scanner;
public class oppgave1{
    public static void main(String[] args) {
        // lager et input slik at brukeren blir spurt om hvilken tall de skal bruke
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Sett in et reelttall: ");
        int number = input.nextInt();

        input.close();
        
        // lager en for løkke fra 1 til 10 for å gange i med number
        for(int i = 0; i <= 10;i++){
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
        
    }
}