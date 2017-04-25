import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * Created by dodo on 2017/4/25.
 */
public class FileFilterDemo implements ActionListener{
    JFrame f = null;
    JLabel label = null;
    JFileChooser fileChooser = null;

    public FileFilterDemo(){
        f = new JFrame("lalala");
        Container cont = f.getContentPane();

        JButton b = new JButton("打开图像");
        b.addActionListener(this);

        label = new JLabel("",JLabel.CENTER);
        label.setPreferredSize(new Dimension(150,30));
        cont.add(label,BorderLayout.CENTER);
        cont.add(b,BorderLayout.SOUTH);

        f.pack();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        new FileFilterDemo();
    }

    public void actionPerformed(ActionEvent e){
        fileChooser = new JFileChooser("c:\\winnt");
        fileChooser.addChoosableFileFilter(new JAVAFileFilter("jpg"));
        fileChooser.addChoosableFileFilter(new JAVAFileFilter("tif"));
        int result = fileChooser.showOpenDialog(f);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            label.setText("你选择了："+file.getName()+"文件");
        }else if(result == fileChooser.CANCEL_OPTION){
            label.setText("没有选取");
        }
    }
}

class JAVAFileFilter extends FileFilter{
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
}
