package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int waterSupply = 400, milkSupply = 540, coffeeBeansSupply = 120, money = 550;
//        int cupsNeed = 0;
        MachineCoffee policeBuilding = new MachineCoffee();

        policeBuilding.coffeeMachineState();
        System.out.println("");
        System.out.println("Write action (buy, fill, take):");

        String action = scanner.nextLine();
        if (action.equals("buy")) {
            policeBuilding.buyCoffee();
        } else if (action.equals("fill")) {
            policeBuilding.fillCoffeeMachine();
        } else if (action.equals("take")) {
            policeBuilding.takeMoney();
        }

        policeBuilding.coffeeMachineState();


//        //how many cups can make
//        int cupsAvailable = howManyCupsCanMake(waterSupply, milkSupply, coffeeBeansSupply);
//
//        //result
//        message(cupsNeed, cupsAvailable);

    }



}
