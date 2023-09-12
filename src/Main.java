// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Asus", "ROG", 1299.99, 16);

        laptop1.displayInfo();

        laptop1.setBrand("Dell");
        laptop1.setPrice(99.99);
        laptop1.setScreenSize(100);

        laptop1.displayInfo();
    }
}