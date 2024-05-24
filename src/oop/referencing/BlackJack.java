package oop.referencing;

import java.util.Scanner;

public class BlackJack {
    Player player;
    int dealerValue;

    BlackJack(Player player) {
        this.player = player;
    }

    Scanner sc = new Scanner(System.in);
    int input;
    int bet;

    void start() {
        System.out.println("Balance: " + player.balance);
        do {
            System.out.print("Place a valid bet: ");
            input = sc.nextInt();
        } while (input > player.balance);
        bet = 2 * input;
        player.balance -= input;
    }

    int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    int cardIndex;
    int cardValue;

    void pickACard() {
        cardIndex = (int) (Math.random() * cards.length);
        cardValue = cards[cardIndex];
        player.handValue += cardValue;
    }

    int evaluate() {
        if (player.handValue > 21) {
            return 0;
        } else if (player.handValue == 21) {
            return 2;
        }
        return 1;
    }

    void gameOver() {
        if (evaluate() == 0) {
            System.out.println("You lost!");
        } else if (evaluate() == 2) {
            System.out.println("You won " + bet + " coins");
            player.balance += bet;
        }
    }

    public static void main(String[] args) {
        Player p = new Player("Karel", 1000);
        BlackJack game = new BlackJack(p);

        game.start();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            if (game.evaluate() == 1) {
                System.out.print("Enter your option: ");
                option = sc.nextInt();
                game.pickACard();
                System.out.println("Value of the current card: " + game.cardValue);
                System.out.println("Value in hand: " + game.player.handValue);
            } else {
                game.gameOver();
                break;
            }
        } while (option == 1);
    }
}
