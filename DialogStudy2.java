import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DialogStudy2 {
    static JFrame jFrame;
    static JPanel jPanel;
    public static void main(String[] args) {
        jFrame = getFrame();
        jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setFocusable(true);
        jPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE){
                    int x = JOptionPane.showConfirmDialog(jPanel, "Любишь виски?", "окно 1", JOptionPane.YES_NO_OPTION);
                    System.out.println(x);
                    if (x==0){
                        JOptionPane.showMessageDialog(jPanel, "Вы ответили - да");
                    } else {
                        JOptionPane.showMessageDialog(jPanel, "Эххх");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    int x = JOptionPane.showConfirmDialog(jPanel, "Любишь пиво?", "окно 1", JOptionPane.YES_NO_OPTION);
                    System.out.println(x);
                    if (x==0){
                        JOptionPane.showMessageDialog(jPanel, "Вы ответили - да");
                    } else {
                        JOptionPane.showMessageDialog(jPanel, "Эххх");
                    }
                }
            }
        });
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame("DialogStudy");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(0,0, dimension.width, dimension.height);
        return jFrame;
    }
}
