public class Student {
  private String name;
  private int amountOfAssignments;

  public Student(String name, int amountOfAssignments) {
    this.name = name;
    this.amountOfAssignments = amountOfAssignments;
  }

  public String getName() {
    return name;
  }

  public int getAmountOfAssignments() {
    return amountOfAssignments;
  }

  public void setAmountOfAssignments(int amountOfAssignments) {
    this.amountOfAssignments += amountOfAssignments;
  }

  @Override
  public String toString() {
    return name + " has " + amountOfAssignments + " assignments";
  }
}
