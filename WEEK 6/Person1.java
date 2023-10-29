//RA2211003010001 Week 6  Q1
public class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create two instances of the Person class and set their attributes using the constructor
        Person1 person1 = new Person1("John", 30);
        Person1 person2 = new Person1("Alice", 25);

        // Print the name and age of each person
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
