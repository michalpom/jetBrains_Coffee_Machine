package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterSupply = 0, milkSupply = 0, coffeeBeansSupply = 0;
        int cupsNeed = 0;


        //what is the supply - maybe change to method returning array of ints
        System.out.println("Write how many ml of water the coffee machine has:");
        if (scanner.hasNextInt()) {
            waterSupply = scanner.nextInt();
            //scanner.nextLine();
        }

        System.out.println("Write how many ml of milk the coffee machine has:");

        if (scanner.hasNextInt()) {
            milkSupply = scanner.nextInt();
            //scanner.nextLine();
        }

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        if (scanner.hasNextInt()) {
            coffeeBeansSupply = scanner.nextInt();
            //scanner.nextLine();
        }

        //how many cups needed
        System.out.println("Write how many cups of coffee you will need:");
        if (scanner.hasNextInt()) {
            cupsNeed = scanner.nextInt();
            //scanner.nextLine();
        }

        //how many cups can make
        int cupsAvailable = howManyCupsCanMake(waterSupply, milkSupply, coffeeBeansSupply);

        //result
        message(cupsNeed, cupsAvailable);

    }

    private static int howManyCupsCanMake(int waterSupply, int milkSupply, int coffeeBeansSupply) {
        int wC;
        int mC;
        int cC;

        wC = waterSupply / 200;
        mC = milkSupply / 50;
        cC = coffeeBeansSupply / 15;

        return Math.min(wC, Math.min(mC, cC));
    }

    private static void message(int cupsNeed, int cupsAvailable) {

        if (cupsNeed == cupsAvailable) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsNeed > cupsAvailable) {
            System.out.println("No, I can make only " + cupsAvailable + " cup(s) of coffee");
        } else if (cupsNeed < cupsAvailable) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsAvailable - cupsNeed) + " more than that)");
        }

    }

}
