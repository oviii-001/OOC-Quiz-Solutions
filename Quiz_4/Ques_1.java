package Quiz_4;


interface Rentable {
    double calculateRentalCost();
}

class InvalidRentalDataException extends Exception {
    public InvalidRentalDataException(String message) {
        super(message);
    }
}


abstract class Vehicle {
    protected String vehicleName;
    protected double baseRate; 

    public Vehicle(String vehicleName, double baseRate) {
        this.vehicleName = vehicleName;
        this.baseRate = baseRate;
    }

    public void displayDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Base Rate: $" + baseRate + " per hour");
    }
}


class Car extends Vehicle implements Rentable {
    private double rentalDuration;

    public Car(String vehicleName, double baseRate, double rentalDuration) throws InvalidRentalDataException {
        super(vehicleName, baseRate);
        if (rentalDuration < 0) {
            throw new InvalidRentalDataException("Rental duration cannot be negative.");
        }
        this.rentalDuration = rentalDuration;
    }

    @Override
    public double calculateRentalCost() {
        return baseRate * rentalDuration;
    }
}


class Bike extends Vehicle implements Rentable {
    private double rentalDuration; 

    public Bike(String vehicleName, double baseRate, double rentalDuration) throws InvalidRentalDataException {
        super(vehicleName, baseRate);
        if (rentalDuration < 0) {
            throw new InvalidRentalDataException("Rental duration cannot be negative.");
        }
        this.rentalDuration = rentalDuration;
    }

    @Override
    public double calculateRentalCost() {
        return baseRate * rentalDuration;
    }
}

// Main Class-এইটুক লাগবে না, প্রশ্নেই দেয়া আছে।
// public class Ques_1 {
//     public static void main(String[] args) {
//         try {
//             Car car = new Car("Sedan", 10.0, 5.0);
//             car.displayDetails();
//             System.out.println("Car Rental Cost: $" + car.calculateRentalCost());
//             System.out.println();

//             Bike bike = new Bike("Mountain Bike", 8.0, 3.0);
//             bike.displayDetails();
//             System.out.println("Bike Rental Cost: $" + bike.calculateRentalCost());
//             System.out.println();

//             System.out.println("Testing with invalid data:");
//             Car invalidCar = new Car("Convertible", 12.0, -4.0);
//         } catch (InvalidRentalDataException e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         try {
//             Bike invalidBike = new Bike("Road Bike", 15.0, -2.0);
//         } catch (InvalidRentalDataException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

