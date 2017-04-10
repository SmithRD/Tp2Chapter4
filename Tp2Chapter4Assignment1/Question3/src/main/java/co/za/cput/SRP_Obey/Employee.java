package co.za.cput.SRP_Obey;

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
}
