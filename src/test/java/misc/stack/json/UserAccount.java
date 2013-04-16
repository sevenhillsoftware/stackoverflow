package misc.stack.json;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserAccount implements HasMoney {
    @JsonIgnore
    private BigDecimal money;
    private String name;

    public UserAccount() {
        super();
    }

    public UserAccount(final BigDecimal money) {
        super();
        setMoney(money);
    }

    public UserAccount(final String name, final BigDecimal money) {
        this(money);
        setName(name);
    }

    @Override
    public BigDecimal getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setMoney(final BigDecimal money) {
        this.money = money;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("UserAccount[name = %s, money=%s]", getName(),
                getMoney());
    }
}
