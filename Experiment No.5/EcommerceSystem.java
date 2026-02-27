class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
    }
}

class Order {
    Product product;
    int quantity;

    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double calculateTotal() {
        return product.price * quantity;
    }

    void displayOrder() {
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Customer c1 = new Customer("Shruti");
        Order o1 = new Order(p1, 2);

        c1.displayCustomer();
        System.out.println("------------------");
        o1.displayOrder();
    }
}