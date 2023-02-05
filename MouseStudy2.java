import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseStudy2 {
    static JFrame jFrame;
    static JLayeredPane jLayeredPane;

    public static void main(String[] args) {
        jFrame = getFrame();
        jLayeredPane = new JLayeredPane();
        jFrame.add(jLayeredPane);

        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == 1) {
                    JLabel jLabel = new JLabel("X: " + e.getX() + ", Y: " + e.getY());
                    jLabel.setBounds(e.getX(), e.getY(), 100, 20);
                    jLayeredPane.add(jLabel);
                    jLabel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (e.getButton() == 2) {
                                jLayeredPane.remove((JLabel) e.getSource());
                                jLayeredPane.repaint();
                            }
                        }
                    });
                }
            }
        });
    }


    static JFrame getFrame() {
                JFrame jFrame = new JFrame("MouseStudy2");
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension dimension = toolkit.getScreenSize();
                jFrame.setBounds(0, 0, dimension.width, dimension.height);
                return jFrame;
            }
}
