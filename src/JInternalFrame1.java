/**
 * Created by dodo on 2017/4/25.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JInternalFrame1 extends JFrame implements ActionListener{

    JDesktopPane desktopPane;
    int count = 1;

    public JInternalFrame1(){
        super("lalala");
        Container cont = this.getContentPane();
        cont.setLayout(new BorderLayout());
        JButton b = new JButton("Create new");
        b.addActionListener(this);
        cont.add(b,BorderLayout.SOUTH);

        desktopPane = new JDesktopPane();
        cont.add(desktopPane);

        setSize(350,350);
        show();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        JInternalFrame internalFrame = new JInternalFrame("lalala"+(count++),true,true,true,true);
        internalFrame.setLocation(20,20);
        internalFrame.setSize(200,200);
        internalFrame.setVisible(true);

        Container icont = internalFrame.getContentPane();
        JTextArea textArea = new JTextArea();
        JButton b = new JButton("button");
        b.addActionListener(this);
        icont.add(textArea,"Center");
        icont.add(b,"South");

        desktopPane.add(internalFrame);

        try{
            internalFrame.setSelected(true);
        }catch (java.beans.PropertyVetoException ex){
            System.out.println("aaa");
        }
    }

    public static void main(String[] args){
        new JInternalFrame1();
    }
}
