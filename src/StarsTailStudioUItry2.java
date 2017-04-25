/**
 * Created by dodo on 2017/4/24.
 */
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;


    public class StarsTailStudioUItry2 implements ActionListener{

        JLabel ZTLl = null;
        String ZTLstring = "";
        JButton b1 = null,b2 = null,b3 = null;
        JFileChooser fileChooser = null;
        JLabel DKTXlabel = null;
        JFrame f = null;

        public StarsTailStudioUItry2(){

        JButton b;
        GridBagConstraints c;
        int gridx,gridy,gridwidth,gridheight,anchor,fill,ipadx,ipady;
        double weightx,weighty;
        Insets inset;

        f = new JFrame();

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
        b.addActionListener(this);
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
        b.addActionListener(this);
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

        ZTLl = new JLabel("状态栏");
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
        gridbag.setConstraints(ZTLl,c);
        contentpane.add(ZTLl);

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

    public void actionPerformed(ActionEvent e){
            if((e.getActionCommand()).equals("打开图像")){
               // JFrame DKTXf = new JFrame("打开图像");
               // DKTXf.setSize(800,800);
               // DKTXf.show();
                ZTLstring = ZTLstring + "打开图像";
                ZTLl.setText(ZTLstring);
                fileChooser = new JFileChooser("c:\\winnt");
                fileChooser.addChoosableFileFilter(new JAVAFileFilter("jpg"));
                fileChooser.addChoosableFileFilter(new JAVAFileFilter("tif"));
                int result = fileChooser.showOpenDialog(f);
                if(result == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    DKTXlabel.setText("你选择了："+file.getName()+"文件");
                }else if(result == fileChooser.CANCEL_OPTION){
                    DKTXlabel.setText("没有选取");
                }
                ZTLstring = ZTLstring + DKTXlabel;

             }
            if((e.getActionCommand()).equals("检测星点")) {
                ZTLstring = ZTLstring + "\n检测星点";
                ZTLl.setText(ZTLstring);
            }
             if((e.getActionCommand()).equals("计算位移")) {
                ZTLstring = ZTLstring + "计算位移";
                ZTLl.setText(ZTLstring);
             }
            if((e.getActionCommand()).equals("计算坏项")){
                ZTLstring = ZTLstring + "计算坏项";
                ZTLl.setText(ZTLstring);

            }

    }

    /*public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            ZTLstring = ZTLstring + "打开图像";
            ZTLl.setText(ZTLstring);
        }
        if(e.getSource()==b2){
            ZTLstring = ZTLstring + "检测星点";
            ZTLl.setText(ZTLstring);
        }
    }*/


        public static void main(String args[]){

            new StarsTailStudioUItry2();

        }
}

/*class JAVAFileFilter extends FileFilter{
    String ext;

    public JAVAFileFilter(String ext){
        this.ext = ext;
    }

    public boolean accept(File file){
        if(file.isDirectory())
            return true;

        String fileName = file.getName();
        int index = fileName.lastIndexOf('.');

        if(index>0 && index<fileName.length()-1){
            String extension = fileName.substring(index+1).toLowerCase();
            if(extension.equals(ext))
                return true;
        }
        return false;
    }

    public String getDescription(){
        if(ext.equals("jpg"))
            return "JPEG File (*.jpg)";
        if(ext.equals("tif"))
            return "TIFF File (*.tif)";
        return "";
    }
}*/

