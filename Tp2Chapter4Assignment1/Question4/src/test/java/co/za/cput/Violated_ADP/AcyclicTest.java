package co.za.cput.Violated_ADP;

import co.za.cput.Violate_ADP.Parent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class AcyclicTest {
    private Parent mom;

    @Before
    public void setUp() throws Exception
    {
        mom = new Parent(1500);
    }

    @Test
    public void testADPViolated() throws Exception
    {
        Assert.assertNotNull(mom.getMoney());
    }
}
