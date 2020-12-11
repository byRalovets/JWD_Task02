package by.ralovets.epamcourse.service;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.Criteria;

public interface ApplianceService {

    Appliance find(Criteria criteria);

}
