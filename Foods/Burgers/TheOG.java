package Foods.Burgers;

import Foods.Toppings.*;

public class TheOG extends Burger {
    public TheOG() {
        addToppings(new Tomato());
        addToppings(new Lettuce());
        setPrice();
        setName("The OG");
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }
}
