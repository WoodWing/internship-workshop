package com.woodwing.workshop;

import java.util.Objects;

public class Quantity {
    public static final double KLEINTJE = 1;
    public static final double VAASJE = KLEINTJE * 2;
    public static final double PUL = VAASJE * 2;
    public static final double PITCHER = PUL * 3;
    public static final double KRAT = PITCHER * 5;
    public static final double FUST = KRAT * 7;
    public static final double TANKWAGEN = FUST * 1200;

    public static final double INCH = 1;
    public static final double FOOT = INCH * 12;
    public static final double YARD = FOOT * 3;
    public static final double CHAIN = YARD * 22;
    public static final double FURLONG = CHAIN * 10;
    public static final double MILE = FURLONG * 8;

    private double amount;

    public Quantity(double unit, double amount) {
        this.amount = unit * amount;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Quantity quantity = (Quantity) other;
        return Double.compare(quantity.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
