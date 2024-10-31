public class HelpDeskStation {
    private String stationName;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    // Serve the next person in the queue
    public void serveNext() {
        PagibigQueueSystem queueSystem = PagibigQueueSystem.getInstance();
        queueSystem.incrementQueueNumber();
        System.out.println(stationName + " served a person.");
    }

    // Reset the queue number from this station
    public void resetQueue(int newNumber) {
        PagibigQueueSystem queueSystem = PagibigQueueSystem.getInstance();
        queueSystem.resetQueueNumber(newNumber);
        System.out.println(stationName + " reset the queue to " + newNumber);
    }
}
