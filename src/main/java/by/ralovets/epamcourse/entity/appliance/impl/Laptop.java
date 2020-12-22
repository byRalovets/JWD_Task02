package by.ralovets.epamcourse.entity.appliance.impl;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.ApplianceCreationException;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.appliance.criteria.SearchCriteria.Laptop.*;
import static java.util.Objects.requireNonNull;

public class Laptop implements Appliance {

    private static final long serialVersionUUID = -1L;

    private int batteryCapacity;
    private int memoryRom;
    private int systemMemory;
    private int displayInches;
    private String os;
    private int cpu;

    public Laptop(HashMap<String, String> params) throws ApplianceCreationException {

        try {
            batteryCapacity = Integer.parseInt(
                    requireNonNull(params.get(BATTERY_CAPACITY.toString())));
            memoryRom = Integer.parseInt(
                    requireNonNull(params.get(MEMORY_ROM.toString())));
            systemMemory = Integer.parseInt(
                    requireNonNull(params.get(SYSTEM_MEMORY.toString())));
            displayInches = Integer.parseInt(
                    requireNonNull(params.get(DISPLAY_INCHES.toString())));
            cpu = Integer.parseInt(requireNonNull(params.get(CPU.toString())));
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

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Laptop laptop = (Laptop) obj;
        return batteryCapacity == laptop.batteryCapacity
                && memoryRom == laptop.memoryRom
                && systemMemory == laptop.systemMemory
                && displayInches == laptop.displayInches
                && os.equals(laptop.os)
                && cpu == laptop.cpu;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + batteryCapacity;
        result = prime * result + memoryRom;
        result = prime * result + systemMemory;
        result = prime * result + displayInches;
        result = prime * result + cpu;
        result = prime * result + os.hashCode();

        return result;
    }
}
