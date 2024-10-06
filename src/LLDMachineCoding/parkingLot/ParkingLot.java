package LLDMachineCoding.parkingLot;

import LLDMachineCoding.parkingLot.vehicleType.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLotInstance;
    private final List<Level> levels;

    private ParkingLot(){
        levels = new ArrayList<>();
    }

    public static ParkingLot getInstance(){
        if(parkingLotInstance == null)
            parkingLotInstance = new ParkingLot();
        return parkingLotInstance;
    }

    public void addLevels(Level level){
        levels.add(level);
    }

    public boolean parkVehicle( Vehicle vehicle) {
        for (Level level : levels) {
            if (level.parkVehicle(vehicle)) {
                System.out.println("Vehicle parked successfully.");
                return true;
            }
        }
        System.out.println("Could not park vehicle.");
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.unParkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public void displayAvailability() {
        for (Level level : levels) {
            level.displayAvailability();
        }
    }

}
