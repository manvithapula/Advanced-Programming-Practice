//RA211003010001 week 6 Q8
// Define the Flyable interface
interface Flyable {
    void fly_obj();
}
// Implement the Flyable interface in the Spacecraft class
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying.");
    }
}
// Implement the Flyable interface in the Airplane class
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying.");
    }
}
// Implement the Flyable interface in the Helicopter class
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying.");
    }
}
public class Flyable1 {
    public static void main(String[] args) {
        // Create objects of the three classes
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();
        // Call the fly_obj() method for each object
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
