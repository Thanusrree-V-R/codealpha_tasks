public class Transaction {

    private String company;
    private String type;
    private int quantity;
    private double price;

    public Transaction(String company, String type, int quantity, double price) {
        this.company = company;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return type + " | " + company + " | Qty: " + quantity + " | Price: ₹" + price;
    }
}
