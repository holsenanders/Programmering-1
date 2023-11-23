import static java.lang.System.out;

public class Main {



    public static void main(String[] args) {
        // radnom generator
        java.util.Random random = new java.util.Random();
        //tabbel med 10 0 verdier
        int [] numberTable =  new int[10];

// for løkke som kjører 1000 ganger
        for(int i= 0; i < 1000; i++){
            // random tall mellom 0 og 9
            int tall = random.nextInt(10);
            // legger til 1 i tabellen på plassen til tallet
            numberTable[tall] = numberTable[tall] + 1;
            }

out.println("0: " + numberTable[0]);
        out.println("1: " + numberTable[1]);
out.println("2: " + numberTable[2]);
out.println("3: " + numberTable[3]);
out.println("4: " + numberTable[4]);
out.println("5: " + numberTable[5]);
out.println("6: " + numberTable[6]);
out.println("7: " + numberTable[7]);
out.println("8: " + numberTable[8]);
out.println("9: " + numberTable[9]);


        }


    }

