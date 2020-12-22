package by.ralovets.epamcourse.dao;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.criteria.Criteria;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.List;

public interface ApplianceDAO {

    List<Appliance> find(Criteria criteria) throws DAOException;

}
