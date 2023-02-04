import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ShiftStudy extends JComponent implements KeyListener, ActionListener {
    static JFrame jFrame;
    static  int x = 0, y = 0, w = 100, h = 100, speed = 100;
    static Rectangle rectangle = new Rectangle(x ,y, w, h);
    Timer t = new Timer(5, this);
    public static void main(String[] args) {
        ShiftStudy shiftStudy = new ShiftStudy();
        jFrame = getFrame();
        jFrame.add(shiftStudy);
        jFrame.addKeyListener(shiftStudy);
        jFrame.add(new ShiftStudy());


    }


    @Override
    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.fill(rectangle);
        t.start();
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
        if (e.isShiftDown()) {
            speed = 200;
        }
        else {
            speed = 100;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (x < Toolkit.getDefaultToolkit().getScreenSize().width - 100) {
                rectangle.setLocation((int) (rectangle.getX() + speed), (int) rectangle.getY());
                x += speed;
            } else {
                rectangle.setLocation(0, (int) rectangle.getY());
                x = 0;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (y < Toolkit.getDefaultToolkit().getScreenSize().height - 200) {
                rectangle.setLocation((int) rectangle.getX(), (int) (rectangle.getY() + speed));
                y += speed;
            } else {
                rectangle.setLocation((int) rectangle.getX(), 0);
                y = 0;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (y >= 100) {
                rectangle.setLocation((int) rectangle.getX(), (int) (rectangle.getY() - speed));
                y -= speed;
            } else {
                rectangle.setLocation((int) rectangle.getX(), Toolkit.getDefaultToolkit().getScreenSize().height - speed);
                y = Toolkit.getDefaultToolkit().getScreenSize().height;
            }
            System.out.println(y);
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (x >= 200) {
                rectangle.setLocation((int) (rectangle.getX() - speed), (int) rectangle.getY());
                x -= speed;
            } else {
                rectangle.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-speed, (int) rectangle.getY());
                x = Toolkit.getDefaultToolkit().getScreenSize().width;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(x, y, dimension.width, dimension.height);
        return jFrame;
    }
}
