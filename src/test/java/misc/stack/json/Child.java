package misc.stack.json;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Child extends Parent{

    public Child() {
        super();
    }

    @Override
    @JsonIgnore(false)
    public int getId() {
        return super.getId();
    }

    @Override
    @JsonIgnore(false)
    public void setId(int id) {
        super.setId(id);
    }
}
