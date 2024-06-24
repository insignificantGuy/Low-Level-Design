package bicycle;

public class Hero implements BicycleInterface{
    private String name;
    private int speed;
    private boolean hasHorn;

    public Hero(String name, int speed, boolean hasHorn){
        this.name = name;
        this.speed = speed;
        this.hasHorn = hasHorn;
    }

    public void speedUp(int accelerate){
        speed+=accelerate;
    }

    public void speedDown(int decelarate){
        speed-=decelarate;
    }

    public void pressHorn(){
        if(hasHorn){
            System.out.println("Horn was pressed");
        }
        else{
            throw new IllegalArgumentException("This bicycle does not have any horn");
        }
    }

    public void getInfo(){
        System.out.println(name + " Bicycle is currently travelling at a speed of " + speed);
    }
    
}
