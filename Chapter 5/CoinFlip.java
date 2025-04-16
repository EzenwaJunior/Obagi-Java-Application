import java.util.Random;

public class CoinFlip {

    enum Coin { HEADS, TAILS }

    public static Coin flip() {
        Random rand = new Random();
        return rand.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Coin result = flip();
        System.out.println("You flipped: " + result);
    }
}
