package LLDMachineCoding.parkingLot;

import LLDMachineCoding.parkingLot.vehicleType.Car;
import LLDMachineCoding.parkingLot.vehicleType.MotorCycle;
import LLDMachineCoding.parkingLot.vehicleType.Truck;
import LLDMachineCoding.parkingLot.vehicleType.Vehicle;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevels(new Level(1, 100));
        parkingLot.addLevels(new Level(2, 80));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new MotorCycle("M1234");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
}
