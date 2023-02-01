import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Strelki2 extends JComponent implements ActionListener, KeyListener {
    static JLabel jLabel;
    static ImageIcon image = new ImageIcon("img.png");
    static int x = 0, y = 0, w = 200, h = 200;

    public static void main(String[] args) {
        Strelki2 strelki2 = new Strelki2();
        JFrame jFrame = new JFrame("Str2");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);
        jLabel = new JLabel(new ImageIcon(image.getImage()));
        jLabel.setBounds(x, y, w, h);
        jFrame.add(jLabel);
        jFrame.add(strelki2);
        jFrame.addKeyListener(strelki2);
        jFrame.add(new Strelki2());
        jFrame.setLayout(null);

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (x < Toolkit.getDefaultToolkit().getScreenSize().width - 200) {
                jLabel.setLocation(jLabel.getX() + 200, jLabel.getY());
                x += 200;
            } else {
                jLabel.setLocation(0, jLabel.getY());
                x = 0;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (y < Toolkit.getDefaultToolkit().getScreenSize().height - 400) {
                jLabel.setLocation(jLabel.getX(), jLabel.getY() + 200);
                y += 200;
            } else {
                jLabel.setLocation(jLabel.getX(), 0);
                y = 0;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (y >= 200) {
                jLabel.setLocation(jLabel.getX(), jLabel.getY() - 200);
                y -= 200;
            } else {
                jLabel.setLocation(jLabel.getX(), Toolkit.getDefaultToolkit().getScreenSize().height - 200);
                y = Toolkit.getDefaultToolkit().getScreenSize().height;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (x >= 200) {
                jLabel.setLocation(jLabel.getX() - 200, jLabel.getY());
                x -= 200;
            } else {
                jLabel.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-200, jLabel.getY());
                x = Toolkit.getDefaultToolkit().getScreenSize().width;
            }
        }
        if (x <= Toolkit.getDefaultToolkit().getScreenSize().width - 200 && y < Toolkit.getDefaultToolkit().getScreenSize().height - 400) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT && e.getKeyCode() == KeyEvent.VK_DOWN) {
                jLabel.setLocation(jLabel.getX() + 200, jLabel.getY() + 200);
                x += 200;
                y += 200;
            }
        }
        if (x <= Toolkit.getDefaultToolkit().getScreenSize().width - 200 && y >= 200) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT && e.getKeyCode() == KeyEvent.VK_UP) {
                jLabel.setLocation(jLabel.getX() + 200, jLabel.getY() - 200);
                x += 200;
                y -= 200;
            }
        }
        if (x >= 200 && y < Toolkit.getDefaultToolkit().getScreenSize().height - 400) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT && e.getKeyCode() == KeyEvent.VK_DOWN) {
                jLabel.setLocation(jLabel.getX() - 200, jLabel.getY() + 200);
                x -= 200;
                y += 200;
            }
        }
        if (x >= 200 && y >= 200) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT && e.getKeyCode() == KeyEvent.VK_UP) {
                jLabel.setLocation(jLabel.getX() - 200, jLabel.getY() - 200);
                x -= 200;
                y -= 200;
            }
            
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

