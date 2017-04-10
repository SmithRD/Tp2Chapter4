package co.za.cput.Correct_ADP;

/**
 *
 */
public class Bank implements InterfaceBank{

    public double getMoney(double amount) {
        return amount*0.15;
    }
}
