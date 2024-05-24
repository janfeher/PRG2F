package oop.referencing;

public class BlackJack {
    Player player;
    int dealerValue;

    BlackJack(Player player) {
        this.player = player;
    }

    int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    int cardIndex;
    int value;
    void pickACard() {
        cardIndex = (int) (Math.random() * cards.length);
        value = cards[cardIndex];
        player.handValue += value;
    }

    void

    void gameOver() {
        System.out.println("Game over");
    }

    public static void main(String[] args) {
        Player p = new Player("Karel", 1000);
        BlackJack game = new BlackJack(p);
        if (p.handValue > 21) {
            game.gameOver();
        }
    }
}
