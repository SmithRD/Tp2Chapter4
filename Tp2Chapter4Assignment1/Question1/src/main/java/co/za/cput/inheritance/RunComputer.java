package co.za.cput.inheritance;

/**
 *
 */
public class RunComputer {
        public static void main (String[]args)
        {
            GamingComputer game = new GamingComputer("Intel i7", 8, 8,"DDR5",2);
            game.printComputerInformation();
        }
}
