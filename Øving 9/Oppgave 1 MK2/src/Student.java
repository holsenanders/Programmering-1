public class Student {
  private String name;
  private int numAssignments;

  public Student(String name) {
    this.name = name;
    this.numAssignments = 0;
  }

  public String getName() {
    return name;
  }

  public int getNumAssignments() {
    return numAssignments;
  }

  public void increaseNumAssignments(int increment) {
    numAssignments += increment;
  }

  public String toString() {
    return "Student: " + name + ", Number of approved assignments: " + numAssignments;
  }
}
