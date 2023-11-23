import java.util.ArrayList;
import java.util.Scanner;

public class TaskOverview {
  private ArrayList<Student> students;

  public TaskOverview(ArrayList<Student> students) {
    this.students = students;
  }

  public void presentStudents() {
    for (Student student : students) {
      System.out.println(student);
    }
    Interface();
  }

  public int findNumStudents() {
    return students.size();
  }

  public void findNumTasksForStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the name of the student (case sensitive) or exit by typing exit: ");
    String name = scanner.nextLine();
    for (Student student : students) {
      if (student.getName().equals(name)) {
        System.out.println("Student found: " + student.getName() + " has " + student.getAmountOfAssignments() + " assignments");
        Interface();
      }
      else if (name.equals("exit")) {
        System.exit(0);
        }
      else{
        System.out.println("Student not found");
        findNumTasksForStudent();
      }
    }

  }

  public void registerNewStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the name of the student (case sensitive) or exit by typing exit: ");
    String name = scanner.nextLine();
    System.out.println("How many assignments do you want to add?");
    int amount = scanner.nextInt();
    students.add(new Student(name, amount));
    System.out.println("Student created: " + name + " and has " + amount + " amount of assignments");
    Interface();
  }

  public void increaseNumTasksForStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the name of the student (case sensitive) or exit by typing exit: ");
    String name = scanner.nextLine();
    for (Student student : students) {
      if (student.getName().equals(name)) {
        System.out.println("Student found!");
        System.out.println("How many assignments do you want to add?");
        int amount = scanner.nextInt();
        student.setAmountOfAssignments(amount);
        System.out.println("Student found: " + student.getName() + " now has " + student.getAmountOfAssignments() + " assignments");
        Interface();
      }
      else if(name.equals("exit")) {
        System.exit(0);
      }
    }
    System.out.println("Student not found!");
    Interface();
  }

  public void Interface() {
    System.out.println("""
            What do you want to do?
            1. Check assignments
            2. Find the number of students
            3. Add a new student
            4. Increase assignments for a student
            5. Present students
            6. Exit
            """);
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        findNumTasksForStudent();
        break;
      case 2:
        System.out.println("Number of students: " + findNumStudents());
        Interface();
        break;
      case 3:
        registerNewStudent();
        break;
      case 4:
        increaseNumTasksForStudent();
        break;
      case 5:
        presentStudents();
        break;
      case 6:
        System.exit(0);
        break;
      default:
        System.out.println("Invalid input");
        Interface();
        break;
    }
  }
}
