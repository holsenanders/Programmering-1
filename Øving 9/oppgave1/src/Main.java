import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {

        students.add(new Student("John", 5));
        students.add(new Student("Jane", 5));
        students.add(new Student("Jack", 5));

        int amountOfStudents = students.size();

        Interface();
    }
    public static void Interface() {
        presentStudents();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Check student");
        System.out.println("2. check amount of students");
        System.out.println("3. Make a new student");
        System.out.println("4. Add asignments to a student");
        System.out.println("5. exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                checkAssignments();
                break;
            case 2:
                System.out.println("Amount of students: " + students.size());
                break;
            case 3:
                addStudent();
                break;
            case 4:
                changeAssignments();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                Interface();
                break;
        }
    }

    public static void checkAssignments() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student (case sensitive) or exit by typing exit: ");
        String name = scanner.nextLine();
        if (name.equals("exit")) {
System.exit(0);
        }
       boolean found = false;
        for(Student student : students) {
            if (student.getName().equals(name)) {
                found = true;
                System.out.println("Student found: " + student.getName() + " has " + student.getAmountOfAssignments() +  " assignments");
            }
            else if (!found) {
                System.out.println("Student not found");
                checkAssignments();
            }
        }
         Interface();
    }
    public static void changeAssignments(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student (case sensitive) or exit by typing exit: ");
        String name = scanner.nextLine();
if (name.equals("exit")) {
            System.exit(0);
        }
        boolean found = false;
        for(Student student : students) {
            if (student.getName().equals(name)) {
                found = true;
                System.out.println("Student found: " + student.getName() + " has " + student.getAmountOfAssignments() +  " assignments");
                System.out.println("How many assignments do you want to add?");
                int amount = scanner.nextInt();
                student.setAmountOfAssignments(amount);
                System.out.println("Student found: " + student.getName() + " now has  " + student.getAmountOfAssignments() + " assignments");
            }
            else if (!found) {
                System.out.println("Student not found");
                changeAssignments();
            }
        }
         Interface();
    }
    public static void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student (case sensitive) or exit by typing exit: ");
        String name = scanner.nextLine();
        if (name.equals("exit")) {
            System.exit(0);
        }
        else{
            System.out.println("How many assignments do you want to add?");
            int amount = scanner.nextInt();
            students.add(new Student(name, amount));
            System.out.println("Student added: " + name + " has  " + amount + " assignments");
        }
        Interface();
    }
    public static void presentStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}