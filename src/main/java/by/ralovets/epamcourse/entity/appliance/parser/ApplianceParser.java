package by.ralovets.epamcourse.entity.appliance.parser;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.ApplianceCreationException;
import by.ralovets.epamcourse.entity.appliance.ApplianceEnum;
import by.ralovets.epamcourse.entity.appliance.ApplianceFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ApplianceParser {

    private static final ApplianceFactory factory = ApplianceFactory.getInstance();

    public ApplianceParser() {
    }

    public Appliance parse(String strApplianceData) throws ApplianceParserException {
        String[] applianceData = strApplianceData.split(" : ");

        String applianceName = applianceData[0];
        String[] criteria = applianceData[1].split(", ");

        ApplianceEnum applianceIdentificator
                = ApplianceEnum.valueOf(applianceName.toUpperCase());

        HashMap<String, String> params = new HashMap<>();
        for (String criterion : criteria) {
            String[] criterionData = criterion.split("=");
            params.put(criterionData[0], criterionData[1]);
        }

        Appliance appliance;
        try {
            appliance = factory.getAppliance(applianceIdentificator, params);
        } catch (ApplianceCreationException e) {
            throw new ApplianceParserException();
        }

        return appliance;
    }

    public List<Appliance> parse(List<String> strApplianceDataList) throws ApplianceParserException {
        List <Appliance> resultList = new ArrayList<>();

        for (String strApplianceData : strApplianceDataList) {
            try {
                resultList.add(parse(strApplianceData));
            } catch (ApplianceParserException e) {
                throw new ApplianceParserException();
            }
        }

        return resultList;
    }
}