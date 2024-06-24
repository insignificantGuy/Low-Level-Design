package parking;

import java.time.Duration;
import java.time.LocalTime;

public class ParkingSpot {
    private final int parkingSpotNumber;
    private Car parkedCar;
    private LocalTime enterTime;

    public ParkingSpot(int parkingSpotNumber){
        this.parkingSpotNumber = parkingSpotNumber;
        this.parkedCar = null;
        this.enterTime = null;
    }

    public LocalTime getEntryTime(){
        return enterTime;
    }

    public boolean isAvailable(){
        return parkedCar==null;
    }

    public int getParkingSpotNumber(){
        return parkingSpotNumber;
    }

    public Car getCar(){
        return parkedCar;
    }

    public void parkVehicle(Car car){
        if(isAvailable()){
            parkedCar = car;
            enterTime =  LocalTime.now();
        }
        else{
            throw new IllegalArgumentException("The Parking Spot is Occupied");
        }
    }

    public void unParkVehicle(){
        if(parkedCar==null){
            throw new IllegalArgumentException("The Parking Spot is empty");
        }
        else{
            parkedCar = null;
        }
    }

    public int getCalculateAmount(VehicleType vehicleType){
        LocalTime exitTime = LocalTime.now();
        Duration duration = Duration.between(exitTime, enterTime);
        long hours = duration.toHours()+1;

        if(vehicleType == VehicleType.CAR){
            return (int) (10*hours);
        }
        else if(vehicleType == VehicleType.BIKE){
            return (int) (15*hours);
        }
        else if(vehicleType == VehicleType.TRUCK){
            return (int)(40*hours);
        }
        return 0;
    }
}
