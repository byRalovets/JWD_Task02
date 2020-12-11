package by.ralovets.epamcourse.service.impl;

import by.ralovets.epamcourse.dao.ApplianceDAO;
import by.ralovets.epamcourse.dao.DAOFactory;
import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.Criteria;
import by.ralovets.epamcourse.service.ApplianceService;
import by.ralovets.epamcourse.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

    public Appliance find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        Appliance appliance = applianceDAO.find(criteria);

        // you may add your own code here

        return appliance;
    }

}

//you may add your own new classes
