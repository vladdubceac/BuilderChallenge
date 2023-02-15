package learning.vladdubceac.builder;

import java.math.BigDecimal;

public interface Item {
    String getName();
    BigDecimal getPrice();
    Packing getPacking();
}
