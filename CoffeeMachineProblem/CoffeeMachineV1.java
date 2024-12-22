package CoffeeMachineProblem;

import java.util.Scanner;

public class CoffeeMachineV1 {

    private int water;
    private int milk;
    private int coffeebeans;

    private static int EXPRESSO_WATER = 50;
    private static int EXPRESSO_MILK = 0;
    private static int EXPRESSO_COFEEBEANS = 50;

    private static int CAPPUCCINO_WATER = 20;
    private static int CAPPUCCINO_MILK = 10;
    private static int CAPPUCCINO_COFFEEBEANS = 10;

    private static int BLACKCOFFEE_MILK = 0;
    private static int BLACKCOFFEE_WATER = 30;
    private static int BLACKCOFFEE_COFFEEBEANS = 20;

    public CoffeeMachineV1(int water, int milk, int coffeebeans){
        this.coffeebeans = coffeebeans;
        this.water = water;
        this.milk = milk;
    }

    private boolean checkIngredients(int waterRequired, int milkRequired, int coffeeBeansRequired){
        if(water < waterRequired){
            System.out.println("Sufficient Water is not there !! ");
            return false;
        }
        if(milk < milkRequired){
            System.out.println("Sufficient Milk is not there !! ");
            return false;
        }
        if(coffeebeans < coffeeBeansRequired){
            System.out.println("Sufficient Coffee Beans is not there !! ");
            return false;
        }
        return true;
    }


    public void makeExpresso(){
        if(checkIngredients(EXPRESSO_WATER, EXPRESSO_MILK, EXPRESSO_COFEEBEANS)){
            water -= EXPRESSO_WATER;
            milk -= EXPRESSO_MILK;
            coffeebeans -= EXPRESSO_COFEEBEANS;
            System.out.println("Expresso is Ready");
        }
    }

    public void makeCappuccino(){
        if(checkIngredients(CAPPUCCINO_WATER, CAPPUCCINO_MILK, CAPPUCCINO_COFFEEBEANS)){
            water -= CAPPUCCINO_WATER;
            milk -= CAPPUCCINO_MILK;
            coffeebeans -= CAPPUCCINO_COFFEEBEANS;
            System.out.println("Cappuccino is Ready");
        }
    }
    public void makeBlackCoffee(){
        if(checkIngredients(BLACKCOFFEE_WATER, BLACKCOFFEE_MILK, BLACKCOFFEE_COFFEEBEANS)){
            water -= BLACKCOFFEE_WATER;
            milk -= BLACKCOFFEE_MILK;
            coffeebeans -= BLACKCOFFEE_COFFEEBEANS;
            System.out.println("Expresso is Ready");
        }
    }

    public void displayAvailableIngredients(){
        System.out.println("Water available is " + water);
        System.out.println("Milk available is " + milk);
        System.out.println("Coffee available is " + coffeebeans);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CoffeeMachineV1 coffeeMachineV1 = new CoffeeMachineV1(1000, 1000, 1000);

        coffeeMachineV1.displayAvailableIngredients();

        while(true){
            System.out.println("Select a Coffee from (Expresso, Cappuccino, BlackCoffee) or type 'exit' to quit: ");

            String choice = sc.nextLine().trim().toLowerCase();

            switch (choice){
                case "expresso":
                    coffeeMachineV1.makeExpresso();
                    break;

                case "cappuccino":
                    coffeeMachineV1.makeCappuccino();
                    break;

                case "blackcoffee":
                    coffeeMachineV1.makeBlackCoffee();
                    break;

                case "exit":
                    System.out.println("Exitting the Coffee machine");
                    return;

                default:
                    System.out.println("Invalid Choice Choose between (Expresso, Cappuccino, BlackCoffee)");
            }
            coffeeMachineV1.displayAvailableIngredients();
        }
    }
}
