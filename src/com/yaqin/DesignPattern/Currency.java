package com.yaqin.DesignPattern;

public abstract class Currency {
    public Currency(Country country) {
        this.country = country;
        //arrangeParts();
    }
    protected abstract void exchange();

    private Country country = null;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country model) {
        this.country = country;
    }
}
