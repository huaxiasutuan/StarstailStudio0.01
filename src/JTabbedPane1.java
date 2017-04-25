/**
 * Created by dodo on 2017/4/25.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTabbedPane1 {
    public JTabbedPane1(){
        JFrame f = new JFrame("lalla");
        Container cont = f.getContentPane();

        JLabel label1 = new JLabel(new ImageIcon(".\\picture\\Starstailmid100.jpg"));
        JPanel panel1 = new JPanel();
        panel1.add(label1);

        JLabel label2 = new JLabel("2",JLabel.CENTER);
        label2.setBackground(Color.YELLOW);
        label2.setOpaque(true);
        JPanel panel2 = new JPanel();
        panel2.add(label2);

        JLabel label3 = new JLabel("3",JLabel.CENTER);
        label3.setBackground(Color.yellow);
        label3.setOpaque(true);
        JPanel panel3 = new JPanel();
        panel3.add(label3);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
        tabbedPane.addTab("picture",new ImageIcon(".\\picmini\\Starstailsmall100.jpg"),panel1,"tuan");
        tabbedPane.addTab("L2",panel2);
        tabbedPane.addTab("L3",null,panel3,"label");

        cont.add(tabbedPane);

        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] arg){
        new JTabbedPane1();

    }
}
