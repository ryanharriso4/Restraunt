package Foods.Burgers;

import Foods.Toppings.*;

import java.util.ArrayList;

import Foods.Toppings.Topping;

public abstract class Burger {
    private String name;
    private int price;
    private ArrayList<Topping> toppings = new ArrayList();

    public void addToppings(Topping t) {
        toppings.add(t);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice() {
        for (Topping t : toppings) {
            price += t.getPrice();
        }
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
