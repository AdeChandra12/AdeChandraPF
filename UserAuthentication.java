import javax.swing.JOptionPane;

public class UserAuthentication {
    public static void main(String[] args) {
        
        String username = JOptionPane.showInputDialog("Masukkan username:");
        String password = JOptionPane.showInputDialog("Masukkan password:");

        if (password != null &&
            ((username.equals("AdeChandra") && password.equals("AdeChandra")) ||
             (username.equals("suskauin") && password.equals("uinsuska")))) {
            
            JOptionPane.showMessageDialog(null, "Anda berhasil masuk.");
        } else {
            
            JOptionPane.showMessageDialog(null, "Anda mencurigakan.");
        }
    }
}
