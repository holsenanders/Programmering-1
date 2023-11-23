import java.util.ArrayList;
public class TestData {
  public static ArrayList<Property> properties = new ArrayList<Property>();

  public static void init() {
    Property property1 = new Property("1145", "Gloppen", 77, 631, 1017.6, "Jens Olsen", "");
    Property property2 = new Property("1445", "Gloppen", 77, 131, 661, "Nicolay Madsen", "Syningom");
    Property property3 = new Property("1145", "Gloppen", 75, 19, 650.6, "Evilyn Jensen", "Fugletunn");
    Property property4 = new Property("1145", "Gloppen", 74, 188, 1457.2, "Karl Ove Bråten", "");
    Property property5 = new Property("1145", "Gloppen", 69, 47, 1339.4, "Elsa Indregård", "Høiberg");

    properties.add(property1);
    properties.add(property2);
    properties.add(property3);
    properties.add(property4);
    properties.add(property5);
  }

  public static void displayProperties() {
    for (Property property : properties) {
      System.out.println(property.toString());
    }
  }

}

