public class CoinThrower {
    private String[] headTailArray = {"head", "tail"};

    String randomCoin() {
        int randomNumber = (int) (Math.round(Math.random() * 1));
        return headTailArray[randomNumber];
    }


}
