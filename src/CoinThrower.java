class CoinThrower {
    private String[] headTailArray;

    CoinThrower() {
        headTailArray = new String[]{"head", "tail"};
    }

    String randomCoin() {
        int randomNumber = (int) (Math.round(Math.random() * 1));
        return headTailArray[randomNumber];
    }

}
