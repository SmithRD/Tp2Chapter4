package co.za.cput.encapsulation;

/**
 *
 */
public class Employee {


    private String employeeName;
    private int employeeNumber;
    private String employeePosition;
    private double employeeSalary;

    public Employee(String employeeName, int employeeNumber, String employeePosition, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void printEmployeeInfo() {
        System.out.println(
                "Employee Name = " + employeeName +
                ", Employee Number = " + employeeNumber +
                ", Employee Position = " + employeePosition +
                ", Employee Salary = " + employeeSalary );

    }

}
