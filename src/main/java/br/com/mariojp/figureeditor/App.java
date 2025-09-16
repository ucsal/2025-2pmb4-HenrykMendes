package br.com.mariojp.figureeditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            JFrame frame = new JFrame("Figure Editor — Clique para inserir figuras");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            DrawingPanel panel = new DrawingPanel();
            JButton circleButton = new JButton("Circulo");
            JButton rectangleButton = new JButton("Retângulo");

            circleButton.addActionListener((ActionEvent e) -> {
                panel.setInterfaceFactory(new BallFactory());
                frame.setTitle("Figure — Modo: Círculos");
            });
            rectangleButton.addActionListener((ActionEvent e) -> {
                panel.setInterfaceFactory(new RectangleFactory());
                frame.setTitle("Figure — Modo: Retângulos");
            });

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(circleButton);
            buttonPanel.add(rectangleButton);

            frame.setLayout(new BorderLayout());
            frame.add(buttonPanel, BorderLayout.NORTH);
            frame.add(panel, BorderLayout.CENTER);

            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
