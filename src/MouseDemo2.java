/**
 * Created by dodo on 2017/4/24.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseDemo2 extends MouseAdapter{

    JFrame f = null;
    JButton b1 = null;
    JLabel label = null;

    public MouseDemo2(){
        f = new JFrame("lalala");
        Container cont = f.getContentPane();
        cont.setLayout(new GridLayout(2,1));
        b1 = new JButton("111");
        label = new JLabel("222",JLabel.CENTER);
        b1.addMouseListener(this);
        cont.add(b1);
        cont.add(label);
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public void mousePressed(MouseEvent e){
        label.setText("坐标为：("+e.getX()+","+e.getY()+")");
    }

    public void mouseClicked(MouseEvent e){
        if(e.getClickCount()==2){
            JFrame newf = new JFrame("新窗口");
            newf.setSize(1000,1000);
            newf.show();
        }
    }
    public static void main(String args[]){
        new MouseDemo2();

    }
}
