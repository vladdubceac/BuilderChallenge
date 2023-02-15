package learning.vladdubceac.builder.implementation;

import learning.vladdubceac.builder.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Meal {
    Collection<Item> items ;

    public Meal(){
        items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public double getCost(){
        BigDecimal totalCost = BigDecimal.ZERO;
        for(Item item : items){
            BigDecimal itemPrice = item.getPrice();
            totalCost = totalCost.add(itemPrice);
        }
        return totalCost.doubleValue();
    }

    public void showItems(){
        for (Item item :
                items) {
            System.out.print("Item : "+item.getName());
            System.out.print(", Packing : "+item.getPacking().pack());
            System.out.println(", Price : "+item.getPrice().doubleValue());
        }
    }
}
