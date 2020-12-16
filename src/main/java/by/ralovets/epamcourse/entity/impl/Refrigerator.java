package by.ralovets.epamcourse.entity.impl;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.SearchCriteria;

import java.util.HashMap;

import static java.util.Objects.requireNonNull;
import static by.ralovets.epamcourse.entity.criteria.SearchCriteria.Refrigerator.*;

public class Refrigerator implements Appliance {

    private int powerConsumption;
    private int weight;
    private double freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator(HashMap<SearchCriteria.ApplianceCriteria, Object> params) {
        powerConsumption = (Integer) requireNonNull(
                params.get(POWER_CONSUMPTION));
        weight = (Integer) requireNonNull(params.get(WEIGHT));
        freezerCapacity = (Double) requireNonNull(params.get(FREEZER_CAPACITY));
        overallCapacity = (Double) requireNonNull(params.get(OVERALL_CAPACITY));
        height = (Integer) requireNonNull(params.get(HEIGHT));
        width = (Integer) requireNonNull(params.get(WIDTH));
    }

    public Refrigerator() {}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
