package by.ralovets.epamcourse.service.impl;

import by.ralovets.epamcourse.dao.ApplianceDAO;
import by.ralovets.epamcourse.dao.DAOException;
import by.ralovets.epamcourse.dao.DAOFactory;
import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.criteria.Criteria;
import by.ralovets.epamcourse.service.ApplianceService;
import by.ralovets.epamcourse.service.ServiceException;
import by.ralovets.epamcourse.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> applianceList;
        try {
            applianceList = applianceDAO.find(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }

        return applianceList;
    }

}