package co.za.cput.composition;

/**
 *
 */
public class GamingComputer {

    private String gpuRamType;
    private int gpuRamSizeInMegahertz;
    private Computer comp;

    public GamingComputer(String processorName, int numberOfCores, int ramInGigahertz, String gpuRamType, int gpuRamSizeInMegahertz) {
        comp = new Computer(processorName, numberOfCores, ramInGigahertz);
        this.gpuRamType = gpuRamType;
        this.gpuRamSizeInMegahertz = gpuRamSizeInMegahertz;
    }


    public String getGpuRamType() {
        return gpuRamType;
    }

    public int getGpuRamSizeInMegahertz() {
        return gpuRamSizeInMegahertz;
    }

    public Computer getSuperClass()
    {
        return comp;
    }

    public void printGameComputerInformation()
    {
        System.out.println(
                "Processor Name = " + comp.getProcessorName() +
                        ", Number of Cores = " + comp.getNumberOfCores() +
                        ", Ram in Gigahertz = " + comp.getRamInGigahertz() +
                        ", GPU Ram Type = " +gpuRamType +
                        ", GPU Ram Size in MegaHertz = " + gpuRamSizeInMegahertz);

    }
}
