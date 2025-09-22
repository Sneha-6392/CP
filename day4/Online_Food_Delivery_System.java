package CP.day4;

// abstract class banai hai
abstract class FoodItems {
    private String itemName;
    private double price;
    private int quantity;

    // constructor
    public FoodItems(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // abstract method
    public abstract double calculateTotalPrice();

    // concrete method
    public void getItemDetails() {
        System.out.println("Item Name: " + getItemName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
}

// interface banai hai
interface Discountable {
    double applyDiscount(double totalPrice);
    String getDiscountDetails();
}

// class VegItems jo FoodItems ko extend karta hai aur Discountable ko implement karta hai
class VegItems extends FoodItems implements Discountable {
    public VegItems(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.9;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg Items";
    }
}

// class NonVegItems jo FoodItems ko extend karta hai aur Discountable ko implement karta hai
class NonVegItems extends FoodItems implements Discountable {
    public NonVegItems(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.9;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Non-Veg Items";
    }
}

public class Online_Food_Delivery_System {
    public static void main(String[] args) {
        VegItems order1 = new VegItems("Soya Chaap", 149.99, 2);
        NonVegItems order2 = new NonVegItems("Chicken Masala", 249.99, 1);

        order1.getItemDetails();
        double total1 = order1.calculateTotalPrice();
        System.out.println("Total Price: " + total1);
        double discountedTotal1 = order1.applyDiscount(total1);
        System.out.println(order1.getDiscountDetails());
        System.out.println("Discounted Total Price: " + discountedTotal1);
        System.out.println();

        order2.getItemDetails();
        double total2 = order2.calculateTotalPrice();
        System.out.println("Total Price: " + total2);
        double discountedTotal2 = order2.applyDiscount(total2);
        System.out.println(order2.getDiscountDetails());
        System.out.println("Discounted Total Price: " + discountedTotal2);
        System.out.println();


    }
}