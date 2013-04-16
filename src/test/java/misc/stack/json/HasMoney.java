package misc.stack.json;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface HasMoney {
    @JsonProperty
    BigDecimal getMoney();

    @JsonIgnore
    void setMoney(BigDecimal money);
}
