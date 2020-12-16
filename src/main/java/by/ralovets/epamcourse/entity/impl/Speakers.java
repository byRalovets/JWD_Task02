package by.ralovets.epamcourse.entity.impl;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.SearchCriteria;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.criteria.SearchCriteria.Speakers.*;
import static java.util.Objects.requireNonNull;

public class Speakers implements Appliance {

    private int powerConsumption;
    private int numberOfSpeakers;
    private double frequencyRangeStart;
    private double frequencyRangeEnd;
    private int cordLength;

    public Speakers(HashMap<SearchCriteria.ApplianceCriteria, Object> params) {
        powerConsumption = (Integer) requireNonNull(
                params.get(POWER_CONSUMPTION));
        numberOfSpeakers = (Integer) requireNonNull(
                params.get(NUMBER_OF_SPEAKERS));
        frequencyRangeStart = (Double) requireNonNull(
                params.get(FREQUENCY_RANGE_START));
        frequencyRangeEnd = (Double) requireNonNull(
                params.get(FREQUENCY_RANGE_END));
        cordLength = (Integer) requireNonNull(params.get(CORD_LENGTH));
    }

    public Speakers() {}

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
}
