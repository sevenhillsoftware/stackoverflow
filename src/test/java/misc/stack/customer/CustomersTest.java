package misc.stack.customer;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import com.google.gson.Gson;

public class CustomersTest {

    @Test
    public void testLoadCustomersFromJSONWithGson() throws Exception {
        final InputStream stream = Thread.currentThread()
                .getContextClassLoader().getResourceAsStream("customers.json");
        Assert.assertNotNull(stream);

        final String json = IOUtils.toString(stream);
        final Gson gson = new Gson();
        final Customers customers = gson.fromJson(json, Customers.class);
        Assert.assertNotNull(customers.getCustomers());
        System.out.println(customers.getCustomers());
    }

    @Test
    public void testLoadCustomersFromJsonWithGsonAndCustomTypeAdapter() throws Exception {
        final InputStream stream = Thread.currentThread()
                .getContextClassLoader().getResourceAsStream("customers.json");
        Assert.assertNotNull(stream);

        final String json = IOUtils.toString(stream);

    }
}
