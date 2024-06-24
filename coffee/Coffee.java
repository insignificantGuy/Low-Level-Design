package coffee;

import java.util.Map;

public class Coffee {
    String name;
    Map<Ingredient, Integer> coffeeIngredient;
    double price;

    public Coffee(String name, Map<Ingredient, Integer> coffeeIngredient, double price){
        this.name = name;
        this.coffeeIngredient = coffeeIngredient;
        this.price = price;
    }

    public String getCoffee(){
        return name;
    }

    public Map<Ingredient, Integer> getIngredients(){
        return coffeeIngredient;
    }

    public double getPrice(){
        return price;
    }
}
