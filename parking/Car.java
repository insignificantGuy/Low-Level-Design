package parking;

public class Car {
    String licenseNumber;
    VehicleType vehicleType;

    public Car(String licenseNumber, VehicleType vehicleType){
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
