package com.woodwing.workshop;

import java.util.Objects;

// Understands a measurement of beer
public class Biertjes {
    public static final double KLEINTJE = 1;
    public static final double VAASJE = KLEINTJE * 2;
    public static final double PUL = VAASJE * 2;
    public static final double PITCHER = PUL * 3;
    public static final double KRAT = PITCHER * 5;
    public static final double FUST = KRAT * 7;
    public static final double TANKWAGEN = FUST * 1200;

    private double amount;

    public Biertjes(double unit, double amount) {
        this.amount = unit * amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biertjes biertjes = (Biertjes) o;
        return Double.compare(biertjes.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
