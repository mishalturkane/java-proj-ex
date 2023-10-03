package projtopic.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiExExtra extends JPanel implements ActionListener {
    private int birdX = 50; // Initial X-coordinate of the bird
    private int birdY = 200; // Initial Y-coordinate of the bird
    private Timer timer;

    public GuiExExtra() {
        timer = new Timer(20, this); // Timer for animation
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the bird's position
        birdX += 2; // Adjust this value to control the bird's horizontal speed
        birdY += Math.sin(birdX * 0.1) * 10; // Simulate bird flapping up and down

        repaint(); // Request a repaint to update the bird's position
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBird(g);
    }

    private void drawBird(Graphics g) {
        g.setColor(Color.PINK);
        g.fillOval(birdX, birdY, 30, 20); // Bird body
        g.setColor(Color.YELLOW);
        g.fillOval(birdX + 25, birdY - 5, 10, 10); // Bird eye
        g.setColor(Color.RED);
        g.drawLine(birdX + 5, birdY + 10, birdX + 25, birdY + 10); // Bird beak
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flying Bird");
        GuiExExtra bird = new GuiExExtra(); // Create an instance of GuiExExtra
        frame.add(bird);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
