
public class Test {
    public static void main(String[] args) {
     Fraction a = new Fraction(1, 2);
     Fraction b = new Fraction(4);

    Fraction.add(a, b);
    double additionResult = Fraction.result;

    Fraction.subtract(a, b);
    double subtractionResult = Fraction.result;

    Fraction.multiply(a, b);
    double multiplicationResult = Fraction.result;

    Fraction.divide(a, b);
    double divisionResult = Fraction.result;



    System.out.println("Addition: " + additionResult);
    System.out.println("Subtraction: " + subtractionResult);
    System.out.println("Multiplication: " + multiplicationResult);
    System.out.println("Division: " + divisionResult);




    }
}
