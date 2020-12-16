package by.ralovets.epamcourse.entity.impl;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.SearchCriteria;

import java.util.HashMap;

import static java.util.Objects.requireNonNull;
import static by.ralovets.epamcourse.entity.criteria.SearchCriteria.Laptop.*;

public class Laptop implements Appliance {

    private double batteryCapacity;
    private int memoryRom;
    private int systemMemory;
    private double displayInches;
    private String os;
    private double cpu;

    public Laptop(HashMap<SearchCriteria.ApplianceCriteria, Object> params) {
        batteryCapacity = (Double) requireNonNull(params.get(BATTERY_CAPACITY));
        memoryRom = (Integer) requireNonNull(params.get(MEMORY_ROM));
        systemMemory = (Integer) requireNonNull(params.get(SYSTEM_MEMORY));
        displayInches = (Double) requireNonNull(params.get(DISPLAY_INCHES));
        cpu = (Double) requireNonNull(params.get(CPU));
        os = (String) requireNonNull(params.get(OS));
    }

    public Laptop() {}

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
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

}
