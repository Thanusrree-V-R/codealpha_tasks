public class Stock {

    private String companyName;
    private double price;

    public Stock(String companyName, double price) {
        this.companyName = companyName;
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
       return companyName + " - $" + price;
    }
}
