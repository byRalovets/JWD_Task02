package by.ralovets.epamcourse.entity;

import by.ralovets.epamcourse.entity.criteria.SearchCriteria;
import by.ralovets.epamcourse.entity.impl.*;

import java.util.HashMap;

public class ApplianceFactory {

    private static final ApplianceFactory instance = new ApplianceFactory();

    private ApplianceFactory() {
    }

    public ApplianceFactory getInstance() {
        return instance;
    }

    public Appliance getAppliance(
            ApplianceEnum appliance,
            HashMap<SearchCriteria.ApplianceCriteria, Object> params) {

        switch (appliance) {
            case LAPTOP:
                return new Laptop(params);
            case OVEN:
                return new Oven(params);
            case REFRIGERATOR:
                return new Refrigerator(params);
            case SPEAKERS:
                return new Speakers(params);
            case TABLET_PC:
                return new TabletPC(params);
            case VACUUM_CLEANER:
                return new VacuumCleaner(params);
        }
        throw new IllegalArgumentException();
    }

}
