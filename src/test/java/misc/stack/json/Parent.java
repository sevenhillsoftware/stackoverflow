package misc.stack.json;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Parent {
    private int id;

    private String name;

    public Parent() {
        super();
    }

    @JsonIgnore
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
