public class Main {
    public static void main(String[] args) {
        PagibigQueueSystem queueSystem = PagibigQueueSystem.getInstance();

        // Create help desk stations
        HelpDeskStation station1 = new HelpDeskStation("Station 1");
        HelpDeskStation station2 = new HelpDeskStation("Station 2");
        HelpDeskStation station3 = new HelpDeskStation("Station 3");

        // Serve people at different stations
        station1.serveNext();
        station2.serveNext();
        station3.serveNext();

        // Display the current queue number
        queueSystem.displayQueueNumber();

        // Reset the queue number
        station1.resetQueue(10);

        // Display the queue number after reset
        queueSystem.displayQueueNumber();
    }
}
