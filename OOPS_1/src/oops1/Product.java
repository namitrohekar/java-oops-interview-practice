package oops1;

public class Product {

    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percent) {
        if (percent <= 0 || percent > 100) {
            return;
        }
        double discountAmount = (percent / 100) * price;
        price -= discountAmount;
    }

    @Override
    public String toString() {
        return "Product{id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + '}';
    }

    public static void main(String[] args) {

        Product p1 = new Product(1, "iPhone 17", 140000);
        Product p2 = new Product(2, "MacBook M4", 100000);

        p1.applyDiscount(40);
        p2.applyDiscount(20);

        System.out.println(p1);
        System.out.println(p2);
    }
}
