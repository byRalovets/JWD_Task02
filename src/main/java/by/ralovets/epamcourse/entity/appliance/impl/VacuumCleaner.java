package by.ralovets.epamcourse.entity.appliance.impl;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.ApplianceCreationException;

import java.util.HashMap;

import static by.ralovets.epamcourse.entity.appliance.criteria.SearchCriteria.VacuumCleaner.*;
import static java.util.Objects.requireNonNull;

public class VacuumCleaner implements Appliance {

    private static final long serialVersionUUID = -1L;

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private boolean motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(HashMap<String, String> params) throws ApplianceCreationException {
        try {
            powerConsumption = Integer.parseInt(
                    requireNonNull(params.get(POWER_CONSUMPTION.toString())));
            motorSpeedRegulation = Boolean.parseBoolean(
                    requireNonNull(params.get(MOTOR_SPEED_REGULATION.toString())));
            cleaningWidth = Integer.parseInt(
                    requireNonNull(params.get(CLEANING_WIDTH.toString())));
            filterType = requireNonNull(params.get(FILTER_TYPE.toString()));
            bagType = requireNonNull(params.get(BAG_TYPE.toString()));
            wandType = requireNonNull(params.get(WAND_TYPE.toString()));
        } catch (NumberFormatException | NullPointerException e) {
            throw new ApplianceCreationException(e.getMessage());
        }
    }

    public VacuumCleaner() {
    }

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

    @Override
    public String toString() {

        return getClass().getSimpleName().toUpperCase() +
                " : " +
                POWER_CONSUMPTION +
                "=" +
                powerConsumption +
                ", " +
                FILTER_TYPE +
                "=" +
                filterType +
                ", " +
                BAG_TYPE +
                "=" +
                bagType +
                ", " +
                WAND_TYPE +
                "=" +
                wandType +
                ", " +
                MOTOR_SPEED_REGULATION +
                "=" +
                motorSpeedRegulation +
                ", " +
                CLEANING_WIDTH +
                "=" +
                cleaningWidth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        VacuumCleaner vacuumCleaner = (VacuumCleaner) obj;
        return powerConsumption == vacuumCleaner.powerConsumption
                && filterType.equals(vacuumCleaner.filterType)
                && bagType.equals(vacuumCleaner.bagType)
                && wandType.equals(vacuumCleaner.wandType)
                && motorSpeedRegulation == vacuumCleaner.motorSpeedRegulation
                && cleaningWidth == vacuumCleaner.cleaningWidth;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + powerConsumption;
        result = prime * result + (motorSpeedRegulation ? 1 : 0);
        result = prime * result + cleaningWidth;
        result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
        result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
        result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());

        return result;
    }
}
