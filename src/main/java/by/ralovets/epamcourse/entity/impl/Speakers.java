package by.ralovets.epamcourse.entity.impl;

import by.ralovets.epamcourse.entity.Appliance;

public class Speakers implements Appliance {

    private int powerConsumption;
    private int numberOfSpeakers;
    private double frequencyRangeStart;
    private double frequencyRangeEnd;
    private int cordLength;

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
}
