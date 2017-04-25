import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by dodo on 2017/4/25.
 */
public class JTabbedPane2 implements ActionListener,ChangeListener{
    int index = 0;
    int newNumber = 1;
    JTabbedPane tabbedPane = null;

    public JTabbedPane2(){
        JFrame f = new JFrame("lalla");
        Container cont = f.getContentPane();

        JLabel label1 = new JLabel(new ImageIcon(".\\picture\\Starstailmid100.jpg"));
        JPanel panel1 = new JPanel();
        panel1.add(label1);

        JLabel label2 = new JLabel("La2",JLabel.CENTER);
        label2.setBackground(Color.yellow);
        label2.setOpaque(true);
        JPanel panel2 = new JPanel();
        panel2.add(label2);

        JLabel label3 = new JLabel("3",JLabel.CENTER);
        label3.setBackground(Color.blue);
        label3.setOpaque(true);
        JPanel panel3 = new JPanel();
        panel3.add(label3);

        tabbedPane =new JTabbedPane();
        tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
        tabbedPane.addChangeListener(this);
        tabbedPane.addTab("picture",new ImageIcon(".\\picmini\\Starstailsmall100.jpg"),panel1,"tuan");
        tabbedPane.addTab("L2",panel2);
        tabbedPane.addTab("L3",null,panel3,"label");
        tabbedPane.setEnabledAt(2,false);

        JButton b = new JButton("add new");
        b.addActionListener(this);
        cont.add(b,BorderLayout.NORTH);
        cont.add(tabbedPane,BorderLayout.CENTER);

        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void stateChanged(ChangeEvent e){
        if (index!= tabbedPane.getSelectedIndex())
        {
            if (index<tabbedPane.getTabCount()-1)
            {
                tabbedPane.setEnabledAt(index+1,true);
            }
            index = tabbedPane.getSelectedIndex();
        }
    }

    public void actionPerformed(ActionEvent e1){
        JPanel panel = new JPanel();
        tabbedPane.addTab("new"+newNumber,panel);
        tabbedPane.setEnabledAt(newNumber+2,false);
        newNumber++;
        tabbedPane.validate();
    }

    public static void main(String[] arg){
        new JTabbedPane2();
    }
}
