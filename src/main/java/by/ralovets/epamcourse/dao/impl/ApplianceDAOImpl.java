package by.ralovets.epamcourse.dao.impl;

import by.ralovets.epamcourse.dao.ApplianceDAO;
import by.ralovets.epamcourse.dao.DAOException;
import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.parser.ApplianceParser;
import by.ralovets.epamcourse.entity.appliance.ApplianceSearchFilter;
import by.ralovets.epamcourse.entity.appliance.criteria.Criteria;
import by.ralovets.epamcourse.entity.appliance.parser.ApplianceParserException;
import by.ralovets.epamcourse.entity.appliance.reader.ApplianceReader;
import by.ralovets.epamcourse.entity.appliance.reader.ApplianceReaderException;
import by.ralovets.epamcourse.entity.appliance.reader.impl.ApplianceFileReader;
import by.ralovets.epamcourse.resource.ResourceProvider;
import by.ralovets.epamcourse.resource.ResourceProviderException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    public List<Appliance> find(Criteria criteria) throws DAOException {
        ApplianceReader applianceReader;
        ApplianceSearchFilter searchFilter = new ApplianceSearchFilter(criteria);
        ApplianceParser applianceParser = new ApplianceParser();

        List<String> sourceApplianceData;
        List<String> filteredApplianceData;
        List<Appliance> parsedApplianceList;
        List<Appliance> foundApplianceList = new ArrayList<>();

        try {
            File file = ResourceProvider.getLocalFile("DATABASE");
            applianceReader = new ApplianceFileReader(file);
        } catch (ResourceProviderException | ApplianceReaderException e) {
            throw new DAOException();
        }

        while (applianceReader.hasNext()) {
            sourceApplianceData = applianceReader.next(10);
            filteredApplianceData = searchFilter.filter(sourceApplianceData);

            try {
                parsedApplianceList = applianceParser.parse(filteredApplianceData);
            } catch (ApplianceParserException e) {
                throw new DAOException();
            }

            foundApplianceList.addAll(parsedApplianceList);
        }

        return foundApplianceList;
    }
}