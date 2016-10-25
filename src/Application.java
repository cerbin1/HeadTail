import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);

    private CoinThrower coin = new CoinThrower();

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        System.out.println("Head or tail?");
        String choice = scanner.nextLine();

        while (true) {
            if (checkIfHeadOrTail(choice)) {
                break;
            } else {
                System.out.println("Error. Try to type again.");
                choice = scanner.nextLine();
            }
        }

        if (choice.equals(coin.randomCoin())) {
            System.out.println("Win :)");
        } else {
            System.out.println("Lose :(");
        }
    }

    private boolean checkIfHeadOrTail(String stringToCheck) {
        return stringToCheck.equals("head") || stringToCheck.equals("tail");
    }
}
