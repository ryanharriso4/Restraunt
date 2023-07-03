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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + ": " + ((double) price / 100) + "\n\t");
        for (Topping t : toppings) {
            sb.append(t.toString() + "\n\t");
        }

        return sb.toString();
    }
}
