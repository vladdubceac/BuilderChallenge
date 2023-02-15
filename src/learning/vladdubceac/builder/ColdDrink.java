package learning.vladdubceac.builder;

import learning.vladdubceac.builder.Item;
import learning.vladdubceac.builder.implementation.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
