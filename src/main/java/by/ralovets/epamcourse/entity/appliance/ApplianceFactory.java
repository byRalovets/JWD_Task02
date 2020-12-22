package by.ralovets.epamcourse.entity.appliance;

import by.ralovets.epamcourse.entity.appliance.impl.*;

import java.util.HashMap;

public class ApplianceFactory {

    private static final ApplianceFactory instance = new ApplianceFactory();

    private ApplianceFactory() {
    }

    public static ApplianceFactory getInstance() {
        return instance;
    }

    public Appliance getAppliance(
            ApplianceEnum appliance,
            HashMap<String, String> params) throws ApplianceCreationException {

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
        throw new ApplianceCreationException();
    }

}
