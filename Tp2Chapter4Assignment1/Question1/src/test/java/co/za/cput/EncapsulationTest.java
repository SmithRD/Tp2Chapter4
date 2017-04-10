package co.za.cput;

import co.za.cput.encapsulation.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class EncapsulationTest {
    private Employee emp;
    @Before
    public void setUp(){emp = new Employee("Dave Smith", 123456, "intern", 5000.00);}

    @Test
    public void testEmployeeNonNullness() throws Exception {
        Assert.assertNotNull(emp);
    }

    @Test
    public void testGetEmployeeName() throws Exception{
        Assert.assertEquals("Dave Smith", emp.getEmployeeName());
    }

    @Test
    public void testGetEmployeeNumber() throws Exception{
        Assert.assertEquals(123456, emp.getEmployeeNumber());
    }

    @Test
    public void testGetEmployeePosition() throws Exception{
        Assert.assertEquals("intern", emp.getEmployeePosition());
    }

    @Test
    public void testGetEmployeeSalary() throws Exception{
        Assert.assertEquals(5000.00, emp.getEmployeeSalary(),0.5);
    }
}
