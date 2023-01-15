import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Svetofor {
    static JFrame jFrame;
    public static void main(String[] args) {
        jFrame = jFrame();
        jFrame.getContentPane().setBackground(Color.gray);
        jFrame.add(new MyComponent());
    }


    static class MyComponent extends JComponent {

        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            RoundRectangle2D roundRectangle2D = new RoundRectangle2D.Double(600, 100, 200, 600, 20, 20);
            g2.setColor(Color.BLACK);
            g2.fill(roundRectangle2D);
            ellipse(150, g2, Color.RED);
            ellipse(335, g2, Color.YELLOW);
            ellipse(525, g2, Color.green);
            area(120, g2);
            area(305, g2);
            area(495, g2);
            rect(150, g2);
            rect(335, g2);
            rect(525, g2);
            rect2(150, g2);
            rect2(335, g2);
            rect2(525, g2);
            RoundRectangle2D r2 = new RoundRectangle2D.Double(650, 710, 100, 80, 20, 20);
            g2.fill(r2);
            Arc2D arc2D = new Arc2D.Double(620, 50, 160, 80, 360, 180, Arc2D.CHORD);
            g2.fill(arc2D);
        }
    }

    static JFrame jFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(0, 0, dimension.width, dimension.height);

        return jFrame;
    }

    static void rect(int h, Graphics2D g2){
        int[] x1 = {440, 580, 580};
        int[] y1 = {h, h, h+125};
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        Polygon pol1 = new Polygon(x1, y1, 3);
        g2.fill(pol1);
        Line2D j1 = new Line2D.Double(445, h, 575, h);
        g2.draw(j1);
        Line2D j2 = new Line2D.Double(575, h+125, 445, h);
        g2.draw(j2);
    }

    static void rect2(int h, Graphics2D g2){
        int[] x1 = {820, 960, 820};
        int[] y1 = {h, h, h+125};
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        Polygon pol1 = new Polygon(x1, y1, 3);
        g2.fill(pol1);
        Line2D j1 = new Line2D.Double(825, h, 955, h);
        g2.draw(j1);
        Line2D j2 = new Line2D.Double(955, h, 825, h+125);
        g2.draw(j2);
    }
    static void area(int h, Graphics2D g2){
        g2.setColor(Color.WHITE);
        Area area = new Area(new Ellipse2D.Double(610, h, 180, 200));
        area.subtract(new Area(new Ellipse2D.Double(610, h+20, 180, 200)));
        g2.fill(area);
    }

    static void ellipse(int h, Graphics2D g2, Color color){
        Ellipse2D ell1 = new Ellipse2D.Double(625, h, 150, 150);
        g2.setColor(color);
        g2.fill(ell1);
    }
}
