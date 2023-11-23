public class Main {
  public static void main(String[] args) {
    Oppgaveoversikt overview = new Oppgaveoversikt(10);

    overview.registerStudent("Alice");
    overview.registerStudent("Bob");

    overview.increaseNumAssignments("Alice", 3);
    overview.increaseNumAssignments("Bob", 5);

    System.out.println("Number of students: " + overview.findNumStudents());
    System.out.println(overview);

    System.out.println("Number of assignments for Alice: " + overview.findNumAssignments("Alice"));
    System.out.println("Number of assignments for Charlie: " + overview.findNumAssignments("Charlie"));
  }
}
