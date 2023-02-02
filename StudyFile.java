import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class StudyFile {
    static JFrame jFrame;
    static JPanel jPanel;
    static JButton jButton;

    public static void main(String[] args) throws IOException {
        jFrame = getFrame();
        jButton = new JButton("Ввести текст");
        jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.add(jButton);
        FileWriter file = new FileWriter("C:\\Users\\hanna\\Desktop\\Отчет 2022.txt", true);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = JOptionPane.showInputDialog(jPanel, "Введите текст для записи в файл", "Окно ввода", JOptionPane.INFORMATION_MESSAGE);
                try {
                    file.append(x).append(String.valueOf('\n'));
                    file.flush();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jPanel.revalidate();
    }


    static JFrame getFrame() {
        JFrame jFrame = new JFrame("StudyFile");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100, 100, 500, 500);
        return jFrame;
    }

}
