package by.ralovets.epamcourse.entity.appliance.impl;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.ApplianceCreationException;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.appliance.criteria.SearchCriteria.Oven.*;
import static java.util.Objects.requireNonNull;

public class Oven implements Appliance {

    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven(HashMap<String, String> params) throws ApplianceCreationException {
        try {
            powerConsumption = Integer.parseInt(
                    requireNonNull(params.get(POWER_CONSUMPTION.toString())));
            weight = Integer.parseInt(
                    requireNonNull(params.get(WEIGHT.toString())));
            capacity = Integer.parseInt(
                    requireNonNull(params.get(CAPACITY.toString())));
            depth = Integer.parseInt(
                    requireNonNull(params.get(DEPTH.toString())));
            height = Double.parseDouble(
                    requireNonNull(params.get(HEIGHT.toString())));
            width = Double.parseDouble(
                    requireNonNull(params.get(WIDTH.toString())));
        } catch (NumberFormatException | NullPointerException e) {
            throw new ApplianceCreationException(e.getMessage());
        }
    }

    public Oven() {
    }

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

    @Override
    public String toString() {

        return getClass().getSimpleName().toUpperCase() +
                " : " +
                POWER_CONSUMPTION +
                "=" +
                powerConsumption +
                ", " +
                WEIGHT +
                "=" +
                weight +
                ", " +
                CAPACITY +
                "=" +
                capacity +
                ", " +
                DEPTH +
                "=" +
                depth +
                ", " +
                HEIGHT +
                "=" +
                height +
                ", " +
                WIDTH +
                "=" +
                width;
    }
}
