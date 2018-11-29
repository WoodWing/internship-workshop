package com.woodwing.workshop;

// understands a specific measurement
public class Quantity {
    private double amount;
    private Unit unit;

    public Quantity(Unit unit, double amount) {
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        return this.amount == convertedAmount((Quantity) other);
    }

    @Override
    public int hashCode() {
        return unit.hashCode(amount);
    }

    private double convertedAmount(Quantity other) {
        return this.unit.convertAmount(other.amount, other.unit);
    }
}
