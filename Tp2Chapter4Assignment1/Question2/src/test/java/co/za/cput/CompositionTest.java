package co.za.cput;

import co.za.cput.composition.GamingComputer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class CompositionTest {

    private GamingComputer games;

    @Before
    public void setUp(){games = new GamingComputer("Intel i5", 4, 8,"DDR5",8);}

    @Test
    public void testGamingComputerNonNullness() throws Exception {
        Assert.assertNotNull(games);
    }

    @Test
    public void testGetProcessorName() throws Exception{
        Assert.assertEquals("Intel i5", games.getSuperClass().getProcessorName());
    }

    @Test
    public void testGetNumberOfCores() throws Exception{
        Assert.assertEquals(4, games.getSuperClass().getNumberOfCores());
    }

    @Test
    public void testGetRamInGigahertz() throws Exception{
        Assert.assertEquals(8, games.getSuperClass().getRamInGigahertz());
    }

    @Test
    public void testGpuRamType() throws Exception{
        Assert.assertEquals("DDR5", games.getGpuRamType());
    }

    @Test
    public void testGetGpuRamSizeInMegahertz() throws Exception {
        Assert.assertEquals(8, games.getGpuRamSizeInMegahertz());
    }
}

