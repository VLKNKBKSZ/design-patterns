package com.vlkn.adapterOfAbstractTableModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rocket {

    private String name;
    private double price;
    private double apogee;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getApogee() {
        return this.apogee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setApogee(double apogee) {
        this.apogee = apogee;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Rocket)) return false;
        final Rocket other = (Rocket) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
        if (Double.compare(this.getApogee(), other.getApogee()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Rocket;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final long $price = Double.doubleToLongBits(this.getPrice());
        result = result * PRIME + (int) ($price >>> 32 ^ $price);
        final long $apogee = Double.doubleToLongBits(this.getApogee());
        result = result * PRIME + (int) ($apogee >>> 32 ^ $apogee);
        return result;
    }

    public String toString() {
        return "Rocket(name=" + this.getName() + ", price=" + this.getPrice() + ", apogee=" + this.getApogee() + ")";
    }
}
