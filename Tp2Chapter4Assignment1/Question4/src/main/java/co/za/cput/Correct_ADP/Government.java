package co.za.cput.Correct_ADP;

/**
 *
 */
public class Government {
    private Company tax = new Company();

    public double getMoney()
    {
        return tax.getMoney(1500);
    }
}
