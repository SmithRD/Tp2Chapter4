package co.za.cput.inheritance;

/**
 *
 */
public class GamingComputer extends Computer{
    private String gpuRamType;
    private int gpuRamSizeInMegahertz;


    public GamingComputer(String processorName, int numberOfCores, int ramInGigahertz, String gpuRamType, int gpuRamSizeInMegahertz) {
        super(processorName, numberOfCores, ramInGigahertz);
        this.gpuRamType = gpuRamType;
        this.gpuRamSizeInMegahertz = gpuRamSizeInMegahertz;
    }


    public String getGpuRamType() {
        return gpuRamType;
    }

    public int getGpuRamSizeInMegahertz() {
        return gpuRamSizeInMegahertz;
    }

    public void printComputerInformation()
    {
        System.out.println(
                "Processor Name = " + super.getProcessorName() +
                        ", Number of Cores = " + super.getNumberOfCores() +
                        ", Ram in Gigahertz = " + super.getRamInGigahertz() +
                        ", GPU Ram Type = " +gpuRamType +
                        ", GPU Ram Size in MegaHertz = " + gpuRamSizeInMegahertz);

    }
}
