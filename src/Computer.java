public class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer() {
        brand = " ";
        model = " ";
        price = 0;
    }

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

class Laptop extends Computer {

    private double screenSize;

    public Laptop(String brand, String model, double price, double screenSize) {
        super(brand, model, price); // Call the constructor of the parent class
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size (inches): " + screenSize);
    }

}