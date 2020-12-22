package by.ralovets.epamcourse.entity.appliance.reader;

import java.util.Iterator;
import java.util.List;

public interface ApplianceReader extends Iterator<String> {

    List<String> next(int count);
}
