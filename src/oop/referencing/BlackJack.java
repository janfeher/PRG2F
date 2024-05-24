package oop.referencing;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
    int pickedCard() {
        cardIndex = (int) (Math.random() * cards.length);
        cardValue = cards[cardIndex];
        return cardValue;
    }

    int evaluate() {
        if (player.handValue > 21) {
            return 0;
        } else if (player.handValue == 21) {
            return 2;
        }
        return 1;
    }

    int evaluateDealer() {
        if (player.handValue > 21) {
            return 0;
        } else if (player.handValue == 21) {
            return 2;
        }
        return 1;
    }

    void stand() throws InterruptedException {
        while (dealerValue < 17) {
            TimeUnit.MILLISECONDS.sleep(500);
            dealerValue += pickedCard();
            System.out.println("Value: " + cardValue);
        }
    }

    void gameOver(int result) {
        if (result == 0) {
            System.out.println("You lost!");
        } else if (result == 2) {
            System.out.println("You won " + bet + " coins");
            player.balance += bet;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Player p = new Player("Karel", 1000);
        BlackJack game = new BlackJack(p);

        Scanner sc = new Scanner(System.in);
        int option = 1;
        while (option == 1){
            game.start();
            game.player.handValue = 0;
            game.dealerValue = 0;
            while (game.evaluate() == 1) {
                System.out.print("Enter your option: ");
                option = sc.nextInt();
                if (option == 1) {
                    game.player.handValue += game.pickedCard();
                    System.out.println("Value of the current card: " + game.cardValue);
                    System.out.println("Value in hand: " + game.player.handValue);
                } else if (option == 2) {
                    game.stand();
                    break;
                }
            }
            if (game.evaluate() == 1) {
                System.out.println("Dealer's hand: " + game.dealerValue);
                if (game.dealerValue > 21 || game.dealerValue < game.player.handValue) {
                    game.gameOver(2);
                } else {
                    game.gameOver(0);
                }
            } else {
                game.gameOver(game.evaluate());
            }
            System.out.println("Do you want to play a new game?");
            option = sc.nextInt();
        }
    }
}
