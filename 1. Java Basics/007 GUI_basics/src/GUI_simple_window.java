import javax.swing.*;

public class GUI_simple_window {

    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("My Window");

        // Set the size of the window
        frame.setSize(400, 300);

        // Set the default close operation (exit the application when the window is closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}
