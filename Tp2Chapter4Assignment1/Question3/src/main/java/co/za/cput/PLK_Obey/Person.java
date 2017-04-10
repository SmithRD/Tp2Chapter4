package co.za.cput.PLK_Obey;

/**
 *
 */
public class Person implements InterfacePerson {
    private String name;
    private PreviousHome home;

    Person(String nm, int hmNumber) {
        name = nm;
        home = new PreviousHome(hmNumber);
    }

    public String getName() {
        return name;
    }

    public int getPreviousHomeNumber() {
        return home.getNumber();
    }
}
