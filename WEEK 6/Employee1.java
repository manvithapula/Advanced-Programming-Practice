//RA2211003010001 Week 6 Q4
class Employee1 {
    private String name;
    private double salary;
    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void work() {
        System.out.println(name + " is working.");
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
}
class HRManager extends Employee1 {
    public HRManager(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void work() {
        System.out.println(getName() + " is managing HR activities.");
    }
    public void addEmployee(Employee1 employee) {
        System.out.println(getName() + " is adding a new employee: " + employee.getName());
    }
}
class Main01 {
    public static void main(String[] args) {
        Employee1 employee = new Employee1("Suraj", 50000);
        HRManager hrManager = new HRManager("Luv", 70000);
        employee.work();
        System.out.println("Employee Salary: " + employee.getSalary()+"INR");
        hrManager.work();
        hrManager.addEmployee(new Employee1("Eve", 45000));
        System.out.println("HR Manager Salary: " + hrManager.getSalary()+"INR");
    }
}
