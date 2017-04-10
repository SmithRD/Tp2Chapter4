package co.za.cput.inheritance;

/**
 *
 */
public abstract class Computer {
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

    public abstract void printComputerInformation();
}
