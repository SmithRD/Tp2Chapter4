package co.za.cput.config;

import co.za.cput.polymorphism.CruiserImpl;
import co.za.cput.polymorphism.MotorcycleService;
import co.za.cput.polymorphism.NakedBikeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */

@Configuration
public class PolymorphismConfig {

    @Bean(name = "Streetbob")
    public MotorcycleService getCruiser()
    {
        return new CruiserImpl();
    }

    @Bean(name = "Monster")
    public MotorcycleService getNakedBike()
    {
        return new NakedBikeImpl();
    }
}
