import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class   GuiExExtra2 extends JFrame implements ActionListener {
    private int fuelLevel;
    private boolean engineRunning;
    private int speed;

    private JLabel fuelLabel;
    private JLabel speedLabel;
    private JButton startButton;
    private JButton stopButton;
    private JButton accelerateButton;
    private JButton brakeButton;
    private JButton refuelButton;

    public GuiExExtra2() {
        fuelLevel = 100;
        engineRunning = false;
        speed = 0;

        setTitle("Tractor Simulation");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        fuelLabel = new JLabel("Fuel Level: " + fuelLevel);
        speedLabel = new JLabel("Speed: " + speed);
        startButton = new JButton("Start Engine");
        stopButton = new JButton("Stop Engine");
        accelerateButton = new JButton("Accelerate");
        brakeButton = new JButton("Brake");
        refuelButton = new JButton("Refuel");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        accelerateButton.addActionListener(this);
        brakeButton.addActionListener(this);
        refuelButton.addActionListener(this);

        add(fuelLabel);
        add(speedLabel);
        add(startButton);
        add(stopButton);
        add(accelerateButton);
        add(brakeButton);
        add(refuelButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "Start Engine":
                if (!engineRunning) {
                    engineRunning = true;
                    updateLabels();
                }
                break;
            case "Stop Engine":
                if (engineRunning) {
                    engineRunning = false;
                    speed = 0;
                    updateLabels();
                }
                break;
            case "Accelerate":
                if (engineRunning) {
                    if (fuelLevel > 0) {
                        speed += 10;
                        fuelLevel -= 5;
                        updateLabels();
                    } else {
                        JOptionPane.showMessageDialog(this, "Out of fuel. Please refuel.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Engine is not running. Please start the engine first.");
                }
                break;
            case "Brake":
                if (engineRunning) {
                    if (speed > 0) {
                        speed -= 10;
                        updateLabels();
                    } else {
                        JOptionPane.showMessageDialog(this, "Tractor is already stationary.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Engine is not running. Please start the engine first.");
                }
                break;
            case "Refuel":
                if (!engineRunning) {
                    fuelLevel = 100;
                    updateLabels();
                } else {
                    JOptionPane.showMessageDialog(this, "Stop the engine before refueling.");
                }
                break;
        }
    }

    private void updateLabels() {
        fuelLabel.setText("Fuel Level: " + fuelLevel);
        speedLabel.setText("Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GuiExExtra2();
        });
    }
}
