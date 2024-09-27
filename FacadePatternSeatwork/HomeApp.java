public class HomeApp{

    public static void main(String[] args) {

        HomeInterface homeInterface = new HomeInterface();

        // Turn on all services
        System.out.println("✔\uFE0FTurn On:✔\uFE0F");
        homeInterface.turnOnAll();

        // Turn off all services
        System.out.println("\n❌Turn Off:❌");
        homeInterface.turnOffAll();
    }
}
