package Foods.Toppings;

import java.util.ArrayList;

public abstract class Topping {
    String name;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be less than 0");
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
