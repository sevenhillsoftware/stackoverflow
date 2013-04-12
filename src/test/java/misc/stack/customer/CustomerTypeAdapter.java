package misc.stack.customer;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class CustomerTypeAdapter extends TypeAdapter<Customer> {

    public CustomerTypeAdapter() {
        super();
    }

    @Override
    public void write(final JsonWriter writer, final Customer value) throws IOException {
        if (value == null) {
            writer.nullValue();
            return;
          }

        writer.beginObject();
        writer.name("customer.name");
        writer.value(value.getName());
    }

    @Override
    public Customer read(final JsonReader in) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }
}
