package by.ralovets.epamcourse.entity.appliance.impl;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.ApplianceCreationException;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.appliance.criteria.SearchCriteria.Refrigerator.*;
import static java.util.Objects.requireNonNull;

public class Refrigerator implements Appliance {

    private int powerConsumption;
    private int weight;
    private double freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator(HashMap<String, String> params) throws ApplianceCreationException {
        try {
            powerConsumption = Integer.parseInt(
                    requireNonNull(params.get(POWER_CONSUMPTION.toString())));
            weight = Integer.parseInt(
                    requireNonNull(params.get(WEIGHT.toString())));
            freezerCapacity = Double.parseDouble(
                    requireNonNull(params.get(FREEZER_CAPACITY.toString())));
            overallCapacity = Double.parseDouble(
                    requireNonNull(params.get(OVERALL_CAPACITY.toString())));
            height = Integer.parseInt(
                    requireNonNull(params.get(HEIGHT.toString())));
            width = Integer.parseInt(
                    requireNonNull(params.get(WIDTH.toString())));
        } catch (NumberFormatException | NullPointerException e) {
            throw new ApplianceCreationException(e.getMessage());
        }
    }

    public Refrigerator() {
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
                FREEZER_CAPACITY +
                "=" +
                freezerCapacity +
                ", " +
                OVERALL_CAPACITY +
                "=" +
                overallCapacity +
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

        Refrigerator refrigerator = (Refrigerator) obj;
        return powerConsumption == refrigerator.powerConsumption
                && weight == refrigerator.weight
                && freezerCapacity == refrigerator.freezerCapacity
                && overallCapacity == refrigerator.overallCapacity
                && height == refrigerator.height
                && width == refrigerator.width;
    }
}
