package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.BOLD;

public class Window extends JFrame {
    String TEAM1 = "AC Milan";
    String TEAM2 = "Real Madrid";

    private int score1 = 0;
    private int score2 = 0;
    private int just_another_score = 0;

    private final JLabel result;
    private final JLabel last_scorer;
    private final JLabel winner;

    Window() {
        setSize(150, 300);
        setLayout(new FlowLayout());
        JButton button1 = new JButton(TEAM1);
        JButton button2 = new JButton(TEAM2);

        ActionListener scoreButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chosen_team = ((JButton)e.getSource()).getText();
                if (chosen_team.equals(TEAM1)) {
                    score1++;
                } else {
                    score2++;
                }
                updateLastScorer(chosen_team);
                updateResult();
                updateWinner();
            }
        };

        button1.addActionListener(scoreButtonListener);
        button2.addActionListener(scoreButtonListener);
        add(button1);
        add(button2);

        winner  = new JLabel("Winner: DRAW");
        last_scorer  = new JLabel("Last Scorer: N/A");
        result  = new JLabel("Result: 0 X 0");
        add(result);
        add(last_scorer);
        add(winner);
    }

    private void updateLastScorer(String team) {
        last_scorer.setText("Last Scorer: " + team);
    }

    private void updateResult() {
        result.setText("Result: " + Math.max(score1, score2) +
                " X " + Math.min(score1, score2));
    }

    private void updateWinner() {
        if (score1==score2) {
            winner.setText("Winner: DRAW");
        }
        else if (score1 > score2) {
            winner.setText("Winner: " + TEAM1);
        } else {
            winner.setText("Winner: " + TEAM2);
        }
    }
}
