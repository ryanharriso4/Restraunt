package Items.Burgers;

import Items.Food;
import Items.Toppings.AmericanCheese;
import Items.Toppings.AngusBeef;
import Items.Toppings.Jalapeno;
import Items.Toppings.Ketchup;
import Items.Toppings.Mushroom;
import Items.Toppings.Mustard;
import Items.Toppings.PotatoBread;
import Items.Toppings.SwissCheese;

public class TheOG extends Food {
    public TheOG() {
        setName("The OG");
        addToppings(new PotatoBread());
        addToppings(new AmericanCheese());
        addToppings(new AngusBeef());
        addToppings(new Mustard());
        addToppings(new Ketchup());
        setPrice();
    }
}
