package bicycle;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("Hero 13X", 12, true);
        hero.getInfo();
        hero.speedUp(10);
        hero.getInfo();
        hero.speedDown(5);
        hero.getInfo();
        hero.pressHorn();

        Hero hero2 = new Hero("Hero 12X", 14, false);
        hero2.getInfo();
        hero2.speedUp(10);
        hero2.getInfo();
        hero2.speedDown(5);
        hero2.getInfo();
        hero2.pressHorn();
    }   
}
