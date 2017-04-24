/**
 * Created by dodo on 2017/4/20.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StarTailStudioUI extends WindowAdapter implements ActionListener{

    public StarTailStudioUI(){

        JFrame f = new JFrame();
        Container ContentPane = f.getContentPane();
        Box UIBox = Box.createHorizontalBox();
        ContentPane.add(UIBox);

        UIBox.add(Box.createHorizontalStrut(50));

        Box v1 = Box.createVerticalBox();
        v1.add(Box.createVerticalStrut(50));
        v1.add(new JButton("打开图像"));
        v1.add(Box.createVerticalStrut(50));
        v1.add(new JButton("检测星点"));
        v1.add(Box.createVerticalStrut(50));
        v1.add(new JButton("计算位移"));
        v1.add(Box.createVerticalStrut(50));
        v1.add(new JButton("计算坏项"));
        v1.add(Box.createVerticalStrut(200));
        v1.add(new JButton("补齐星轨"));
        v1.add(Box.createVerticalStrut(50));
        v1.add(new JButton("去除抖动"));
        v1.add(Box.createVerticalStrut(50));
        v1.add(new JButton("去除坏项"));
        v1.add(Box.createVerticalStrut(50));
        v1.add(new JButton("延长星轨"));
        UIBox.add(v1);

        UIBox.add(Box.createHorizontalStrut(50));

        Box v2 = Box.createVerticalBox();
        v2.add(Box.createVerticalStrut(50));
        JButton b = new JButton("图像");
        b.setMinimumSize(new Dimension(500,500));
        b.setMaximumSize(new Dimension(1000,1000));
        v2.add(b);
        v2.add(Box.createVerticalStrut(50));
        v2.add(new JButton("状态栏"));
        UIBox.add(v2);



        f.setTitle("StarstailStudio");
        f.pack();
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }



    public static void main(String args[]){

        StarTailStudioUI b =new StarTailStudioUI();
    }
}
