package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int waterSupply = 400, milkSupply = 540, coffeeBeansSupply = 120, money = 550;
//        int cupsNeed = 0;
        MachineCoffee policeBuilding = new MachineCoffee();

        //policeBuilding.coffeeMachineState();
        //System.out.println("");

        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String action = scanner.nextLine();
            System.out.println("");
            if (action.equals("buy")) {
                policeBuilding.buyCoffee();
                System.out.println("");
            } else if (action.equals("fill")) {
                policeBuilding.fillCoffeeMachine();
                System.out.println("");
            } else if (action.equals("take")) {
                policeBuilding.takeMoney();
                System.out.println("");
            }else if (action.equals("remaining")){
                policeBuilding.coffeeMachineState();
                System.out.println("");
            }else if (action.equals("exit")){
                break;
            }

        }

//        //how many cups can make
//        int cupsAvailable = howManyCupsCanMake(waterSupply, milkSupply, coffeeBeansSupply);
//
//        //result
//        message(cupsNeed, cupsAvailable);

    }


}
