package by.ralovets.epamcourse.entity.impl;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.SearchCriteria;

import java.util.HashMap;

import static java.util.Objects.requireNonNull;
import static by.ralovets.epamcourse.entity.criteria.SearchCriteria.Oven.*;

public class Oven implements Appliance {

    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven(HashMap<SearchCriteria.ApplianceCriteria, Object> params) {
        powerConsumption = (Integer) requireNonNull(
                params.get(POWER_CONSUMPTION));
        weight = (Integer) requireNonNull(params.get(WEIGHT));
        capacity = (Integer) requireNonNull(params.get(CAPACITY));
        depth = (Integer) requireNonNull(params.get(DEPTH));
        height = (Double) requireNonNull(params.get(HEIGHT));
        width = (Double) requireNonNull(params.get(WIDTH));
    }

    public Oven() {}

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
