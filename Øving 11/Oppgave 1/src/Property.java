public class Property {
  private String municipalityNumber;
  private String municipalityName;
  private int lotNumber;
  private int sectionNumber;
  private double squareMeters;
  private String propertyOwner;
  private String propertyName;

  public Property(String municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, double squareMeters, String propertyOwner, String propertyName) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.squareMeters = squareMeters;
    this.propertyOwner = propertyOwner;
    this.propertyName = propertyName;
  }

  public String getMunicipalityNumber() {
    return this.municipalityNumber;
  }

  public String getMunicipalityName() {
    return this.municipalityName;
  }

  public int getLotNumber() {
    return this.lotNumber;
  }

  public int getSectionNumber() {
    return this.sectionNumber;
  }

  public double getSquareMeters() {
    return this.squareMeters;
  }

  public String getPropertyOwner() {
    return this.propertyOwner;
  }

  public String getPropertyName() {
    return this.propertyName;
  }

  public void setMunicipalityNumber(String municipalityNumber) {
    this.municipalityNumber = municipalityNumber;
  }

  public void setMunicipalityName(String municipalityName) {
    this.municipalityName = municipalityName;
  }

  public void setLotNumber(int lotNumber) {
    this.lotNumber = lotNumber;
  }

  public void setSectionNumber(int sectionNumber) {
    this.sectionNumber = sectionNumber;
  }

  public void setSquareMeters(double squareMeters) {
    this.squareMeters = squareMeters;
  }

  public void setPropertyOwner(String propertyOwner) {
    this.propertyOwner = propertyOwner;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public String toString() {
    String formatString = "%s-%s/%s Municipality name: %s Area of property: %s square meters Property owner: %s";
    if (this.propertyName.isEmpty()) {
      return String.format(formatString, municipalityNumber, lotNumber, sectionNumber, municipalityName, squareMeters, propertyOwner);
    } else {
      formatString += " Name of property: %s";
      return String.format(formatString, municipalityNumber, lotNumber, sectionNumber, municipalityName, squareMeters, propertyOwner, propertyName);
    }
  }
}
