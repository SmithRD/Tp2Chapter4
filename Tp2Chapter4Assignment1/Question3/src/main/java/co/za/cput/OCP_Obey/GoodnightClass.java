package co.za.cput.OCP_Obey;

/**
 *
 */
public class GoodnightClass {
    private SayGoodnight night;

    public GoodnightClass(SayGoodnight night)
    {
        this.night = night;
    }

    public String goodnight()
    {
        return this.night.goodnight();
    }
}
