package co.za.cput.Violate_ADP;

/**
 *
 */
public class Parent {
    private int amount;
    private Company job = new Company();


    public Parent(int amnt) {
        amount = amnt;
    }

    public double getMoney() {
        return job.getMoney();
    }
}
