package co.za.cput.composition;

/**
 *
 */
public class Computer {
    private String processorName;
    private int numberOfCores;
    private int ramInGigahertz;

    public Computer(String processorName, int numberOfCores, int ramInGigahertz) {
        this.processorName = processorName;
        this.numberOfCores = numberOfCores;
        this.ramInGigahertz = ramInGigahertz;
    }


    public String getProcessorName() {
        return processorName;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getRamInGigahertz() {
        return ramInGigahertz;
    }

    public void printComputerInformation()
    {
        System.out.println(
                "Processor Name = " + getProcessorName() +
                        ", Number of Cores = " + getNumberOfCores() +
                        ", Ram in Gigahertz = " + getRamInGigahertz());
    }
}
