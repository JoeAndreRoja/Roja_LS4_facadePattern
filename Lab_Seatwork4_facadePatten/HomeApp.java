public class HomeApp {

    public static void main(String[] args) {

        HomeInterface home = new HomeInterface();

        System.out.println("=== Intelligent Home System ===");

        home.turnOnAll();

        System.out.println();

        home.turnOffAll();
    }
}