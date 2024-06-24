package coffee;

public class Ingredient {
    String ingredientName;
    int quantity;

    public Ingredient(String ingredientName, int quantity){
        this.ingredientName = ingredientName;
        this.quantity = quantity;
    }

    public String getIngredient(){
        return ingredientName;
    }

    public int getQuantity(){
        return quantity;
    }

    public void updateQuantity(int newQuantity){
        quantity+=newQuantity;
    }
}
