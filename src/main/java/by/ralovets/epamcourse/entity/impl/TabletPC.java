package by.ralovets.epamcourse.entity.impl;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.SearchCriteria;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.criteria.SearchCriteria.TabletPC.*;
import static java.util.Objects.requireNonNull;

public class TabletPC implements Appliance {

    private int batteryCapacity;
    private int displayInches;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC(HashMap<SearchCriteria.ApplianceCriteria, Object> params) {
        batteryCapacity = (Integer) requireNonNull(params.get(BATTERY_CAPACITY));
        displayInches = (Integer) requireNonNull(params.get(DISPLAY_INCHES));
        memoryROM = (Integer) requireNonNull(params.get(MEMORY_ROM));
        flashMemoryCapacity = (Integer) requireNonNull(
                params.get(FLASH_MEMORY_CAPACITY));
        color = (String) requireNonNull(params.get(COLOR));
    }

    public TabletPC() {}

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
