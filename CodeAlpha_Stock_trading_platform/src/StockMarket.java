import java.util.ArrayList;
import java.util.List;

public class StockMarket {

    private List<Stock> stocks;

    public StockMarket() {
        stocks = new ArrayList<>();
        stocks.add(new Stock("Apple", 212.45));
stocks.add(new Stock("Microsoft", 498.10));
stocks.add(new Stock("Google", 183.72));
stocks.add(new Stock("Amazon", 224.11));
stocks.add(new Stock("Tesla", 318.55));
stocks.add(new Stock("NVIDIA", 162.48));
stocks.add(new Stock("Meta", 745.20));
stocks.add(new Stock("Netflix", 1280.75));
stocks.add(new Stock("Adobe", 395.80));
stocks.add(new Stock("Intel", 22.90));6

    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public Stock findStock(String company) {
        for (Stock stock : stocks) {
            if (stock.getCompanyName().equalsIgnoreCase(company)) {
                return stock;
            }
        }
        return null;
    }

    public void displayMarketData() {
        System.out.println("\n===== MARKET DATA =====");
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }
}
