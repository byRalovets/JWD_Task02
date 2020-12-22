package by.ralovets.epamcourse.entity.appliance.impl;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.ApplianceCreationException;

import java.util.HashMap;
import java.util.Objects;

import static by.ralovets.epamcourse.entity.appliance.criteria.SearchCriteria.Oven.*;
import static java.util.Objects.requireNonNull;

public class Oven implements Appliance {

    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private int height;
    private int width;

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
            height = Integer.parseInt(
                    requireNonNull(params.get(HEIGHT.toString())));
            width = Integer.parseInt(
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Oven oven = (Oven) obj;
        return powerConsumption == oven.powerConsumption
                && weight == oven.weight
                && capacity == oven.capacity
                && depth == oven.depth
                && height == oven.height
                && width == oven.width;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + powerConsumption;
        result = prime * result + weight;
        result = prime * result + height;
        result = prime * result + width;
        result = prime * result + capacity;
        result = prime * result + depth;

        return result;
    }
}
