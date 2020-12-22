package by.ralovets.epamcourse.entity.appliance.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

    private static final long serialVersionUUID = -1L;

    private final String groupSearchName;
    private final Map<String, Object> criteria = new HashMap<String, Object>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    @Override
    public int hashCode() {
        return criteria.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Criteria anotherCriteria = (Criteria) obj;
        return criteria.equals(anotherCriteria.criteria);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(groupSearchName);
        builder.append(" : ");
        for (Map.Entry<String, Object> s : criteria.entrySet()) {
            builder
                    .append(s.getKey().toUpperCase())
                    .append("=")
                    .append(s.getValue().toString().toUpperCase())
                    .append(", ");
        }

        int lastDelimiterIndex = builder.lastIndexOf(", ");
        builder.delete(lastDelimiterIndex, lastDelimiterIndex + 2);

        return builder.toString();
    }
}
