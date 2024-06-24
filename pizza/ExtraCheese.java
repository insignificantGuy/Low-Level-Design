package pizza;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int price(){
        return basePizza.price()+10;
    }
}
