package com.company;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private final GameEngine game;
    Window() {
        setSize(600, 300);
        setLayout(new BorderLayout());
        game = new GameEngine(Main.deckMode);
        int DECK_SIZE = Main.DECK_SIZE;

        JTextField deck1Field = new JTextField(10);
        JTextField deck2Field = new JTextField(10);
        JButton confirmDecks = new JButton("Confirm");
        JLabel deck1Label = new JLabel("Enter deck for player 1");
        JLabel deck2Label = new JLabel("Enter deck for player 2");
        JPanel west = new JPanel();
        west.setLayout(new GridLayout(2, 0));
        west.add(deck1Label);
        west.add(deck1Field);
        add(west, BorderLayout.WEST);
        JPanel east = new JPanel();
        east.setLayout(new GridLayout(2, 0));
        east.add(deck2Label);
        east.add(deck2Field);
        add(east, BorderLayout.EAST);
        confirmDecks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] got_deck1 = deck1Field.getText().trim().split(" ");
                String[] got_deck2 = deck2Field.getText().trim().split(" ");
                if (got_deck1.length != 5 || got_deck2.length != 5) {
                    JOptionPane.showMessageDialog(null, "Deck size must be " +
                            DECK_SIZE);
                    return;
                }
                int[] deck1 = new int[DECK_SIZE];
                int[] deck2 = new int[DECK_SIZE];
                for (int i = 0; i < DECK_SIZE; i++) {
                    deck1[i] = Integer.parseInt(got_deck1[i]);
                    deck2[i] = Integer.parseInt(got_deck2[i]);
                }
                game.addDecks(deck1, deck2);

                deck1Field.setVisible(false);
                deck2Field.setVisible(false);
                confirmDecks.setVisible(false);
                deck1Label.setVisible(false);
                deck2Label.setVisible(false);
                decksConfirmedProceed();
            }
        });
        add(confirmDecks, BorderLayout.SOUTH);
    }

    private void decksConfirmedProceed() {
        Font cardFont = new Font("Times new roman", Font.BOLD, 250);
        JLabel info = new JLabel();
        info.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel card1 = new JLabel();
        JLabel card2 = new JLabel();
        card1.setFont(cardFont);
        card2.setFont(cardFont);
        card1.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        card2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        add(info, BorderLayout.NORTH);
        JPanel center = new JPanel();
        GridLayout gridLayout = new GridLayout(0, 2);
        gridLayout.setHgap(50);
        center.setLayout(gridLayout);
        center.add(card1);
        center.add(card2);
        add(center, BorderLayout.CENTER);
        JButton move = new JButton("Next move");
        move.addActionListener(new ActionListener() {
            int[] lastMove;
            @Override
            public void actionPerformed(ActionEvent e) {
                lastMove = game.nextMove();
                if (lastMove.length == 1) {
                    info.setText("Game over. Winner wasn't found in 105 moves");
                    move.setVisible(false);
                }
                if (lastMove[0] > 9999) {
                    info.setText("Second is winner! Game was ended in " + lastMove[0]/10000 + " moves");
                    move.setVisible(false);
                }
                else if (lastMove[0] > 9) {
                    info.setText("First is winner! Game was ended in " + lastMove[0]/10 + " moves");
                    move.setVisible(false);
                } else {
                    card1.setText(lastMove[1]+"");
                    card2.setText(lastMove[2]+"");
                    info.setText("Player " + lastMove[0] + " is round's winner");
                }
            }
        });
        add(move, BorderLayout.SOUTH);
    }
}
