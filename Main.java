// Superclass
class Vehicle {
private String brand;
public Vehicle(String brand) {
this.brand = brand;
}
public void displayBrand() {
System.out.println("Brand: " + brand);
}
public void honk() {
System.out.println("Vehicle is honking");
}
}
// Subclass extending Vehicle
class Car extends Vehicle {
private int numberOfDoors;
public Car(String brand, int numberOfDoors) {
super(brand); // Calling Vehicle's constructor
this.numberOfDoors = numberOfDoors;
}
public void displayDetails() {
displayBrand(); // Calling Vehicle's method
System.out.println("Number of doors: " +
numberOfDoors);
honk(); // Calling Vehicle's method
}
}
public class Main {
public static void main(String[] args) {
Car myCar = new Car("Toyota", 4);
myCar.displayDetails();
}
}
