package co.za.cput.polymorphism;

/**
 *
 */
public class NakedBikeImpl implements MotorcycleService{

    public MotorcycleDomain getMotorcycle()
    {
        MotorcycleDomain naked = new MotorcycleDomain("naked", "Ducati", "Monster", 803);
        return naked;
    }
}
