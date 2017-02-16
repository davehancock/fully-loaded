package com.djh.fullyloaded.coffee.domain;

/**
 * A bona fide Java Bean Coffee Bean.
 * <p>
 * Obviously modelling Coffee with each bean as a single entity is stupid, but this is an example...
 *
 * @author David Hancock
 */
public class CoffeeBean {

    private String variety;

    private boolean roasted;

    private int weight;

    /**
     * @param weight in milligrams
     */
    public CoffeeBean(String variety, boolean roasted, int weight) {
        this.variety = variety;
        this.roasted = roasted;
        this.weight = weight;
    }

    public String getVariety() {
        return variety;
    }

    public boolean isRoasted() {
        return roasted;
    }

    /**
     * @return Weight in milligrams
     */
    public int getWeight() {
        return weight;
    }
}
