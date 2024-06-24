package pizza;

public class ExtraMushroom extends Toppings{
    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int price(){
        return basePizza.price()+30;
    }
}
