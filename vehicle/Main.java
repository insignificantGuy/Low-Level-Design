package vehicle;

public class Main {
    public static void main(String[] args){
        DriveStrategy driveStrategy = new NormalDriveStrategy();
        NormalCar normalCar = new NormalCar(driveStrategy);
        normalCar.drive();

        DriveStrategy driveStrategy2 = new SportsDriveStrategy();
        SportsCar sportsCar = new SportsCar(driveStrategy2);
        sportsCar.drive();
    }
}
