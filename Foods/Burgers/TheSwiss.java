package Foods.Burgers;

import Foods.Toppings.*;

public class TheSwiss extends Burger {
    public TheSwiss() {
        addToppings(new SwissCheese());
        addToppings(new Mushroom());
        addToppings(new Lettuce());
        addToppings(new Jalapeno());
        addToppings(new PotatoBread());
        addToppings(new AngusBeef());

        setPrice();
        setName("The Swiss");
    }

}
