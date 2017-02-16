package com.djh.fullyloaded.coffee.domain;

/**
 * @author David Hancock
 */
public class Caffeine {

    private int dosage;

    /**
     * @param dosage in milligrams
     */
    public Caffeine(int dosage) {
        this.dosage = dosage;
    }

    /**
     * @return dosage in milligrams
     */
    public int getDosage() {
        return dosage;
    }
}
