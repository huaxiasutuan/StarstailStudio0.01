/**
 * Created by dodo on 2017/4/24.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    public class StarsTailStudioUItry2 {

    public StarsTailStudioUItry2(){

        JButton b;
        GridBagConstraints c;
        int gridx,gridy,gridwidth,gridheight,anchor,fill,ipadx,ipady;
        double weightx,weighty;
        Insets inset;

        JFrame f = new JFrame();

        GridBagLayout gridbag = new GridBagLayout();
        Container contentpane = f.getContentPane();
        contentpane.setLayout(gridbag);

        int insettop = 30,insetleft = 30,insetbottom = 0,insetright = 30;


        b = new JButton("打开图像");
        gridx = 0;
        gridy = 0;
        gridwidth = 2;
        gridheight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insettop,insetleft,insetbottom,insetright);
        ipadx = 0;
        ipady = 0;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("检测星点");
        gridx = 0;
        gridy = 1;
        gridwidth = 2;
        gridheight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insettop,insetleft,insetbottom,insetright);
        ipadx = 0;
        ipady = 0;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("计算位移");
        gridx = 0;
        gridy = 2;
        gridwidth = 2;
        gridheight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insettop,insetleft,insetbottom,insetright);
        ipadx = 0;
        ipady = 0;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("计算坏项");
        gridx = 0;
        gridy = 3;
        gridwidth = 2;
        gridheight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insettop,insetleft,insetbottom,insetright);
        ipadx = 0;
        ipady = 0;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("补齐星轨");
        gridx = 0;
        gridy = 4;
        gridwidth = 2;
        gridheight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(60,insetleft,insetbottom,insetright);
        ipadx = 0;
        ipady = 0;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("去除抖动");
        gridx = 0;
        gridy = 5;
        gridwidth = 2;
        gridheight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insettop,insetleft,insetbottom,insetright);
        ipadx = 0;
        ipady = 0;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("去除坏项");
        gridx = 0;
        gridy = 6;
        gridwidth = 2;
        gridheight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insettop,insetleft,insetbottom,insetright);
        ipadx = 0;
        ipady = 0;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("延长星轨");
        gridx = 0;
        gridy = 7;
        gridwidth = 2;
        gridheight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insettop,insetleft,insetbottom,insetright);
        ipadx = 0;
        ipady = 0;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("图像区");
        gridx = 2;
        gridy = 0;
        gridwidth = 8;
        gridheight = 8;
        weightx = 1;
        weighty = 1;
        anchor = GridBagConstraints.CENTER;
        fill = GridBagConstraints.BOTH;
        inset = new Insets(insettop,insetleft,0,30);
        ipadx = 50;
        ipady = 50;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        b = new JButton("状态栏");
        gridx = 2;
        gridy = 8;
        gridwidth = 1;
        gridheight = 1;
        weightx = 1;
        weighty = 0.2;
        anchor = GridBagConstraints.CENTER;
        fill = GridBagConstraints.BOTH;
        inset = new Insets(insettop,insetleft,30,30);
        ipadx = 50;
        ipady = 50;
        c = new GridBagConstraints(gridx,gridy,gridwidth,gridheight,weightx,weighty,anchor,fill,inset,ipadx,ipady);
        gridbag.setConstraints(b,c);
        contentpane.add(b);

        f.setTitle("Starstail-Studio");
        f.setSize(new Dimension(1000,800));
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }


    public static void main(String args[]){

        new StarsTailStudioUItry2();

    }
}

