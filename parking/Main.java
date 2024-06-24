package parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<VehicleType, ArrayList<ParkingSpot>>parkingSpots = new HashMap<>();
        parkingSpots.put(VehicleType.CAR, new ArrayList<>());
        parkingSpots.put(VehicleType.BIKE, new ArrayList<>());
        parkingSpots.put(VehicleType.HANDICAP, new ArrayList<>());
        parkingSpots.put(VehicleType.TRUCK, new ArrayList<>());
        
        Admin admin = new Admin(parkingSpots);
        admin.addNewParkingSpots(VehicleType.CAR, 100);
        admin.addNewParkingSpots(VehicleType.BIKE, 40);
        admin.addNewParkingSpots(VehicleType.TRUCK, 70);
        admin.addNewParkingSpots(VehicleType.HANDICAP, 10);

        Level level = new Level(1, parkingSpots);
        
        // Entry car
        Car car = new Car("123456", VehicleType.HANDICAP);
        level.assignParkingSpot(VehicleType.HANDICAP, car);

        // Exit car
        level.removeParkingSpots(VehicleType.HANDICAP, car);

    }
}
