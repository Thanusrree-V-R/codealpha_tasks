import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;

public class DataManager {

    private static final String FILE_NAME = "data/portfolio.txt";

    public static void savePortfolio(Portfolio portfolio) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME);

            for (Map.Entry<String, Integer> entry : portfolio.getHoldings().entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }

            writer.close();
        } catch (Exception e) {
            System.out.println("Error Saving Portfolio");
        }
    }

    public static Portfolio loadPortfolio() {
        Portfolio portfolio = new Portfolio();

        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) return portfolio;

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(",");
                portfolio.buyStock(parts[0], Integer.parseInt(parts[1]));
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error Loading Portfolio");
        }

        return portfolio;
    }
}
