/**
 * Created by dodo on 2017/4/25.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLayoutPane1 extends JFrame{

    public JLayoutPane1(){

        super("lalala");
        Integer[] layerConstants = {new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5),new Integer(6),new Integer(7)};

        Color[] colors = {Color.red,Color.blue,Color.magenta,Color.cyan,Color.yellow,Color.green,Color.pink};

        Point position = new Point(10,10);
        JLabel[] label = new JLabel[7];
        JLayeredPane layeredPane = getLayeredPane();

        for(int i = 0 ; i < 7 ; i++){
            label[i] = createLabel("第"+(i+1)+"层",colors[i],position);
            position.x = position.x + 20;
            position.y = position.y + 20;
            layeredPane.add(label[i],new Integer(i+1));
        }
        setSize(new Dimension(280,280));
        show();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public JLabel createLabel(String content,Color color,Point position){
        JLabel label = new JLabel(content,JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBackground(color);
        label.setForeground(Color.black);
        label.setOpaque(true);
        label.setBounds(position.x,position.y,100,100);
        return label;
    }

    public static void main(String args[]){
        new JLayoutPane1();
    }
}
