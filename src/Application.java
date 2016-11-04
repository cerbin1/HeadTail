import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);

    private CoinThrower coin = new CoinThrower();

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        while (true) {
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

            if (!checkIfUserWantToPlayAnotherGame()) {
                System.out.println("Thanks for game!");
                break;
            }
        }
    }

    private boolean checkIfHeadOrTail(String stringToCheck) {

        return stringToCheck.toLowerCase().equals("head") || stringToCheck.toLowerCase().equals("tail");
    }

    private boolean checkIfUserWantToPlayAnotherGame() {
        System.out.println("Do you want to play more? yes/no");
        switch (scanner.nextLine()) {
            case "yes":
                return true;
            case "no":
                return false;
            default:
                System.out.println("Type answer again");
                checkIfUserWantToPlayAnotherGame();
        }
        return false;
    }
}
