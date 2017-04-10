package co.za.cput;

import co.za.cput.config.PolymorphismConfig;
import co.za.cput.polymorphism.MotorcycleDomain;
import co.za.cput.polymorphism.MotorcycleService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class PolymorphismTest {

    private MotorcycleService bike;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(PolymorphismConfig.class);
        bike = (MotorcycleService)context.getBean("Monster");
    }

    @Test
    public void testMotorcycleNonNullness() throws Exception {
        MotorcycleDomain obj = bike.getMotorcycle();
        Assert.assertNotNull(obj);
    }

    @Test
    public void testGetType() throws Exception{
        MotorcycleDomain obj = bike.getMotorcycle();
        Assert.assertEquals(obj.getType(),"naked");
    }

    @Test
    public void testGetBrand() throws Exception{
        MotorcycleDomain obj = bike.getMotorcycle();
        Assert.assertEquals(obj.getBrand(),"Ducati");
    }

    @Test
    public void testGetModel() throws Exception{
        MotorcycleDomain obj = bike.getMotorcycle();
        Assert.assertEquals(obj.getModel(),"Monster");
    }

    @Test
    public void testGetEngineSizeInCubicCentimeters() throws Exception{
        MotorcycleDomain obj = bike.getMotorcycle();
        Assert.assertEquals(obj.getEngineSizeInCubicCentimeters(),803);
    }
}
