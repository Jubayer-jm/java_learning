public class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String b, String c) {
        this.brand = b;
        this.color = c;
    }

    public void start() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle is starting...");
        System.out.println();
    }
}
