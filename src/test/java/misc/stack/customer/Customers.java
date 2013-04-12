package misc.stack.customer;

import java.util.List;
import java.util.Map;

public class Customers {
    private List<Map<String, Object>> Customers;

    public Customers() {
        super();
    }

    public List<Map<String, Object>> getCustomers() {
        return Customers;
    }

    public void setCustomers(final List<Map<String, Object>> customers) {
        Customers = customers;
    }
}
