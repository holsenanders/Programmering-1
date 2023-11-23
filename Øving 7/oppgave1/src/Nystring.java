import java.util.Scanner;
public class Nystring {

    private final String Nystring;

    public Nystring(String Nystring) {
        this.Nystring = Nystring;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn en tekststreng: ");
        String Nystring = input.nextLine();


        System.out.println("Skriv inn en bokstav eller tegn  som du vil fjerne: ");
        char remove = input.next().charAt(0);

        System.out.println("Forkortelsen av " + Nystring + "er " + abriviate(Nystring.toUpperCase()));
        System.out.println("Den nye strengen er " + removeCharacters(Nystring.toLowerCase(), remove));

    }

    public static String abriviate(String Nystring) {
        String[] words = Nystring.split(" ");
        String abriviation = "";
        for (String word : words) {
            abriviation += word.charAt(0);
        }
        return abriviation;
    }

    public static String removeCharacters(String Nystring, char remove) {
        String newString = "";
        for (int i = 0; i < Nystring.length(); i++) {
            if (Nystring.charAt(i) != remove) {
                newString += Nystring.charAt(i);
            }
        }
        return newString;
    }
}