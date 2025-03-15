import java.util.Scanner;

public class TollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vehicles to process:");
        int numVehicles = scanner.nextInt();

        for (int i = 0; i < numVehicles; i++) {
            System.out.println("Enter vehicle type (Car/Truck):");
            String vehicleType = scanner.next();

            System.out.println("Does the vehicle have an RFID pass? (yes/no):");
            String hasRFID = scanner.next();

            double tollFee = calculateToll(vehicleType, hasRFID.equalsIgnoreCase("yes"));
            System.out.println("Toll fee for vehicle " + (i + 1) + ": ₹" + tollFee);
        }

        scanner.close();
    }

    public static double calculateToll(String vehicleType, boolean hasRFID) {
        double tollFee = 0;

        if (vehicleType.equalsIgnoreCase("Car")) {
            tollFee = 100;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            tollFee = 200;
        } else {
            System.out.println("Invalid vehicle type!");
            return tollFee;
        }

        if (hasRFID) {
            tollFee *= 0.9; 
        }

        return tollFee;
    }
}
