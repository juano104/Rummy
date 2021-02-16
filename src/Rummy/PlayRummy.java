/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rummy;

import Game.*;
import java.util.Scanner;

/**
 *
 * @author juani
 */
public class PlayRummy {
    //boolean play = false;

    public void playRummy() {
        //here make the game
        //making scanners to input the players
        System.out.println("Insert two players:");
        System.out.println("Name of Player 1:");
        Scanner scannerp1 = new Scanner(System.in);
        String namep1 = scannerp1.nextLine();
        Player p1 = new Player(namep1);
        System.out.println("Name of Player 2:");
        Scanner scannerp2 = new Scanner(System.in);
        String namep2 = scannerp2.nextLine();
        Player p2 = new Player(namep2);
        p1.showInfo();
        p2.showInfo();
        System.out.println("Now we make a deck and shuffle it");
        Deck d = new Deck();
        Pit p = new Pit();
        Board b = new Board();
        d.showDeck();
        p.showPit();
        System.out.println("*****Shuffling deck*****");
        d.shuffle();
        System.out.println("Next step: deal 10 cards to every player");
        p1.setHand(d.deal(10));
        p2.setHand(d.deal(10));
        System.out.println(p1.getName() + " has " + p1.getHand().size() + " cards");
        System.out.println(p2.getName() + " has " + p2.getHand().size() + " cards");
        System.out.println(p1.getName() + " will go first!");
        p1.setTurn(true);

        //player 1 starts playing
        while (true) {
            while (p1.isTurn()) {
                if (p1.getHand().isEmpty()) {
                    System.out.println("P1 wins");
                    break;
                }
                p1.showHand();
                p.showTopCard();

                System.out.println("Where will you pick from?\n1-Deck Pile\n2-Pit Pile");
                int answer = validRange(1, 2);
                //draw accordingly
                if (answer == 1) {
                    p1.pickFromDeck(d.getDeck());
                } else if (answer == 2) {
                    try {
                        p1.pickFromPit(p.getPit());
                    } catch (Exception e) {
                        System.out.println("Empty pit, picking from DECK");
                        p1.pickFromDeck(d.getDeck());
                    }

                }

                System.out.println("Table cards: " + b.getBoard());
                System.out.println("Your cards: ");
                p1.showHand();

                System.out.println("What will you do?");
                System.out.println("1-Discard(ends turn)\n2-Make play\n3-Meld");

                int play = validRange(1, 3);

                if (play == 1) {
                    if (p1.getHand().size() > 1) {
                        System.out.println("Enter the position of what card you want to discard");
                        p1.showHand();
                        Scanner pos = new Scanner(System.in);
                        int card = pos.nextInt();
                        p1.putInPit(p.getPit(), card);
                        p.showTopCard();
                        p1.showHand();
                        p1.setTurn(false);
                        p2.setTurn(true);
                        break;
                    } else {
                        System.out.println("P1 WIN");
                        break;
                    }

                }

            } while(p2.isTurn()) {
                if (p2.getHand().isEmpty()) {
                    System.out.println("P2 wins");
                    break;
                }
                p2.showHand();
                p.showTopCard();

                System.out.println("Where will you pick from?\n1-Deck Pile\n2-Pit Pile");
                int answer = validRange(1, 2);
                //draw accordingly
                if (answer == 1) {
                    p2.pickFromDeck(d.getDeck());
                } else if (answer == 2) {
                    try {
                        p2.pickFromPit(p.getPit());
                    } catch (Exception e) {
                        System.out.println("Empty pit, picking from DECK");
                        p2.pickFromDeck(d.getDeck());
                    }

                }

                System.out.println("Table cards: " + b.getBoard());
                System.out.println("Your cards: ");
                p2.showHand();

                System.out.println("What will you do?");
                System.out.println("1-Discard(ends turn)\n2-Make play\n3-Meld");

                int play = validRange(1, 3);

                if (play == 1) {
                    if (p2.getHand().size() > 1) {
                        System.out.println("Enter the position of what card you want to discard");
                        p2.showHand();
                        Scanner pos = new Scanner(System.in);
                        int card = pos.nextInt();
                        p2.putInPit(p.getPit(), card);
                        p.showTopCard();
                        p2.showHand();
                        p2.setTurn(false);
                        p1.setTurn(true);
                        break;
                    } else {
                        System.out.println("P2 WIN");
                        break;
                    }

                }
            }
        }

    }

    public static int validRange(int min, int max) {

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                String stringInput = sc.nextLine();
                int intInput = Integer.parseInt(stringInput);
                if (intInput >= min && intInput <= max) {
                    return intInput;
                } else {
                    System.out.println("Please enter a number inside the range " + min + " " + max);
                }
            } catch (NumberFormatException ime) {
                System.out.println("Please type a positive number");
            }
        }
    }
}
