// Save this file as DemoClass.java
public class demo{

    // 1. Instance variables (attributes)
    private String developerName;
    private int experienceYears;

    // 2. Constructor to initialize the object
    public DemoClass(String name, int years) {
        this.developerName = name;
        this.experienceYears = years;
    }

    // 3. A basic method that prints a greeting
    public void displayGreeting() {
        System.out.println("Hello from DemoClass!");
        System.out.println("Developer: " + developerName);
        System.out.println("Experience: " + experienceYears + " years");
    }

    // 4. A method that calculates and returns a value
    public int calculateDaysOfExperience() {
        return this.experienceYears * 365;
    }

    // 5. The main method - the entry point of any Java application
    public static void main(String[] args) {
        // Create an instance (object) of DemoClass
        DemoClass demo = new DemoClass("Alice", 5);

        // Call the methods using the object
        demo.displayGreeting();
        
        int totalDays = demo.calculateDaysOfExperience();
        System.out.println("Approximate days of coding: " + totalDays);
    }
}
