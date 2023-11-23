import java.util.Random;
public class MinRandom {
    public static void main(String[] args) {
        testresult();


    }
    public static int NesteHeltall(int nedre, int ovre) {
        Random random = new Random();
        return random.nextInt(ovre - nedre + 1) + nedre;
    }

    public static double nesteDesimaltall(double nedre, double ovre) {
        Random random = new Random();
        return random.nextDouble() * (ovre - nedre) + nedre;
    }
    public static void testresult(){

        int nedre1 = 1;
        int ovre1 = 10;

        int nedre2 = 3;
        int ovre2 = 17;

        for (int i = 0; i < 10; i++) {
            int tall1 = NesteHeltall(nedre1, ovre1);
            int tall2 = NesteHeltall(nedre2, ovre2);
            System.out.println(tall1 + " " + tall2);

        }
        for (int i = 0; i < 10; i++) {
            double tall1 = nesteDesimaltall(nedre1, ovre1);
            double tall2 = nesteDesimaltall(nedre2, ovre2);
            System.out.println(tall1 + " " + tall2);

        }
    }
    }

