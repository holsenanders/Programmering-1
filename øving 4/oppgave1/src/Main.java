import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Valuta dollar = new Valuta("Dollar", 10.65);
        Valuta euro = new Valuta("Euro", 11.42);
        Valuta svenskeKroner = new Valuta("Svenske Kroner", 0.96);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Velg valuta:");
            System.out.println("1: " + dollar.getNavn());
            System.out.println("2: " + euro.getNavn());
            System.out.println("3: " + svenskeKroner.getNavn());
            System.out.println("4: Avslutt");

            int valg = scanner.nextInt();

            if (valg == 4) {
                System.out.println("Programmet avsluttes.");
                break;
            }

            System.out.println("Skriv inn beløp i valutaen:");
            double belop = scanner.nextDouble();

            double konvertertBelop = 0;

            switch (valg) {
                case 1:
                    konvertertBelop = dollar.tilNorskeKroner(belop);
                    break;
                case 2:
                    konvertertBelop = euro.tilNorskeKroner(belop);
                    break;
                case 3:
                    konvertertBelop = svenskeKroner.tilNorskeKroner(belop);
                    break;
                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
            }

            System.out.println(belop + " " + dollar.getNavn() + " er " + konvertertBelop + " norske kroner.");
        }

        scanner.close();
    }
}

