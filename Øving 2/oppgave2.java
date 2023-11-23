import java.util.Scanner;
public class oppgave2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	
        // pris og vekt for første produkt
        System.out.print("Sett inn prisen av produktet: ");
        double price1 = input.nextDouble();
        System.out.println("Du satt inn " + price1 + " som pris på første produkt!");

        System.out.print("Sett inn vekten av produktet i kg: ");
        double weight1 = input.nextDouble();
        System.out.println("Du satt inn " +  weight1 + " som vekt!");

        // pris og vekt for andre produkt
        System.out.print("Sett inn prisen av produktet: ");
        double price2 = input.nextDouble();
        System.out.println("Du satt inn " + price2 + " som pris på første produkt!");

        System.out.print("Sett inn vekten av produktet i kg: ");
        double weight2 = input.nextDouble();
        System.out.println("Du satt inn " +  weight2 + " som vekt!");

        // regne ut kg prisen til produkt1 
        double pricePerkg1 = price1 / weight1;

        // regne ut kg prisen til produkt2 
        double pricePerkg2 = price2 / weight2;

        if (pricePerkg1 > pricePerkg2){
            System.out.println("Det andre produktet du slo innn er billigst med " + pricePerkg2 + " kr per kilo");
        }else{
            System.out.println("Det andre produktet du slo innn er billigst med " + pricePerkg1 + " kr per kilo");
        }






        // closing the scanner object
        input.close();
        
    }
}
