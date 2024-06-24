package parking;

import java.util.ArrayList;
import java.util.Map;

public class Admin {
    Map<VehicleType, ArrayList<ParkingSpot>>parkingSpots;

    public Admin(Map<VehicleType, ArrayList<ParkingSpot>>parkingSpots){
        this.parkingSpots = parkingSpots;
    }

    public void addNewParkingSpots(VehicleType vehicleType, int newSpots){
        parkingSpots.computeIfAbsent(vehicleType, k -> new ArrayList<ParkingSpot>());
        
        ArrayList<ParkingSpot> allParkingSpots = parkingSpots.get(vehicleType);
        for(int i=0;i<newSpots;i++){
            allParkingSpots.add(new ParkingSpot(i));
        }
    }
}
