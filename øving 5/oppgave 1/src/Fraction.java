public class Fraction {
    int nomerator;
    int denominator;
    public static double result;
    //constructor for fraction der vi setter inn både teller og nevner
    public Fraction(int nomerator,  int denominator){
        this.nomerator = nomerator;
        if (denominator == 0){
            throw new IllegalArgumentException("Denominator cannot be zero");
        }else{
            this.denominator = denominator;
        }
    }
// constructor for fraction der vi setter inn bare nevner
    public  Fraction(int denominator){
        this.denominator = denominator;
        nomerator = 1;
    }
    public int getNomerator(){
        return nomerator;

    }
    public int getDenominator(){
        return denominator;
    }
    public static void add(Fraction a, Fraction b){
        result = (double) a.nomerator / a.denominator + (double) b.nomerator / b.denominator;
    }
    public static void subtract(Fraction a, Fraction b){
        result = (double) a.nomerator / a.denominator - (double) b.nomerator / b.denominator;
    }
    public static void multiply(Fraction a, Fraction b){
        result = (double) a.nomerator / a.denominator * b.nomerator / b.denominator;
    }
    public static void divide(Fraction a, Fraction b) {
        if (b.nomerator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        } else {

            result = (double) (a.nomerator / a.denominator) / (double)(b.nomerator / b.denominator);
        }
    }
    }


