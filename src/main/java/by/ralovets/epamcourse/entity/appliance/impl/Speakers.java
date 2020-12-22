package by.ralovets.epamcourse.entity.appliance.impl;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.ApplianceCreationException;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.appliance.criteria.SearchCriteria.Speakers.*;
import static java.util.Objects.requireNonNull;

public class Speakers implements Appliance {

    private int powerConsumption;
    private int numberOfSpeakers;
    private double frequencyRangeStart;
    private double frequencyRangeEnd;
    private int cordLength;

    public Speakers(HashMap<String, String> params) throws ApplianceCreationException {
        try {
            powerConsumption = Integer.parseInt(
                    requireNonNull(params.get(POWER_CONSUMPTION.toString())));
            numberOfSpeakers = Integer.parseInt(
                    requireNonNull(params.get(NUMBER_OF_SPEAKERS.toString())));
            frequencyRangeStart = Double.parseDouble(
                    requireNonNull(params.get(FREQUENCY_RANGE_START.toString())));
            frequencyRangeEnd = Double.parseDouble(
                    requireNonNull(params.get(FREQUENCY_RANGE_END.toString())));
            cordLength = Integer.parseInt(
                    requireNonNull(params.get(CORD_LENGTH.toString())));
        } catch (NumberFormatException | NullPointerException e) {
            throw new ApplianceCreationException(e.getMessage());
        }
    }

    public Speakers() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getFrequencyRangeStart() {
        return frequencyRangeStart;
    }

    public void setFrequencyRangeStart(double frequencyRangeStart) {
        this.frequencyRangeStart = frequencyRangeStart;
    }

    public double getFrequencyRangeEnd() {
        return frequencyRangeEnd;
    }

    public void setFrequencyRangeEnd(double frequencyRangeEnd) {
        this.frequencyRangeEnd = frequencyRangeEnd;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {

        return getClass().getSimpleName().toUpperCase() +
                " : " +
                POWER_CONSUMPTION +
                "=" +
                powerConsumption +
                ", " +
                NUMBER_OF_SPEAKERS +
                "=" +
                numberOfSpeakers +
                ", " +
                FREQUENCY_RANGE_START +
                "=" +
                frequencyRangeStart +
                ", " +
                FREQUENCY_RANGE_END +
                "=" +
                frequencyRangeEnd +
                ", " +
                CORD_LENGTH +
                "=" +
                cordLength;
    }
}
