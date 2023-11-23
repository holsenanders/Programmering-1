public class Oppgaveoversikt {
  private Student[] students;
  private int numStudents;

  public Oppgaveoversikt(int maxNumStudents) {
    students = new Student[maxNumStudents];
    numStudents = 0;
  }

  public int findNumStudents() {
    return numStudents;
  }

  public int findNumAssignments(String studentName) {
    for (int i = 0; i < numStudents; i++) {
      if (students[i].getName().equals(studentName)) {
        return students[i].getNumAssignments();
      }
    }
    return -1; // Student not found
  }

  public void registerStudent(String studentName) {
    if (numStudents < students.length) {
      students[numStudents] = new Student(studentName);
      numStudents++;
    } else {
      System.out.println("Maximum number of students reached.");
    }
  }

  public void increaseNumAssignments(String studentName, int assignments) {
    for (int i = 0; i < numStudents; i++) {
      if (students[i].getName().equals(studentName)) {
        students[i].increaseNumAssignments(assignments);
        return;
      }
    }
    System.out.println("Student not found.");
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < numStudents; i++) {
      result.append(students[i].toString()).append("\n");
    }
    return result.toString();
  }
}
