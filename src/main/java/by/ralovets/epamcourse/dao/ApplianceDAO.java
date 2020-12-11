package by.ralovets.epamcourse.dao;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.Criteria;

public interface ApplianceDAO {

    Appliance find(Criteria criteria);

}
