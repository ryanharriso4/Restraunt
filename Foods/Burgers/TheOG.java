package Foods.Burgers;

import Foods.Toppings.*;

public class TheOG extends Burger {
    public TheOG() {
        addToppings(new Tomato());
        addToppings(new Lettuce());
        addToppings(new AmericanCheese());
        addToppings(new PotatoBread());
        setPrice();
        setName("The OG");
    }

}
