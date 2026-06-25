import java.util.HashMap;
import java.util.Map;

public class Portfolio {

    private Map<String, Integer> holdings;

    public Portfolio() {
        holdings = new HashMap<>();
    }

    public void buyStock(String company, int quantity) {
        holdings.put(company, holdings.getOrDefault(company, 0) + quantity);
    }

    public boolean sellStock(String company, int quantity) {
        if (!holdings.containsKey(company)) return false;

        int current = holdings.get(company);

        if (current < quantity) return false;

        holdings.put(company, current - quantity);

        if (holdings.get(company) == 0) {
            holdings.remove(company);
        }

        return true;
    }

    public Map<String, Integer> getHoldings() {
        return holdings;
    }

    public void displayPortfolio() {
        System.out.println("\n===== PORTFOLIO =====");

        if (holdings.isEmpty()) {
            System.out.println("No Stocks Owned");
            return;
        }

        for (String company : holdings.keySet()) {
            System.out.println(company + " : " + holdings.get(company) + " shares");
        }
    }
}
