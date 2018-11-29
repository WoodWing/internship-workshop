package com.woodwing.workshop;

// Understands a specific metric
public class Unit {
    public static final Unit KLEINTJE = new Unit();
    public static final Unit VAASJE = new Unit(2, KLEINTJE);
    public static final Unit PUL = new Unit(2, VAASJE);
    public static final Unit PITCHER = new Unit(3, PUL);
    public static final Unit KRAT = new Unit(5, PITCHER);
    public static final Unit FUST = new Unit(7, KRAT);
    public static final Unit TANKWAGEN = new Unit(1200, FUST);

    public static final Unit INCH = new Unit();
    public static final Unit FOOT = new Unit(12, INCH);
    public static final Unit YARD = new Unit(3, FOOT);
    public static final Unit CHAIN = new Unit(22, YARD);
    public static final Unit FURLONG = new Unit(10, CHAIN);
    public static final Unit MILE = new Unit(8, FURLONG);

    private double baseUnitRatio;

    private Unit() {
        this.baseUnitRatio = 1;
    }

    private Unit(double relativeRatio, Unit relativeUnit) {
        this.baseUnitRatio = relativeRatio * relativeUnit.baseUnitRatio;
    }

    double convertAmount(double amount, Unit other) {
        return amount * other.baseUnitRatio / this.baseUnitRatio;
    }

    int hashCode(double amount) { return Double.hashCode(amount * baseUnitRatio); }
}
