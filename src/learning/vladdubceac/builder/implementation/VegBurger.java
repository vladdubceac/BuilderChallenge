package learning.vladdubceac.builder.implementation;

import learning.vladdubceac.builder.Burger;

import java.math.BigDecimal;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "Vegetarian burger";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(3.5);
    }
}
