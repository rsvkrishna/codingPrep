package LLDMachineCoding.parkingLot.vehicleType;

public class Vehicle {
    protected String licensePlate;
    protected VehicleType type;

    public Vehicle(String licensPlate,VehicleType type){
        this.licensePlate = licensPlate;
        this.type=type;
    }

    public VehicleType getType() {
        return type;
    }
}
