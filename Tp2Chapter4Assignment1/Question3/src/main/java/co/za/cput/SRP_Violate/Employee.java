package co.za.cput.SRP_Violate;

/**
 *
 */
public class Employee {
    private String employeeName;
    private String employeeSurname;
    private double employeeMonthlySalary;


    public Employee(String employeeName, String employeeSurname, double employeeMonthlySalary)
    {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeeMonthlySalary = employeeMonthlySalary;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public double getEmployeeMonthlySalary() {
        return employeeMonthlySalary;
    }
    //This part is incorrect because it makes the class assume more than one responsibility
    public String canBuyNewCar(int employeeMonthlySalary)
    {
        if (employeeMonthlySalary > 500000.00)
            return "You can buy a new car";
        else return "You can not buy a new car";
    }
}
