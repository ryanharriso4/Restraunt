package Foods.HotDogs;

import Foods.Toppings.*;

public class BallPark extends HotDog {
    public BallPark() {
        addToppings(new Relish());
        addToppings(new Mustard());
        addToppings(new Ketchup());
        addToppings(new PotatoBread());
        addToppings(new Hotlink());
        setPrice();
        setName("The Ball Park");
    }

}
