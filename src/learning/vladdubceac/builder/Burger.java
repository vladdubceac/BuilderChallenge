package learning.vladdubceac.builder;

import learning.vladdubceac.builder.Item;
import learning.vladdubceac.builder.implementation.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
