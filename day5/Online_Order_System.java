package CP.day5;

/*
Online Order System
🔸 Scenario: Create a system to manage online customer orders for a store.
🔸 Classes:
        Customer (customerId, name, email)
        Product (productId, productName, price)
        Order (customer, product, quantity)
🔸 Tasks:
        Encapsulate all data members.
        Use composition to associate Customer and Product via Order.
        Add a method to calculate total order price.
        Extend to include RegularCustomer and PremiumCustomer.
        Use polymorphism to apply different discount rates based on customer type.
 */
// class customer
 class Customer {
    private String customerId;
    private String name;
    private String email;

    // constructor
    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    // method discount
    public double getDiscount(double totalPrice) {
        return 0; 
    }

    public String info() {
        return name + " (" + email + ")";
    }
}

// subclass regular customer
class RegularCustomer extends Customer {
    public RegularCustomer(String customerId, String name, String email) {
        super(customerId, name, email);
    }

    // method banaya hai ki agar customer regular hai to 10% discount milega
    @Override
    public double getDiscount(double totalPrice) {
        return totalPrice * 0.10; 
    }
}

// subclass premium customer
class PremiumCustomer extends Customer {
    public PremiumCustomer(String customerId, String name, String email) {
        super(customerId, name, email);
    }

    // method banaya hai ki agar customer premium hai to 20% discount milega
    @Override
    public double getDiscount(double totalPrice) {
        return totalPrice * 0.20; 
    }
}

 // class products
 class Products {
    private String productId;
    private String productName;
    private double price;

    // constructor
    public Products(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // price ko use karne ke liye getter method
    public double getPrice() {
        return price;
    }

    public String info() {
        return productName + " (Rs." + price + ")";
    }
}

// class order
class Order {
    private Customer customer;
    private Products product;
    private int quantity;

    // constructor
    public Order(Customer customer, Products product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    // total price kitna hua use calculate karne ke liye method
    public double calculateTotalPrice() {
        double totalPrice = product.getPrice() * quantity;
        double discount = customer.getDiscount(totalPrice);
        return totalPrice - discount;
    }

    public void showinfo() {
        System.out.println("Customer: " + customer.info());
        System.out.println("Product: " + product.info());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price after discount: Rs." + calculateTotalPrice());
    }
}

// class main
public class Online_Order_System {
    public static void main(String[] args) {

        // regular customer
        Customer regularCustomer = new RegularCustomer("RC2353632", "Sneha Maurya", "snehamaurya@gmail.com");
        Products product1 = new Products("BUD37438", "Earbuds", 999.00);
        Order order1 = new Order(regularCustomer, product1, 2);

        // premium customer
        Customer premiumCustomer = new PremiumCustomer("PC2435464", "Tushar Bansal", "tusharbansal@gmail.com");
        Products product2 = new Products("SP38472", "Smartphone", 24999.00);
        Order order2 = new Order(premiumCustomer, product2, 1);

        order1.showinfo();
        System.out.println();
        order2.showinfo();

    }
}
