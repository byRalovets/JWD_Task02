package by.ralovets.epamcourse.entity.criteria;

public final class SearchCriteria {

    public interface ApplianceCriteria {
    }

    public enum Oven implements ApplianceCriteria {
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public enum Laptop implements ApplianceCriteria {
        BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES
    }

    public enum Refrigerator implements ApplianceCriteria {
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }

    public enum VacuumCleaner implements ApplianceCriteria {
        POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }

    public enum TabletPC implements ApplianceCriteria {
        BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    public enum Speakers implements ApplianceCriteria {
        POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE_START, FREQUENCY_RANGE_END, CORD_LENGTH
    }

    private SearchCriteria() {
    }
}

