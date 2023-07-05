package Items;

import java.util.ArrayList;
import java.util.Scanner;

import Items.*;
import Items.Burgers.*;
import Items.Toppings.*;

public class Factory {
    private Item[] itemOptions;
    Scanner userInput = new Scanner(System.in);

    public Factory(Item[] itemOptions) {
        this.itemOptions = itemOptions;
    }

    public void itemMenu(ArrayList<Item> chosenFood) {
        int choice = 0;

        while (choice != (itemOptions.length + 1)) {

            System.out.println("\n\nChoose a burger by typing its associated number\n\t");
            for (int num = 0; num < itemOptions.length; num++) {
                System.out.println((num + 1) + ". " + itemOptions[num] + "\n\t");
            }

            System.out.println((itemOptions.length + 1) + ". Done Ordering");
            choice = userInput.nextInt();
            if ((choice < itemOptions.length + 1) && (choice > 0)) {
                chosenFood.add(makeFood(choice));
            }

        }
    }

    public Item makeFood(int input) {
        System.out.println("\n" + itemOptions[input - 1].getName() + " has been added to your cart\n");
        return itemOptions[input - 1];
    }
}
