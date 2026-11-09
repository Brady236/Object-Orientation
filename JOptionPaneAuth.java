import javax.swing.JOptionPane;

public class JOptionPaneAuth {
    public static void main(String[] args) {
        
        String username = JOptionPane.showInputDialog(null, "Enter username:");
        String password = JOptionPane.showInputDialog(null, "Enter password:");

        
        if (username != null && password != null && username.equals("Hero") && password.equals("Zero")) {
            JOptionPane.showMessageDialog(null, "Access Granted");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Credentials");
        }
    }
}