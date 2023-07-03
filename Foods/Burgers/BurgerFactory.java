package Foods.Burgers;

import Foods.Toppings.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BurgerFactory {

    private Burger[] burgerOptions = { new TheOG(), new TheSwiss() };
    Scanner userInput = new Scanner(System.in);

    public ArrayList<Burger> burgerMenu() {
        int choice = 0;
        ArrayList<Burger> chosenBurgers = new ArrayList<>();

        System.out.println("Choose a number for the burger you want\n\t");
        for (int num = 0; num < burgerOptions.length; num++) {
            System.out.println((num + 1) + ". " + burgerOptions[num] + "\n\t");
        }
        System.out.println((burgerOptions.length + 1) + ". Done");

        while (choice != (burgerOptions.length + 1)) {
            choice = userInput.nextInt();
            if (choice < burgerOptions.length) {
                chosenBurgers.add(makeBurger(choice));
            }

        }

        return chosenBurgers;
    }

    public Burger makeBurger(int input) {
        if (input == 1)
            return new TheOG();
        else if (input == 2)
            return new TheSwiss();
        else if (input == 3)
            return null;
        else
            throw new IllegalArgumentException();
    }
}
