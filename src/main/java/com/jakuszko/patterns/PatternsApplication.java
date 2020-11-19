package com.jakuszko.patterns;

import com.jakuszko.patterns.builder.FlightLeg;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();
        System.out.println(leg);

        FlightLeg leg1 = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").build();
        System.out.println(leg1);
    }

}
