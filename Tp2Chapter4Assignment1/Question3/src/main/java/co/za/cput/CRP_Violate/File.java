package co.za.cput.CRP_Violate;

/**
 *
 */
public abstract class File {
    Boolean hasSpace() {
        return true;
    }

    Boolean canOpen()
    {
        return true;
    }

    public abstract Boolean containsWords();
}
