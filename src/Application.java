import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);

    CoinThrower coin = new CoinThrower();

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        System.out.println("Head or tail?");
        String choice = scanner.nextLine();
        if (choice.equals(coin.randomCoin())) {
            System.out.println("Win :)");
        } else {
            System.out.println("Lose :(");
        }
    }
}
