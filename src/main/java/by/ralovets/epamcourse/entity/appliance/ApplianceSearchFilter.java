package by.ralovets.epamcourse.entity.appliance;

import by.ralovets.epamcourse.entity.appliance.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

public class ApplianceSearchFilter {

    private final String[] criteriaArray;
    private final String applianceName;
    private final boolean isAllMatch;

    public ApplianceSearchFilter(Criteria criteria) {
        // Separating name from criteria
        String[] applianceData = criteria.toString().split(" : ");

        isAllMatch = applianceData.length == 1;
        applianceName = applianceData[0].toUpperCase();
        criteriaArray = applianceData[1].toUpperCase().split(", ");
    }

    public List<String> filter(List<String> sourceList) {
        if (isAllMatch) return sourceList;

        List<String> filteredList = new ArrayList<>();
        for (String appliance : sourceList) {
            if (applianceMatch(appliance)) {
                filteredList.add(appliance);
            }
        }

        return filteredList;
    }

    public boolean applianceMatch(String appliance) {
        // Separating name from criteria
        String[] applianceData = appliance.split(" : ");

        String applianceName = applianceData[0];
        if (!applianceNameMatch(applianceName)) return false;

        String criteriaList = applianceData[1];
        return criteriaMatch(criteriaList);
    }

    private boolean applianceNameMatch(String applianceName) {
        applianceName = applianceName.toUpperCase();
        String requiredApplianceName = this.applianceName.toUpperCase();

        return applianceName.equals(requiredApplianceName);
    }

    private boolean criteriaMatch(String criteria) {
        for (String criterion : criteriaArray) {
            if (!criteria.contains(criterion)) return false;
        }
        return true;
    }
}
