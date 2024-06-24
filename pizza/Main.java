package pizza;

public class Main {
    public static void main(String[] args){
        BasePizza basePizza = new Margharita();
        System.out.println(basePizza.price());

        ExtraCheese extraCheesePizzz = new ExtraCheese(basePizza);
        System.out.println(extraCheesePizzz.price());

        ExtraMushroom extraMushroomPizza = new ExtraMushroom(extraCheesePizzz);
        System.out.println(extraMushroomPizza.price());
    }    
}
