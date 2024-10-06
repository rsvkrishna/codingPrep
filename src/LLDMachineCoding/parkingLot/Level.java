package LLDMachineCoding.parkingLot;

import LLDMachineCoding.parkingLot.vehicleType.Vehicle;
import LLDMachineCoding.parkingLot.vehicleType.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final int floor;
    private final List<ParkingSpot> parkingSpots;

    public Level(int floor,int numOfSpots){
        this.floor=floor;
        parkingSpots=new ArrayList<>(numOfSpots);

        //out of 100 spots, 50 for bikes, 40 for cars and , 10 for trucks
        double spotsForBikes = 0.50;
        double spotsForCars = 0.40;

        int numOfBikes = (int) (numOfSpots*spotsForBikes);
        int numOfCars = (int) (numOfSpots*spotsForCars);

        for(int i =1;i<=numOfBikes;i++)
            parkingSpots.add(new ParkingSpot(i, VehicleType.MOTORCYCLE));
        for(int i = numOfBikes+1;i<=numOfBikes+numOfCars;i++)
            parkingSpots.add((new ParkingSpot(i,VehicleType.CAR)));
        for(int i = numOfBikes+numOfCars+1;i<=numOfSpots;i++)
            parkingSpots.add(new ParkingSpot(i,VehicleType.TRUCK));
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot  spot : parkingSpots){
            if(spot.isAvailable() && spot.getVehicleType()==vehicle.getType()){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpots){
            if(!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)){
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }

    public void displayAvailability() {
        System.out.println("Level " + floor + " Availability:");
        for (ParkingSpot spot : parkingSpots) {
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available For"  : "Occupied By ")+" "+spot.getVehicleType());
        }
    }
}
