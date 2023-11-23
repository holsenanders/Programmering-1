import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("John", 5));
    students.add(new Student("Jane", 5));
    students.add(new Student("Jack", 5));

    TaskOverview taskOverview = new TaskOverview(students);
    taskOverview.Interface();
  }
}
