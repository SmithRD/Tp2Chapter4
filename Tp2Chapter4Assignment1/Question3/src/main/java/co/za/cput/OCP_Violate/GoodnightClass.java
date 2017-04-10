package co.za.cput.OCP_Violate;

/**
 *
 */
public class GoodnightClass {
    private String language;

    public GoodnightClass(String language)
    {
        this.language = language;
    }

    public String getGoodnight()
    {
        String message = "Goodnight";
        if (language.equals("Afrikaans")) {
            message = "Goeie nag";

        } else if (language.equals("Japanese")) {
            message = "Oyasuminasai";

        } else {
            return message;
        }
        return message;
    }
}
