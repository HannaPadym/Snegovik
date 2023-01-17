import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Snegovik {
    static JFrame jFrame;

    public static void main(String[] args) {
        jFrame = getFrame();
        jFrame.getContentPane().setBackground(Color.WHITE);
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
            g2.setColor(Color.BLACK);
            drawEllipse(600, 400, 250, 200, g2);
            drawEllipse(625, 300, 200, 150, g2);
            fillEllipse(630, 300, 190, 150, g2);
            drawEllipse(650, 200, 150, 125, g2);
            fillEllipse(655, 205, 140, 120, g2);
            drawEllipse(640, 180, 170, 30, g2);
            fillEllipse(645, 185, 160, 25, g2);
            RoundRectangle2D roundRectangle2D = new RoundRectangle2D.Double(675, 115, 100, 70, 20, 20);
            g2.setColor(Color.BLACK);
            g2.draw(roundRectangle2D);
            RoundRectangle2D roundRectangle2D2 = new RoundRectangle2D.Double(680, 120, 80, 60, 20, 20);
            g2.setColor(Color.WHITE);
            g2.fill(roundRectangle2D);
            g2.setColor(Color.BLACK);
            Line2D line2D = new Line2D.Double(675, 170, 775, 170);
            g2.draw(line2D);
            drawEllipse(710, 235, 10, 10, g2);
            drawEllipse(745, 295, 10, 10, g2);
            drawEllipse(755, 235, 10, 10, g2);
            drawEllipse(765, 285, 10, 10, g2);
            drawEllipse(725, 295, 10, 10, g2);
            drawEllipse(705, 285, 10, 10, g2);
            drawEllipse(735, 410, 10, 10, g2);
            drawEllipse(735, 340, 10, 10, g2);
            drawEllipse(735, 375, 10, 10, g2);
            int[] x = {740, 840, 745};
            int[] y = {260, 260, 275};
            Polygon polygon = new Polygon(x,y, 3);
            g2.setStroke(new BasicStroke(3f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
            g2.draw(polygon);
            Polygon polygon2 = new Polygon(x,y, 3);
            g2.setColor(Color.WHITE);
            g2.fill(polygon2);
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
            GeneralPath generalPath1 = new GeneralPath();
            generalPath1.moveTo(650, 375);
            generalPath1.lineTo(510, 345);
            generalPath1.lineTo(490, 355);
            generalPath1.lineTo(485, 350);
            generalPath1.lineTo(505, 340);
            generalPath1.lineTo(480, 340);
            generalPath1.lineTo(475, 335);
            generalPath1.lineTo(510, 330);
            generalPath1.lineTo(485, 315);
            generalPath1.lineTo(490, 310);
            generalPath1.lineTo(525, 330);
            generalPath1.lineTo(650, 365);
            generalPath1.lineTo(650, 375);
            g2.draw(generalPath1);
            g2.setColor(Color.WHITE);
            g2.fill(generalPath1);
            g2.setColor(Color.BLACK);
            GeneralPath generalPath2 = new GeneralPath();
            generalPath2.moveTo(825, 375);
            generalPath2.lineTo(950, 345);
            generalPath2.lineTo(970, 365);
            generalPath2.lineTo(975, 360);
            generalPath2.lineTo(960, 340);
            generalPath2.lineTo(980, 340);
            generalPath2.lineTo(985, 335);
            generalPath2.lineTo(955, 335);
            generalPath2.lineTo(975, 315);
            generalPath2.lineTo(965, 315);
            generalPath2.lineTo(950, 335);
            generalPath2.lineTo(825, 365);
            g2.draw(generalPath2);
            g2.setColor(Color.WHITE);
            g2.fill(generalPath2);


        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);
        return jFrame;
    }


   static void drawEllipse(int x, int y, int w, int h, Graphics2D g2){
        Ellipse2D ellipse2D = new Ellipse2D.Double(x, y, w, h);
        g2.setColor(Color.BLACK);
        g2.draw(ellipse2D);
   }
   static void fillEllipse(int x, int y, int w, int h, Graphics2D g2){
        g2.setColor(Color.WHITE);
        Ellipse2D ellipse2D = new Ellipse2D.Double(x, y, w, h);
        g2.fill(ellipse2D);
   }
}
