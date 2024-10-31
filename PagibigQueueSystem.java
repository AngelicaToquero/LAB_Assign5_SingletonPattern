public class PagibigQueueSystem {
    private static PagibigQueueSystem instance;
    private int queueNumber;

    private PagibigQueueSystem() {
        queueNumber = 0; // Starting queue number
    }

    public static synchronized PagibigQueueSystem getInstance() {
        if (instance == null) {
            instance = new PagibigQueueSystem();
        }
        return instance;
    }

    public synchronized int getQueueNumber() {
        return queueNumber;
    }

    public synchronized void incrementQueueNumber() {
        queueNumber++;
        System.out.println("Next queue number: " + queueNumber);
    }

    public synchronized void resetQueueNumber(int newNumber) {
        queueNumber = newNumber;
        System.out.println("Queue number reset to: " + queueNumber);
    }

    public synchronized void displayQueueNumber() {
        System.out.println("Current queue number: " + queueNumber);
    }
}
