package learning.vladdubceac.builder.implementation;

import learning.vladdubceac.builder.ColdDrink;

import java.math.BigDecimal;

public class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coke cold drink";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(1.75);
    }
}
