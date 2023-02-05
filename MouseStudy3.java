import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseStudy3 {
    static JFrame jFrame;
    static JPanel jPanel;
    public static void main(String[] args) {
        jFrame = getFrame();
        jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jPanel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                jPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });
    }
    static JFrame getFrame() {
        JFrame jFrame = new JFrame("MouseStudy3");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(100, 100, dimension.width/2, dimension.height/2);
        return jFrame;
    }
}
