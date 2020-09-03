package machine;

import java.util.Scanner;

public class MachineCoffee {
    Scanner scanner = new Scanner(System.in);
    private int waterSupply = 400, milkSupply = 540, coffeeBeansSupply = 120, cups = 9, money = 550;
    int cupsNeed = 0;


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

    public void coffeeMachineState() {
        System.out.println("The coffee machine has:");
        System.out.println(waterSupply + " of water");
        System.out.println(milkSupply + " of milk");
        System.out.println(coffeeBeansSupply + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    public void fillCoffeeMachine() {

        System.out.println("Write how many ml of water do you want to add:");
        if (scanner.hasNextInt()) {
            waterSupply += scanner.nextInt();
            //scanner.nextLine();
        }

        System.out.println("Write how many ml of milk do you want to add:");

        if (scanner.hasNextInt()) {
            milkSupply += scanner.nextInt();
            //scanner.nextLine();
        }

        System.out.println("Write how many grams of coffee beans do you want to add:");
        if (scanner.hasNextInt()) {
            coffeeBeansSupply += scanner.nextInt();
            //scanner.nextLine();
        }


        System.out.println("Write how many disposable cups of coffee do you want to add:");
        if (scanner.hasNextInt()) {
            cups += scanner.nextInt();
            //scanner.nextLine();
        }
    }

    public void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String buy = scanner.next();


        if (buy.equals("1") && checkSupplies(buy)) {
            System.out.println("I have enough resources, making you a coffee!");

            waterSupply = waterSupply - 250;
            coffeeBeansSupply = coffeeBeansSupply - 16;
            money = money + 4;
            cups -= 1;

        } else if (buy.equals("2") && checkSupplies(buy)) {
            System.out.println("I have enough resources, making you a coffee!");

            waterSupply = waterSupply - 350;
            milkSupply = milkSupply - 75;
            coffeeBeansSupply = coffeeBeansSupply - 20;
            money = money + 7;
            cups -= 1;
        } else if (buy.equals("3") && checkSupplies(buy)) {
            System.out.println("I have enough resources, making you a coffee!");

            waterSupply = waterSupply - 200;
            milkSupply = milkSupply - 100;
            coffeeBeansSupply = coffeeBeansSupply - 12;
            money = money + 6;
            cups -= 1;
        }
    }

    public void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private boolean checkSupplies(String typeOfCoffee) {

        boolean waterOk = false, milkOk = false, beansOk = false, cupsOk = false;
        //1.2.3
        //water, milk, beans, cups
        if (typeOfCoffee.equals("1")) {
            milkOk = true;
            if (waterSupply >= 250) {
                waterOk = true;
            } else {
                waterOk = false;
                System.out.println("Sorry, not enough water!");
            }
            if (coffeeBeansSupply >= 16) {
                beansOk = true;
            } else {
                beansOk = false;
                System.out.println("Sorry, not enough coffee beans!");
            }
        }
        if (typeOfCoffee.equals("2")) {
            if (waterSupply >= 350) {
                waterOk = true;
            } else {
                waterOk = false;
                System.out.println("Sorry, not enough water!");
            }
            if (milkSupply >= 75) {
                milkOk = true;
            } else {
                milkOk = false;
                System.out.println("Sorry, not enough milk!");
            }
            if (coffeeBeansSupply >= 20) {
                beansOk = true;
            } else {
                beansOk = false;
                System.out.println("Sorry, not enough coffee beans!");
            }
        }

        if (typeOfCoffee.equals("3")) {
            if (waterSupply >= 200) {
                waterOk = true;
            } else {
                waterOk = false;
                System.out.println("Sorry, not enough water!");
            }
            if (milkSupply >= 100) {
                milkOk = true;
            } else {
                milkOk = false;
                System.out.println("Sorry, not enough milk!");
            }
            if (coffeeBeansSupply >= 12) {
                beansOk = true;
            } else {
                beansOk = false;
                System.out.println("Sorry, not enough coffee beans!");
            }
        }


        if (cups >= 1) {
            cupsOk = true;
        } else {
            cupsOk = false;
            System.out.println("Sorry, not enough cups!");
        }


        return waterOk & milkOk & beansOk & cupsOk;
    }
}
