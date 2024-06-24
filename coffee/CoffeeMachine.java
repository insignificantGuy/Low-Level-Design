package coffee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeMachine {
    List<Coffee> coffee;
    Map<String, Ingredient> ingredients;

    public CoffeeMachine(){
        coffee = new ArrayList<>();
        ingredients = new HashMap<>();
        initializeIngredients();
        intializeCoffeeMenu();
    }

    private void initializeIngredients(){
        ingredients.put(IngredientEnum.COFFEE.toString(), new Ingredient("Coffee", 1000));
        ingredients.put(IngredientEnum.SUGAR.toString(), new Ingredient("Sugar", 1000));
        ingredients.put(IngredientEnum.MILK.toString(), new Ingredient("Milk", 1000));
    }

    private void intializeCoffeeMenu(){
        Map<Ingredient, Integer>expressoReceipe = new HashMap<>();
        expressoReceipe.put(ingredients.get(IngredientEnum.COFFEE.toString()),1);
        expressoReceipe.put(ingredients.get(IngredientEnum.SUGAR.toString()), 2);
        expressoReceipe.put(ingredients.get(IngredientEnum.MILK.toString()), 10);
        coffee.add(new Coffee("Expresso", expressoReceipe, 100.00));

        Map<Ingredient, Integer>cappachinoReceipe = new HashMap<>();
        cappachinoReceipe.put(ingredients.get(IngredientEnum.COFFEE.toString()),4);
        cappachinoReceipe.put(ingredients.get(IngredientEnum.SUGAR.toString()), 5);
        cappachinoReceipe.put(ingredients.get(IngredientEnum.MILK.toString()), 3);
        coffee.add(new Coffee("Cappachino", cappachinoReceipe, 150.00));

        Map<Ingredient, Integer>latteReceipe = new HashMap<>();
        latteReceipe.put(ingredients.get(IngredientEnum.COFFEE.toString()),5);
        latteReceipe.put(ingredients.get(IngredientEnum.SUGAR.toString()), 3);
        latteReceipe.put(ingredients.get(IngredientEnum.MILK.toString()), 8);
        coffee.add(new Coffee("Latte", latteReceipe, 80.00));
    }

    public void getMenu(){
        System.out.println("Coffee Menu : ");
        for(Coffee coffees: coffee){
            System.out.println(coffees.getCoffee()+ " - " + "$" + coffees.getPrice());
        }
    }

    public Coffee getCoffeeWithName(String name){
        for(Coffee coffees: coffee){
            if(coffees.getCoffee().equalsIgnoreCase(name)){
                return coffees;
            }
        }
        return null;
    }

    public void dispenseCoffee(Coffee coffee, Payment payment){
        if(payment.getAmount()>=coffee.getPrice()){
            if(hasIngredient(coffee)){
                updateIngredient(coffee);
                System.out.println("Dispensing Coffee : "+ coffee.getCoffee());
            }
            else{
                System.out.println("Insufficient Ingredients to make coffee");
            }
        }
        else{
            System.out.println("Insufficient funds");
        }
    }

    private boolean hasIngredient(Coffee coffee){
        for(Map.Entry<Ingredient, Integer> entry: coffee.getIngredients().entrySet()){
            Ingredient ingredient = entry.getKey();
            Integer quantity = entry.getValue();

            if(ingredient.getQuantity()<quantity){
                return false;
            }
        }
        return true;
    }

    public void updateIngredient(Coffee coffee){
        for(Map.Entry<Ingredient, Integer>entry : coffee.getIngredients().entrySet()){
            Ingredient ingredient = entry.getKey();
            int quantity = entry.getValue();

            ingredient.updateQuantity(-quantity);
        }
    }

}