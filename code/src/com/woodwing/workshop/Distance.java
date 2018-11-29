package com.woodwing.workshop;

import java.util.Objects;

// Understands a measurement of distance
public class Distance {
    public static final double INCH = 1;
    public static final double FOOT = INCH * 12;
    public static final double YARD = FOOT * 3;
    public static final double CHAIN = YARD * 22;
    public static final double FURLONG = CHAIN * 10;
    public static final double MILE = FURLONG * 8;

    private double amount;

    public Distance(double unit, double amount) {
        this.amount = unit * amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance = (Distance) o;
        return Double.compare(distance.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
