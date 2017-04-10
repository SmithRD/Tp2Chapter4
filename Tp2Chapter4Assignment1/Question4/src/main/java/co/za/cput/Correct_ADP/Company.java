package co.za.cput.Correct_ADP;

/**
 *
 */
public class Company {

    private InterfaceBank money = new Bank();

    public double getMoney(double amount)
    {
        return money.getMoney(amount);
    }
}
