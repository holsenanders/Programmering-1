import java.util.Scanner;
public class UserInterface {

  public static void textMenu(){
    Scanner sc = new Scanner(System.in);
    while (true){
    System.out.println("Property Management System");
    System.out.println("1. Register Property");
    System.out.println("2. Find Property by ID");
    System.out.println("3. Calculate Average Property Area");
    System.out.println("4. Present all properties");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");

   int choice = sc.nextInt();
    sc.nextLine();

    switch (choice) {
      case 1:
        registerProperty();
        break;
      case 2:
        Property foundProperty = findPropertyByInputID();
        if (foundProperty != null) {
          System.out.println("Property found:");
          System.out.println(foundProperty);
        } else {
          System.out.println("Property not found.");
        }
        break;
      case 3:
        double averageArea = averageMeters();
        System.out.println("Average Property Area: " + averageArea + " square meters");
        break;

        case 4:
        TestData.displayProperties();
        break;
      case 5:
        System.out.println("Exiting the program.");
        System.exit(0);
        break;

      default:
        System.out.println("Invalid choice. Please try again.");
    }
    }
  }

  public static void registerProperty(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the municipality number, lot number and section number (1504-54/73) ");
    String id = sc.nextLine();

    String munNumber = id.substring(0,4);
    int lotNum = Integer.parseInt(id.substring(5,7));
    int secNum = Integer.parseInt(id.substring(8));

    String munName = null;

    for (Property property : TestData.properties) {
      if (property.getMunicipalityNumber().equals(munNumber)) {
        munName = property.getMunicipalityName();
        System.out.println("Municipality name: " + munName);
        break;
      }
    }
    if (munName == null) {
      System.out.println("No matching municipality number found.");
      System.out.println("Enter the municipality name: ");
      munName = sc.nextLine();
    }

    System.out.println("Enter the name of the property, if the property doesn´t have a name enter blank:");
    String propName = sc.nextLine();

    System.out.println("Enter the area of the property in square meters: ");
    double propArea = sc.nextDouble();
    sc.nextLine();

    System.out.println("Enter the name of the owner of the property: ");
    String propOwner  = sc.nextLine();

    Property newproperty = new Property(munNumber, munName, lotNum, secNum, propArea, propOwner, propName);

    TestData.properties.add(newproperty);

    System.out.println("New Property has been added:");
    System.out.println(newproperty);
  }

  public static Property findPropertyByInputID() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the municipality number, lot number, and section number (1504-54/73): ");
    String id = sc.nextLine();

    String munNumber = id.substring(0, 4);
    int lotNum = Integer.parseInt(id.substring(5, 7));
    int secNum = Integer.parseInt(id.substring(8));

    for (Property property : TestData.properties) {
      if (property.getMunicipalityNumber().equals(munNumber) &&
          property.getLotNumber() == lotNum &&
          property.getSectionNumber() == secNum) {
        return property;
      }
    }
    return null;
  }

  public static double averageMeters(){
    int listLength = 0;
    double totalArea = 0;
    for (Property property : TestData.properties){
      totalArea += property.getSquareMeters();
      listLength += 1;
    }
    return totalArea / listLength;
  }



}
