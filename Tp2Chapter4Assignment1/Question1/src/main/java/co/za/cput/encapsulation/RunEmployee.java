package co.za.cput.encapsulation;

/**
 *
 */
public class RunEmployee {
    public static void main (String[]args)
    {
        Employee emp = new Employee("John Smith", 2345876, "manager", 299000.00);
        emp.printEmployeeInfo();
    }
}

