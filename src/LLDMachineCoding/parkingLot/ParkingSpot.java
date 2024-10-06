package LLDMachineCoding.parkingLot;

import LLDMachineCoding.parkingLot.vehicleType.Vehicle;
import LLDMachineCoding.parkingLot.vehicleType.VehicleType;

public class ParkingSpot {
    // has info regarding spotNumber, vehicleType and vehicle
    private final int spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber,VehicleType vehicleType){
        this.spotNumber=spotNumber;
        this.vehicleType=vehicleType;
    }

    //also has methods to check availability, parkVehicle, unpark Vehicle, and to get info regarding spotNumber and VehicleType

    public boolean isAvailable(){
        return parkedVehicle == null;
    }

    public void unparkVehicle(){
        parkedVehicle=null;
    }

    public void  parkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getType()==vehicleType){
            parkedVehicle=vehicle;
        }
        else{
            System.out.println("ParkingSpot is unavailbale");
        }
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
