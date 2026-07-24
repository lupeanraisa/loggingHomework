import java.io.IOException;
import java.util.SimpleTimeZone;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    /// MENTIONED IN THE CONFIG FILE!!!!
//    private static final FileHandler FILE_HANDLER;

//    static {
//        try {
//            FILE_HANDLER = new FileHandler("C:\\Users\\LupeanRaisaMaria\\IdeaProjects\\internship_log\\logs.log");
//            LOGGER.addHandler(FILE_HANDLER);
//            // formatting is horrid to read, so i added this magic thing :)
//            SimpleFormatter formatter = new SimpleFormatter();
//            FILE_HANDLER.setFormatter(formatter);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void main(String[] args) {
//        System.out.println("Application starting up");
//        System.out.println("Database URL = jdbc:postgresql://localhost:5432/mydb");
//        System.out.println("Max connection pool size = 10");
//        System.out.println(System.getProperty("user.dir"));
        LOGGER.info("Application starting up");
        LOGGER.config("Database URL = jdbc:postgresql://localhost:5432/mydb");
        LOGGER.config("Max connection pool size = 10");

        processOrder("ORD-1234", 3);

//        System.out.println("Application shutting down");
        LOGGER.info("Application shutting down");
    }

    private static void processOrder(String orderId, int quantity) {
//        System.out.println("Processing order: " + orderId);
//        System.out.println("Entering processOrder(orderId=" + orderId + ", quantity=" + quantity + ")");

        LOGGER.info("Processing order: " + orderId);
        LOGGER.info("Entering processOrder(orderId=" + orderId + ", quantity=" + quantity + ")");

        // Simulate a validation step
//        System.out.println("Starting input validation for order " + orderId);
        LOGGER.info("Starting input validation for order " + orderId);
        if (quantity <= 0) {
//            System.out.println("Invalid quantity (" + quantity + ") for order " + orderId);
            LOGGER.warning("Invalid quantity (" + quantity + ") for order " + orderId);
            return;
        }
        LOGGER.info("Validation passed");
//        System.out.println("Validation passed");

        // Simulate price calculation
        double pricePerUnit = 29.99;
        double total = pricePerUnit * quantity;
//        System.out.println("Price per unit: " + pricePerUnit + ", computed total: " + total);
        LOGGER.info("Price per unit: " + pricePerUnit + ", computed total: " + total);

        // Simulate a database save
//        System.out.println("Saving order " + orderId + " to database");
        LOGGER.info("Saving order " + orderId + " to database");
        try {
            saveToDatabase(orderId, total);
        } catch (Exception e) {
//            System.out.println("Failed to save order " + orderId + e);
            LOGGER.severe("Failed to save order " + orderId + e);
            return;
        }

//        System.out.println("Order " + orderId + " processed successfully — total: $" + total);
//        System.out.println("Exiting processOrder()");

        LOGGER.info("Order " + orderId + " processed successfully — total: $" + total);
        LOGGER.info("Exiting processOrder()");
    }

    private static void saveToDatabase(String orderId, double total) {
        // Simulate a successful save
//        System.out.println("Executing INSERT for order " + orderId + " with total " + total);
//        System.out.println("SQL: INSERT INTO orders (id, total) VALUES ('" + orderId + "', " + total + ")");

        LOGGER.fine("Executing INSERT for order " + orderId + " with total " + total);
        LOGGER.fine("SQL: INSERT INTO orders (id, total) VALUES ('" + orderId + "', " + total + ")");
    }
}