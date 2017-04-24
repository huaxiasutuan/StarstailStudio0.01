/**
 * Created by dodo on 2017/4/24.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyDemo extends KeyAdapter implements ActionListener{

    JFrame f = null;
    JLabel label = null;
    JTextField tField = null;
    String keyString = "";

    public KeyDemo(){

        f = new JFrame("Key");
        Container cont = f.getContentPane();
        cont.setLayout(new GridLayout(3,1));
        label = new JLabel();
        tField = new JTextField();
        tField.requestFocus();
        tField.addKeyListener(this);
        JButton b = new JButton("clear");
        b.addActionListener(this);
        cont.add(label);
        cont.add(tField);
        cont.add(b);
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        keyString = "";
        label.setText("");
        tField.setText("");
        tField.requestFocus();
    }

    public void keyTyped(KeyEvent e){
        char c = e.getKeyChar();
        if(c=='o'){
            JFrame newf = new JFrame("new");
            newf.setSize(200,200);
            newf.show();
        }
        keyString = keyString + c;
        label.setText(keyString);
    }

    public static void main(String args[]){
        new KeyDemo();
    }

}
