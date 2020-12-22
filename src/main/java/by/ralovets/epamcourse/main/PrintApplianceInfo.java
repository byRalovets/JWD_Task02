package by.ralovets.epamcourse.main;

import by.ralovets.epamcourse.entity.appliance.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(Appliance appliance) {
        System.out.println(appliance);
    }

    public static void printList(List<Appliance> applianceList) {
        for (Appliance a : applianceList) {
            print(a);
        }
    }

}
