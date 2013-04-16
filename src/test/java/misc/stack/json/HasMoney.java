package misc.stack.json;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface HasMoney {
    @JsonProperty
    @JsonInclude(Include.NON_NULL)
    BigDecimal getMoney();

    @JsonIgnore
    void setMoney(BigDecimal money);
}
