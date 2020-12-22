package by.ralovets.epamcourse.entity.appliance.impl;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.ApplianceCreationException;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.appliance.criteria.SearchCriteria.Laptop.*;
import static java.util.Objects.requireNonNull;

public class Laptop implements Appliance {

    private int batteryCapacity;
    private int memoryRom;
    private int systemMemory;
    private double displayInches;
    private String os;
    private double cpu;

    public Laptop(HashMap<String, String> params) throws ApplianceCreationException {

        try {
            batteryCapacity = Integer.parseInt(
                    requireNonNull(params.get(BATTERY_CAPACITY.toString())));
            memoryRom = Integer.parseInt(
                    requireNonNull(params.get(MEMORY_ROM.toString())));
            systemMemory = Integer.parseInt(
                    requireNonNull(params.get(SYSTEM_MEMORY.toString())));
            displayInches = Double.parseDouble(
                    requireNonNull(params.get(DISPLAY_INCHES.toString())));
            cpu = Double.parseDouble(requireNonNull(params.get(CPU.toString())));
            os = requireNonNull(params.get(OS.toString()));
        } catch (NumberFormatException | NullPointerException e) {
            throw new ApplianceCreationException(e.getMessage());
        }
    }

    public Laptop() {
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {

        return getClass().getSimpleName().toUpperCase() +
                " : " +
                BATTERY_CAPACITY +
                "=" +
                batteryCapacity +
                ", " +
                MEMORY_ROM +
                "=" +
                memoryRom +
                ", " +
                SYSTEM_MEMORY +
                "=" +
                systemMemory +
                ", " +
                DISPLAY_INCHES +
                "=" +
                displayInches +
                ", " +
                OS +
                "=" +
                os +
                ", " +
                CPU +
                "=" +
                cpu;
    }
}
