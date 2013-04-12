package misc.stack.json;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreType
class Address {
    private String street = "Some Street";

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address() {
        super();
    }
}

class Person {
    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private Address address;

    public Person(String name) {
        super();
        this.name = name;
    }
}

public class JacksonTest {

    @Test
    public void i() {
        int total = 0;

        for (int i = 0; i < 100; i++) {
            total += i;
        }
        
        System.out.println("total is " + total);
    }

    @Test
    public void testSerializeObjectWithNoDefaultConstructor() throws Exception {
        final ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(new Person("Janet")));
    }

    @Test
    public void testSerializedChildWithOverrides() throws Exception {
        final ObjectMapper mapper = new ObjectMapper();
        final Parent parent = new Parent();
        parent.setId(5);
        String json = mapper.writeValueAsString(parent);
        System.out.println("Parent: " + json);

        final Child child = new Child();
        child.setId(3);
        System.out.println("Child: " + mapper.writeValueAsString(child));
    }
}
