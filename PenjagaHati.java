import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Bunga extends PenjagaHati {

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Aktifkan anti-aliasing untuk menghasilkan gambar yang lebih halus
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Menggambar kelopak bunga (lingkaran)
        g2d.setColor(Color.RED);
        g2d.fillOval(50, 50, 100, 100);

        // Menggambar tangkai bunga (garis)
        g2d.setColor(Color.GREEN);
        g2d.drawLine(100, 150, 100, 250);

        // Menggambar daun bunga (sepasang oval)
        g2d.setColor(Color.GREEN);
        g2d.fillOval(30, 200, 40, 80);
        g2d.fillOval(110, 200, 40, 80);
    }
}

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bunga Java");
        Bunga bunga = new Bunga();
        frame.add(bunga);
        frame.setSize(250, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
