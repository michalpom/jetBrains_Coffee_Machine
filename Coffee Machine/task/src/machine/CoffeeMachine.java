package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MachineCoffee policeBuilding = new MachineCoffee();


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


    }


}
