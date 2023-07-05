package Store;

import java.util.ArrayList;
import java.util.Scanner;

import Items.*;
import Items.Burgers.*;
import Items.HotDogs.BallPark;
import Items.Drinks.*;

public class Restraunt {

    private int numberOfOptions = 3;
    private Item[] burgerOptions = { new TheSwiss(), new TheOG() };
    private Item[] hotDogOptions = { new BallPark() };
    private Item[] drinkOptions = { new Cola() };

    private Factory burgerFactory = new Factory(burgerOptions);
    private Factory hotDogFactory = new Factory(hotDogOptions);
    private Factory drinkFactory = new Factory(drinkOptions);
    private ArrayList<Item> burgers = new ArrayList<>();
    private ArrayList<Item> hotdogs = new ArrayList<>();
    private ArrayList<Item> drinks = new ArrayList<>();

    Scanner userInput = new Scanner(System.in);

    public Restraunt() {
        mainMenu();
    }

    public void mainMenu() {
        int choice = 0;
        while (choice != (numberOfOptions + 1)) {
            System.out.println("MAIN MENU - Choose a number\n\t");
            System.out.println("1. Burgers\n\t");
            System.out.println("2. Hot Dogs\n\t");
            System.out.println("3. Drinks\n\t");
            System.out.println("4. Check out\n\t");

            if (userInput.hasNextInt()) {
                choice = userInput.nextInt();
                System.out.println("\n");
                if (choice == 1)
                    burgerFactory.itemMenu(burgers);
                else if (choice == 2)
                    hotDogFactory.itemMenu(hotdogs);
                else if (choice == 3)
                    drinkFactory.itemMenu(drinks);

            } else {
                System.out.println("The input provided does not work\n\t");
            }
        }

        checkOutMenu();
    }

    public void checkOutMenu() {
        System.out.println("CHECK OUT\t\t\n");
        System.out.println("1. View your order\n");
        System.out.println("2. Add more to order\n");
        System.out.println("3. Complete order\n");

        if (userInput.hasNextInt()) {
            int choice = userInput.nextInt();
            System.out.println("\n");
            if (choice == 1) {
                printOrder();
                checkOutMenu();
            } else if (choice == 2)
                mainMenu();
            else if (choice == 3) {
                System.out.println("ORDER COMPLETE\n");
                printOrder();
                System.out.printf("Total Price: %.2f", ((double) calculateMaxPrice() / 100));
            }

        } else {
            System.out.println("The input provided does not work\n\t");

        }

    }

    public void printOrder() {

        System.out.println("YOUR ORDER\n");
        for (Item burger : burgers)
            System.out.println(burger + "\n");
        for (Item hotdog : hotdogs)
            System.out.println(hotdog + "\n");
        for (Item drink : drinks)
            System.out.println(drink + "\n");
    }

    public int calculateMaxPrice() {
        int price = 0;
        for (Item burger : burgers)
            price += burger.getPrice();
        for (Item hotdog : hotdogs)
            price += hotdog.getPrice();
        for (Item drink : drinks)
            price += drink.getPrice();
        return price;
    }
}
