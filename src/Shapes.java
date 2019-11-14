import java.awt.*;
import javax.swing.*;
import com.stanevich.shapes.*;
public class Shapes
    {
    public static void main (String [] args)
        {
        JFrame jf = new JFrame("For2D");
        jf.setSize(250,200);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(new Board());
        }
    }
    class Board extends JPanel
    {
        private void draw1(Graphics g)
        {
            Graphics2D g2d = (Graphics2D)g;
            g2d.setPaint(Color.blue);
            int w = getWidth();
            int h = getHeight();
            g2d.drawLine(0,0,w,h);
            g2d.drawOval(w/2-50,h/2-50,100,100);
        }
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            draw1(g);
        }
    }

/*
import java.util.Scanner;
public class Work1 {

    public static void isPointInCircle(int r,int x,int y) {
        if (Math.abs(x) <= r && Math.abs(y) <= r) {
            System.out.println("yes,");
        } else {
            System.out.println("no,");
        }
    }
        public static void isPointAtIntersection(int x,int y){
            if (x == 0) {
                if (y>0)
                    System.out.println("пересечение I,II четверти");
                if (y<0)
                    System.out.println("пересечение III,IV четверти");
                if (y==0)
                    System.out.println("Точка находися в начале координат");}
            if (y == 0) {
                if (x>0)
                    System.out.println("пересечение I,IV четверти");
                if (x<0)
                    System.out.println("пересечение II,III четверти");}

        }

        public static void isPointInAQuarter(int x,int y) {
            if (x > 0 && y > 0) {
                System.out.println("I");
            } else if (x < 0 && y > 0) {
                System.out.println("II");
            } else if (x < 0 && y < 0) {
                System.out.println("III");
            }
            else if (x > 0 && y < 0) {
                System.out.println("IV");
            }
            }

    public static void main(String[] args) {
        Scanner inputFigure = new Scanner(System.in);
        System.out.print("Введите радиус R=");
        int r = inputFigure.nextInt();
        System.out.print("Введите координату х=");
        int x = inputFigure.nextInt();
        System.out.print("Введите координату y=");
        int y = inputFigure.nextInt();
        isPointInCircle(r,x,y);
        isPointAtIntersection(x,y);
        isPointInAQuarter(x,y);
    }
}

 */