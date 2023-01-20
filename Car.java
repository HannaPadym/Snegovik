import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Car {
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
            GeneralPath generalPath = new GeneralPath();
            generalPath.moveTo(400, 300);
            generalPath.quadTo(650, 50, 900, 300);
            generalPath.quadTo(1200, 350, 1125, 500);
            generalPath.quadTo(1150, 525, 1100, 550);
            generalPath.lineTo(1000, 550);
            generalPath.quadTo(900, 350,800, 550);
            generalPath.lineTo(600, 550);
            generalPath.quadTo(500,350,400, 550);
            generalPath.lineTo(300, 550);
            generalPath.quadTo(250,525,300, 475);
            generalPath.quadTo(310,375,400,300);
            Color(generalPath, g2);
            GeneralPath gp2 = new GeneralPath();
            gp2.moveTo(625, 200);
            gp2.lineTo(625, 300);
            gp2.lineTo(475, 300);
            gp2.quadTo(475,225,625, 200);
            ColorWhite(gp2, g2);
            GeneralPath gp3 = new GeneralPath();
            gp3.moveTo(650, 200);
            gp3.lineTo(650, 300);
            gp3.lineTo(850, 300);
            gp3.quadTo(800,225, 650, 200);
            ColorWhite(gp3, g2);
            GeneralPath gp4 = new GeneralPath();
            gp4.moveTo(1050, 375);
            gp4.quadTo(1100,375,1100, 425);
            gp4.quadTo(1050,425,1050, 375);
            ColorWhite(gp4, g2);

            g2.setColor(Color.BLACK);
            Line2D line2D = new Line2D.Double(670, 350, 750, 350);
            g2.draw(line2D);


            Koleso(800, 455, g2);
            Koleso(400, 455, g2);
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

    static void Color(Shape o, Graphics2D g2){
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        g2.draw(o);
        g2.setColor(Color.YELLOW);
        g2.fill(o);
    }
    static void Ellipse(int x, int y, Graphics2D g2, Color color){

        Ellipse2D ellipse2D = new Ellipse2D.Double(x, y, 170, 170);
        g2.setColor(color);
        g2.fill(ellipse2D);
    };

    static void Koleso(int x, int y, Graphics2D g2) {
        Ellipse2D ellipse2D = new Ellipse2D.Double(x, y, 200, 200);
        g2.setColor(Color.WHITE);
        g2.fill(ellipse2D);
        Ellipse(x+15, y+15, g2, Color.BLACK);
        Arc2D arc2D = new Arc2D.Double(x, y-5, 200, 200, 360, 180, Arc2D.OPEN);
        g2.draw(arc2D);
        Ellipse2D ellipse2D1 = new Ellipse2D.Double(x + 50, y +50, 100, 100);
        g2.setColor(Color.WHITE);
        g2.fill(ellipse2D1);
    }

    static void ColorWhite(Shape o, Graphics2D g2){
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        g2.draw(o);
        g2.setColor(Color.WHITE);
        g2.fill(o);
    }


}
