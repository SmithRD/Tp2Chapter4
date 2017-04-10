package co.za.cput.composition;

/**
 *
 */
public class RunComputer {
    public static void main (String[]args)
    {
        GamingComputer game = new GamingComputer("Intel i5", 2, 8,"DDR5",2);
        game.printGameComputerInformation();
    }
}
