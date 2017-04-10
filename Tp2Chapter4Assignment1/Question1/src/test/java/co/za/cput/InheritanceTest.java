package co.za.cput;

import co.za.cput.inheritance.GamingComputer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class InheritanceTest {
    private GamingComputer game;
    @Before
    public void setUp(){game = new GamingComputer("Intel i5", 4, 8,"DDR5",8);}

    @Test
    public void testGamingComputerNonNullness() throws Exception {
        Assert.assertNotNull(game);
    }

    @Test
    public void testGetProcessorName() throws Exception{
        Assert.assertEquals("Intel i5", game.getProcessorName());
    }

    @Test
    public void testGetNumberOfCores() throws Exception{
        Assert.assertEquals(4, game.getNumberOfCores());
    }

    @Test
    public void testGetRamInGigahertz() throws Exception{
        Assert.assertEquals(8, game.getRamInGigahertz());
    }

    @Test
    public void testGpuRamType() throws Exception{
        Assert.assertEquals("DDR5", game.getGpuRamType());
    }

    @Test
    public void testGetGpuRamSizeInMegahertz() throws Exception {
        Assert.assertEquals(8, game.getGpuRamSizeInMegahertz());
    }
}
