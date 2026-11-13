import java.awt.*;
import java.time.LocalTime;
import javax.swing.*;

public class CagatanA {

    private static String getGreeting() {
        int hour = LocalTime.now().getHour();

        if (hour >= 6 && hour <= 11) {
            return "Good Morning";
        } else if (hour >= 12 && hour <= 17) {
            return "Good Afternoon";
        } else if (hour >= 18 && hour <= 23) {
            return "Good Evening";
        } else {
            return "Have a Wonderful Midnight";
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Greeting Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());

        JLabel name = new JLabel("Enter Your Name:");
        frame.add(name);
        JTextField namefield = new JTextField(20);
        frame.add(namefield);
        JButton greetme = new JButton("Greet Me");
        frame.add(greetme);

        greetme.addActionListener(e -> {
            String userName = namefield.getText();
            if (!userName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, getGreeting() + ", " + userName + "!");
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter your name.");
            }
        });

        frame.setVisible(true);
    }
}