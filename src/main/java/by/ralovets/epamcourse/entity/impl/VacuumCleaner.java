package by.ralovets.epamcourse.entity.impl;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.SearchCriteria;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.criteria.SearchCriteria.VacuumCleaner.*;
import static java.util.Objects.requireNonNull;

public class VacuumCleaner implements Appliance {

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private boolean motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(HashMap<SearchCriteria.ApplianceCriteria, Object> params) {
        powerConsumption = (Integer) requireNonNull(
                params.get(POWER_CONSUMPTION));
        filterType = (String) requireNonNull(params.get(FILTER_TYPE));
        bagType = (String) requireNonNull(params.get(BAG_TYPE));
        wandType = (String) requireNonNull(params.get(WAND_TYPE));
        motorSpeedRegulation = (Boolean) requireNonNull(
                params.get(MOTOR_SPEED_REGULATION));
        cleaningWidth = (Integer) requireNonNull(params.get(CLEANING_WIDTH));
    }

    public VacuumCleaner() {}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public boolean getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(boolean motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
