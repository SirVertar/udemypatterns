package com.jakuszko.patterns.builder;

import java.util.function.DoubleBinaryOperator;

public class FlightLeg {
    private String from;
    private String to;
    private boolean delayed;
    private int price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private boolean delayed;
        private int price;

        public FlightLegBuilder() {
            this.from = from;
        }
        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLegBuilder from(String from) {
            this.from = from;
            return this;
        }

        public FlightLegBuilder to(String to) {
            this.to = to;
            return this;
        }

        public FlightLegBuilder delayed(Boolean delayed) {
            this.delayed = delayed;
            return this;
        }

        public FlightLegBuilder price(Integer price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if (price == 0) {
                throw new IllegalStateException("Brak wymaganej ceny");
            }
            return new FlightLeg(this);
        }
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }
}
