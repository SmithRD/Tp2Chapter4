package co.za.cput.polymorphism;

/**
 *
 */
public class CruiserImpl implements MotorcycleService{

    public MotorcycleDomain getMotorcycle()
    {
        MotorcycleDomain cruiser = new MotorcycleDomain("cruiser","Harley-Davidson", "Streetbob", 1200);
        return cruiser;
    }
}
