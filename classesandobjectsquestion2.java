import java.util.Scanner;

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    double getPrice() {
        return price;
    }
}

public class StoreApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product product = new Product("Shoes", 3000);

        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();

        product.applyDiscount(discount);

        System.out.println("New price: " + product.getPrice());
    }
}
