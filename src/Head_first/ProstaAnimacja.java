package Head_first;

import javax.swing.*;
import java.awt.*;

public class ProstaAnimacja {

    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        ProstaAnimacja animacja = new ProstaAnimacja();
        animacja.start();
    }

    public void start(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelDoAnimacji panel = new PanelDoAnimacji();

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i =0; i<130; i++){
            x++;
            y++;
            panel.repaint();

            try {
                Thread.sleep(50);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

        }

    }

    class PanelDoAnimacji extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0, this.getWidth(), this.getHeight());

            g.setColor(Color.orange);
            g.fillOval(x, y,40,40);
        }
    }
}
