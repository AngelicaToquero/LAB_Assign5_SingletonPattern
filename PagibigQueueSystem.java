public class PagibigQueueSystem {
    private static PagibigQueueSystem instance;
    private int queueNumber;

    // Private constructor to prevent instantiation
    private PagibigQueueSystem() {
        queueNumber = 0; // Starting queue number
    }

    // Singleton instance retrieval method
    public static synchronized PagibigQueueSystem getInstance() {
        if (instance == null) {
            instance = new PagibigQueueSystem();
        }
        return instance;
    }

    // Get the current queue number
    public synchronized int getQueueNumber() {
        return queueNumber;
    }

    // Increment the queue number for the next person
    public synchronized void incrementQueueNumber() {
        queueNumber++;
        System.out.println("Next queue number: " + queueNumber);
    }

    // Reset the queue number to a specific value
    public synchronized void resetQueueNumber(int newNumber) {
        queueNumber = newNumber;
        System.out.println("Queue number reset to: " + queueNumber);
    }

    // Display the current queue number (for monitoring purposes)
    public synchronized void displayQueueNumber() {
        System.out.println("Current queue number: " + queueNumber);
    }
}
