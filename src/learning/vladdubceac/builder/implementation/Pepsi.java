package learning.vladdubceac.builder.implementation;

import learning.vladdubceac.builder.ColdDrink;

import java.math.BigDecimal;

public class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi cold drink";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(1.50);
    }
}
