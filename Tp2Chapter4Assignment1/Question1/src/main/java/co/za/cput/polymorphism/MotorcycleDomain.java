package co.za.cput.polymorphism;

/**
 *
 */
public class MotorcycleDomain {
    private String type;
    private String brand;
    private String model;
    private int engineSizeInCubicCentimeters;

    public MotorcycleDomain(String type, String brand, String model, int engineSizeInCubicCentimeters) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.engineSizeInCubicCentimeters = engineSizeInCubicCentimeters;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineSizeInCubicCentimeters() {
        return engineSizeInCubicCentimeters;
    }
}
