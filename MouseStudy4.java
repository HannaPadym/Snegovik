package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseStudy4{
    static JFrame jFrame;
    static JPanel jPanel;
    public static void main(String[] args) {
        jFrame = getFrame();
        jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setFocusable(true);
        jPanel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_SPACE){
                    JOptionPane.showMessageDialog(jPanel, "Hanna");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame("Mouse4");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);
        return jFrame;
    }


}
