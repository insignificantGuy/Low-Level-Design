package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Level {
    Map<VehicleType, ArrayList<ParkingSpot>>parkingSpots;
    int floorNumber;

    public Level(int floorNumber, Map<VehicleType, ArrayList<ParkingSpot>>parkingSpots){
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber(){
        return floorNumber;
    }

    public List<ParkingSpot> getAllParkingSpots(VehicleType vehicleType){
        if(parkingSpots.get(vehicleType)!=null){
            return parkingSpots.get(vehicleType);
        }
        return new ArrayList<>();
    }

    public void assignParkingSpot(VehicleType vehicleType, Car car){
        List<ParkingSpot> allParkingSpots = parkingSpots.get(vehicleType);

        for(ParkingSpot parkingSpot: allParkingSpots){
            if(parkingSpot.isAvailable()){
                parkingSpot.parkVehicle(car);
                break;
            }
        }
    }

    public void removeParkingSpots(VehicleType vehicleType, Car car){
        List<ParkingSpot> allParkingSpots = parkingSpots.get(vehicleType);

        for(ParkingSpot parkingSpot: allParkingSpots){
            if(parkingSpot.getCar().equals(car)){
                parkingSpot.unParkVehicle();
                System.out.println("Amount to be Paid is " + parkingSpot.getCalculateAmount(vehicleType));
                break;
            }
        }
    }
}
