package misc.stack.customer;

import java.util.Map;

public class Customer {
    private String name;
    private Map<String, Object> properties;

    public Customer() {
        super();
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setProperties(final Map<String, Object> properties) {
        this.properties = properties;
    }

}
