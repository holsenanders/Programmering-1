import java.util.*;
class oppgave2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Skriv in tall her:");
            int tall = in.nextInt();

            boolean primtall = true;

            for (int i = 2; i <= tall / 2; i++) {
                int num = tall % i;
                if (num == 0) {
                    primtall = false;
                    break;
                }
            }
            if (tall == 0 || tall == 1) {
                primtall = false;
            }

            if (primtall) {
                System.out.println(tall + " er et primtall!");
            } else {
                System.out.println(tall + " er ikke et primtall");

            }
        }
    }
}