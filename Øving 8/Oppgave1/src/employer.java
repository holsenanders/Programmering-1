public class employer {
    public final int employeeNr;
    public final int hireYear;
   public int monthlySalary;
   public double taxRate;

   public int yearsWorkedTresh;

    public employer(int employeeNr, int hireYear, int monthlySalary, double taxRate, int yearsWorkedTresh) {
        this.employeeNr = employeeNr;
        this.hireYear = hireYear;
        this.monthlySalary = monthlySalary;
        this.taxRate = taxRate;
        this.yearsWorkedTresh = yearsWorkedTresh;
    }

    public int getEmployeeNr() {
        return employeeNr;
    }
    public int getHireYear() {
        return hireYear;
    }
    public int getMonthlySalary() {
        return monthlySalary;
    }
    public double getTaxRate() {
        return taxRate;
    }
    public int getYearsWorkedTresh() {
        return yearsWorkedTresh;
    }
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

}
