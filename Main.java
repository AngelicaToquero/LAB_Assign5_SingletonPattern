public class Main {
    public static void main(String[] args) {
        PagibigQueueSystem queueSystem = PagibigQueueSystem.getInstance();

        HelpDeskStation station1 = new HelpDeskStation("Station 1");
        HelpDeskStation station2 = new HelpDeskStation("Station 2");
        HelpDeskStation station3 = new HelpDeskStation("Station 3");

        station1.serveNext();
        station2.serveNext();
        station3.serveNext();

        queueSystem.displayQueueNumber();  //display queue
        station1.resetQueue(10); //reset queue
        queueSystem.displayQueueNumber(); //display new queue
    }
}
