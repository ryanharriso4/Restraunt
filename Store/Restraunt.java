package Store;

import java.util.ArrayList;
import java.util.Scanner;

import Foods.Burgers.*;

public class Restraunt {
    private BurgerFactory burgerFactory = new BurgerFactory();
    private ArrayList<Burger> burgers;

    Scanner userInput = new Scanner(System.in);

    public Restraunt() {
        burgers = burgerFactory.burgerMenu();
        for (Burger b : burgers) {
            System.out.println(b);
        }
    }

}
