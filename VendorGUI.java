package apcsa-vehicle-vendor;

import javax.swing.*;
import java.awt.*;

public class VendorGUI extends JPanel {
    // declare variables
    private int x = 400;
    private int y = 200;
    private final int DIAMETER = 50;
    private int dx = 5;
    private int dy = 4;

    // constructor
    public VendorGUI()
    {
        setBackground(Color.darkGray);

        // set up timer
        Timer timer = new Timer(16, e -> updatePhysics());
        timer.start();
    }

    private void updatePhysics()
    {
        x += dx;
        y += dy;

        // handle collisions
        if (x <= 0 || x +DIAMETER >= getWidth())
        {
            dx = -dx;
        }

        if (y <= 0 || y +DIAMETER >= getHeight())
        {
            dy = -dy;
        }

        repaint();
    }

    @Override 
    protected void paintComponent(Graphics g)
    {
        // clear canvas
        super.paintComponent(g);

        // create circle
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        // customize circle
        g2.setColor(Color.PINK);
        g2.fillOval(x,y,DIAMETER,DIAMETER);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()-> {
            JFrame frame = new JFrame("Vendor GUI");
            VendorGUI panel = new VendorGUI();

            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
