package coffee;

public class Main {
    public static void main(String[] args){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.getMenu();
        Coffee expresso = coffeeMachine.getCoffeeWithName("Expresso");
        coffeeMachine.dispenseCoffee(expresso, new Payment(100));
        
        Coffee cappachino = coffeeMachine.getCoffeeWithName("Cappachino");
        coffeeMachine.dispenseCoffee(cappachino, new Payment(150));
        
        Coffee latte = coffeeMachine.getCoffeeWithName("Latte");
        coffeeMachine.dispenseCoffee(latte, new Payment(70));
    }
}
