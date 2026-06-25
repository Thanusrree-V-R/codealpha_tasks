import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StockMarket market = new StockMarket();
        Portfolio portfolio = DataManager.loadPortfolio();

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. View Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Save Portfolio");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    market.displayMarketData();
                    break;

                case 2:
                    System.out.print("Enter Company Name: ");
                    String buyCompany = sc.nextLine();

                    Stock buyStock = market.findStock(buyCompany);

                    if (buyStock == null) {
                        System.out.println("Stock Not Found");
                        break;
                    }

                    System.out.print("Enter Quantity: ");
                    int buyQty = sc.nextInt();

                    portfolio.buyStock(buyCompany, buyQty);

                    System.out.println("Stock Purchased");
                    break;

                case 3:
                    System.out.print("Enter Company Name: ");
                    String sellCompany = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int sellQty = sc.nextInt();

                    boolean sold = portfolio.sellStock(sellCompany, sellQty);

                    if (sold) System.out.println("Stock Sold");
                    else System.out.println("Transaction Failed");
                    break;

                case 4:
                    portfolio.displayPortfolio();
                    break;

                case 5:
                    DataManager.savePortfolio(portfolio);
                    System.out.println("Portfolio Saved");
                    break;

                case 6:
                    DataManager.savePortfolio(portfolio);
                    System.out.println("Thank You");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
