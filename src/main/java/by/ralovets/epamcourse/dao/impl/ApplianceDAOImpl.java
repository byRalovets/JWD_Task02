package by.ralovets.epamcourse.dao.impl;

import by.ralovets.epamcourse.dao.ApplianceDAO;
import by.ralovets.epamcourse.dao.DAOException;
import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.Criteria;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    public Appliance find(Criteria criteria) throws DAOException {

        URL resource = getClass().getClassLoader().getResource("appliances_db.txt");

        if (resource == null) {
            throw new DAOException();
        }

        String[] criteriaArray = criteria.toString().split(" : ");
        String applianceName = criteriaArray[0];
        String[] finalCriteriaArray = criteriaArray[1].split(", ");

        List<String> appliances = new ArrayList<>();
        try {

            Files.lines(Paths.get(resource.toURI()), StandardCharsets.UTF_8).forEach((s) -> {
                if (!s.contains(applianceName)) return;

                for (String c : finalCriteriaArray) {
                    if (!s.contains(c)) return;
                }

                appliances.add(s);
            });
        } catch (URISyntaxException | IOException ignored) {
            throw new DAOException();
        }

        for (String a : appliances) {
            System.out.println(a);
        }

        return null;
    }

    // you may add your own code here

}

//you may add your own new classes