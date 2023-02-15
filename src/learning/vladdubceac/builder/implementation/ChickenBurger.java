package learning.vladdubceac.builder.implementation;

import learning.vladdubceac.builder.Burger;

import java.math.BigDecimal;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken burger";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(4.5);
    }
}
