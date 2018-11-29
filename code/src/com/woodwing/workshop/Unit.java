package com.woodwing.workshop;

// Understands a specific metric
public class Unit {
    public static final Unit SMALL = new Unit();
    public static final Unit VASE = new Unit(2, SMALL);
    public static final Unit PUL = new Unit(2, VASE);
    public static final Unit PITCHER = new Unit(3, PUL);
    public static final Unit CRATE = new Unit(5, PITCHER);
    public static final Unit FUST = new Unit(7, CRATE);
    public static final Unit TANKWAGON = new Unit(1200, FUST);

    public static final Unit INCH = new Unit();
    public static final Unit FOOT = new Unit(12, INCH);
    public static final Unit YARD = new Unit(3, FOOT);
    public static final Unit CHAIN = new Unit(22, YARD);
    public static final Unit FURLONG = new Unit(10, CHAIN);
    public static final Unit MILE = new Unit(8, FURLONG);

    private Unit baseUnit;
    private double baseUnitRatio;

    private Unit() {
        this.baseUnit = this;
        this.baseUnitRatio = 1;
    }

    private Unit(double relativeRatio, Unit relativeUnit) {
        this.baseUnit = relativeUnit.baseUnit;
        this.baseUnitRatio = relativeRatio * relativeUnit.baseUnitRatio;
    }

    public Quantity s(double amount) {
        return new Quantity(this, amount);
    }

    public Quantity es(double amount) {
        return this.s(amount);
    }

    double convertAmount(double amount, Unit other) {
        if (!isCompatible(other)) throw new IllegalArgumentException("Incompatible Unit types!");

        return amount * other.baseUnitRatio / this.baseUnitRatio;
    }

    int hashCode(double amount) {
        return Double.hashCode(amount * baseUnitRatio);
    }

    private boolean isCompatible(Unit other) {
        return this.baseUnit == other.baseUnit;
    }
}
