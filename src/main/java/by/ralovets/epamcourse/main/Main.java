package by.ralovets.epamcourse.main;

import by.ralovets.epamcourse.entity.appliance.Appliance;
import by.ralovets.epamcourse.entity.appliance.criteria.Criteria;
import by.ralovets.epamcourse.entity.appliance.criteria.SearchCriteria;
import by.ralovets.epamcourse.resource.ResourceProvider;
import by.ralovets.epamcourse.service.ApplianceService;
import by.ralovets.epamcourse.service.ServiceException;
import by.ralovets.epamcourse.service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ResourceProvider.putResource("DATABASE", args[0]);

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        List<Appliance> applianceList;

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName().toUpperCase());
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), "33");

        try {
            applianceList = service.find(criteriaOven);
        } catch (ServiceException e) {
            e.printStackTrace();
            return;
        }

        PrintApplianceInfo.printList(applianceList);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName().toUpperCase());
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), "8000");
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "red");

        try {
            applianceList = service.find(criteriaTabletPC);
        } catch (ServiceException e) {
            e.printStackTrace();
            return;
        }

        PrintApplianceInfo.printList(applianceList);
    }
}
