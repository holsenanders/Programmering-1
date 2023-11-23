import java.util.*;

public class Main {
    private static employer School;
    public static person henrik;
    private static int year;

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        year = cal.get(Calendar.YEAR);
        Scanner scanner = new Scanner(System.in);
        henrik = new person("Henrik", "Nordmann", 2001);
        School = new employer(1234, 2005, 50000, 0.2, 10);

        while (true) {
            System.out.println("Accessing: " + henrik.getLastName() + ", " + henrik.getFirstName() + ", age: " + getAge()  + ", Employee number: " + School.getEmployeeNr());
            System.out.println("What would you like to do?");
            System.out.println("1. Check yearly salary");
            System.out.println("2. Check monthly tax");
            System.out.println("3. Check yearly tax");
            System.out.println("4. Check how many years you have worked here");
            System.out.println("5. Change monthly salary");
            System.out.println("6. Change tax rate");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("Your yearly salary is: " + yearlySalary() + " kr before tax");
            } else if (choice == 2) {
                System.out.println("Your monthly tax is: " + monthlyTax() + " kr");
            } else if (choice == 3) {
                System.out.println("Your yearly tax is: " + yearlyTax() + " kr");
            } else if (choice == 4) {
                System.out.println("You have worked here for: " + yearsWorked() + " years");
                if (yearsWorked() > School.getYearsWorkedTresh()) {
                    System.out.println("Thank you for your service in our company!");
                }
            }
            else if (choice == 5){
                setMonthlySalary(School.getMonthlySalary());
            }
            else if (choice == 6){
                setTaxRate(School.getTaxRate());
            }
            else if (choice == 7) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    // gets the age of the person (uses getter from person.java
    public static int getAge() {
        return year - henrik.getBirthYear();
    }
// gets the yearly salary of the person (uses getter from employer.java
    public static int yearlySalary() {
        return School.getMonthlySalary() * 12;
    }
// gets the monthly tax of the person (uses getter from employer.java on monthly salary and tax rate)
    public static double monthlyTax() {
        return School.getMonthlySalary() * School.getTaxRate();
    }
    public static double yearlyTax() {
        return monthlyTax() * 10 + (monthlyTax() / 2);
    }
// gets the years worked of the person (uses getter from employer.java on hire year)
    public static int yearsWorked() {
        return year - School.getHireYear();
    }

    public static void setMonthlySalary(int monthlySalary) {
        System.out.println("What is your new monthly salary?");
        Scanner scanner = new Scanner(System.in);
        monthlySalary = scanner.nextInt();
        School.setMonthlySalary(monthlySalary);
        System.out.println("Your new monthly salary is: " + monthlySalary + " kr");
    }
    public static void setTaxRate(double taxRate) {
        System.out.println("What is your new tax rate?");
        Scanner scanner = new Scanner(System.in);
        taxRate = scanner.nextDouble();
        School.setTaxRate(taxRate);
        System.out.println("Your new tax rate is: " + taxRate);
    }
}
