
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Strelki extends JComponent implements ActionListener, KeyListener {
    static int x = 150;
    static int y = 150;
    static int r = 0;
    static int l = 0;
    static JLabel jLabel;
    static ImageIcon image = new ImageIcon("img.png");

    public static void main(String[] args) {
        Strelki s = new Strelki();
        JFrame jFrame = new JFrame("Hate");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);
        jFrame.addKeyListener(s);
        jFrame.add(s);
        jFrame.add(new Strelki());
        jLabel = new JLabel(new ImageIcon(image.getImage()));
        jLabel.setBounds(r, l, x, y);
        jFrame.add(jLabel);
        jFrame.setLayout(null);


    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (r < Toolkit.getDefaultToolkit().getScreenSize().width - 180) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                jLabel.setLocation(jLabel.getX() + 100, jLabel.getY());
                r += 100;
            }
        }
        if (l < Toolkit.getDefaultToolkit().getScreenSize().height - 200) {
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                jLabel.setLocation(jLabel.getX(), jLabel.getY() + 100);
                l += 100;
            }
        }
        if (l >= 100) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                jLabel.setLocation(jLabel.getX(), jLabel.getY() - 100);
                l -= 100;
            }
        }
        if (r >= 100) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                jLabel.setLocation(jLabel.getX() - 100, jLabel.getY());
                r -= 100;
            }
        }
        if (r < Toolkit.getDefaultToolkit().getScreenSize().width - 180 && l < Toolkit.getDefaultToolkit().getScreenSize().height - 200) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT && e.getKeyCode() == KeyEvent.VK_DOWN) {
                jLabel.setLocation(jLabel.getX() + 100, jLabel.getY() + 100);
                r += 100;
                l += 100;
            }
        }
        if (r < Toolkit.getDefaultToolkit().getScreenSize().width - 180 && l >= 100) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT && e.getKeyCode() == KeyEvent.VK_UP) {
                jLabel.setLocation(jLabel.getX() + 100, jLabel.getY() - 100);
                r += 100;
                l -= 100;
            }
        }
        if (r >= 100 && l < Toolkit.getDefaultToolkit().getScreenSize().height - 200){
            if (e.getKeyCode()==KeyEvent.VK_LEFT && e.getKeyCode() == KeyEvent.VK_DOWN){
                jLabel.setLocation(jLabel.getX()-100, jLabel.getY()+100);
                r-=100;
                l+=100;
            }
        }
        if (r >= 100 && l>=100){
            if (e.getKeyCode()==KeyEvent.VK_LEFT && e.getKeyCode()==KeyEvent.VK_UP){
                jLabel.setLocation(jLabel.getX()-100, jLabel.getY()-100);
                r-=100;
                l-=100;
            }

        }
    }
}

