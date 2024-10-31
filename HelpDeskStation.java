public class HelpDeskStation {
    private String stationName;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public void serveNext() {
        PagibigQueueSystem queueSystem = PagibigQueueSystem.getInstance();
        queueSystem.incrementQueueNumber();
        System.out.println(stationName + " served a person.");
    }
    public void resetQueue(int newNumber) {
        PagibigQueueSystem queueSystem = PagibigQueueSystem.getInstance();
        queueSystem.resetQueueNumber(newNumber);
        System.out.println(stationName + " reset the queue to " + newNumber);
    }
}
