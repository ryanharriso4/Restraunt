package Items.HotDogs;

import Items.*;
import Items.Toppings.*;

public class BasicB extends Food {
    public BasicB() {
        setName("Basic B");
        addToppings(new PotatoBread());
        addToppings(new Hotlink());
        addToppings(new Ketchup());
        addToppings(new Mustard());
        setPrice();
    }
}
