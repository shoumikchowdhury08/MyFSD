package OOPS_Concept;

class Car {

    // properties
    int doors;
    int tyres;
    int speed;
    String color;


    // behaviours
    void start() {
        System.out.println("Starting the Car!!");
    }

    void accelerate(int speed) {
        this.speed += speed; // add speed sent by the driver to the speed property of the class
        System.out.println("Accelerated the Car by a speed of " + speed);
    }

}

public class Driver {

    public static void main(String[] args) {

        // Manufacturing
        Car car = new Car();
        car.doors = 5;
        car.tyres = 4;
        car.speed = 0;
        car.color = "blue";

        // Start
        car.start();

        // Accelerate
        car.accelerate(50);
    }
}