package practice.jdbc;

import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IndianFlag extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the flag rectangle with saffron color
        g.setColor(new Color(255, 153, 51)); // Saffron color
        g.fillRect(0, 0, getWidth(), getHeight());

        // Calculate the height of each stripe (3 equal stripes)
        int stripeHeight = getHeight() / 3;

        // Draw the white stripe
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), stripeHeight);

        // Draw the green stripe
        g.setColor(new Color(18, 136, 7)); // Green color
        g.fillRect(0, stripeHeight, getWidth(), stripeHeight);

        // Draw the Ashoka Chakra (wheel)
        int chakraDiameter = Math.min(getWidth(), getHeight()) / 2;
        int chakraX = (getWidth() - chakraDiameter) / 2;
        int chakraY = (getHeight() - chakraDiameter) / 2;
        g.setColor(Color.blue);
        g.fillArc(chakraX, chakraY, chakraDiameter, chakraDiameter, 0, 360);

        // Draw the 24 spokes of the Ashoka Chakra
        g.setColor(Color.WHITE);
        double angle = Math.toRadians(360 /70); // Angle between spokes
        int chakraCenterX = chakraX + chakraDiameter / 2;
        int chakraCenterY = chakraY + chakraDiameter / 2;
        int spokeLength = chakraDiameter / 2;

        for (int i = 0; i < 24; i++) {
            double x1 = chakraCenterX + spokeLength * Math.cos(i * angle);
            double y1 = chakraCenterY + spokeLength * Math.sin(i * angle);
            double x2 = chakraCenterX + (spokeLength - 20) * Math.cos(i * angle); // Reduce spoke length for the inner circle
            double y2 = chakraCenterY + (spokeLength - 20) * Math.sin(i * angle);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Indian Flag");
        IndianFlag flag = new IndianFlag();
        frame.add(flag);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
