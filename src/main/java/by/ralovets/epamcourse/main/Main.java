package by.ralovets.epamcourse.main;

import by.ralovets.epamcourse.entity.Appliance;
import by.ralovets.epamcourse.entity.criteria.Criteria;
import by.ralovets.epamcourse.entity.criteria.SearchCriteria;
import by.ralovets.epamcourse.service.ServiceFactory;
import by.ralovets.epamcourse.service.ApplianceService;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

		appliance = service.find(criteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}
