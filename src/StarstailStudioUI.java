import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class StarstailStudioUI implements ActionListener {

    private JFrame frame;

    private JLabel statusBarLabel;
    private String statusBarText = "";
    private JLabel fileChooserLabel;

    private StarstailStudioUI() {
        JButton b;
        GridBagConstraints c;
        int gridX, gridY, gridWidth, gridHeight, anchor, fill, iPadX, iPadY;
        double weightx, weighty;
        Insets inset;

        frame = new JFrame();

        GridBagLayout gridbag = new GridBagLayout();
        Container contentpane = frame.getContentPane();
        contentpane.setLayout(gridbag);

        int insetTop = 30, insetLeft = 30, insetBottom = 0, insetRight = 30;

        b = new JButton("打开图像");
        gridX = 0;
        gridY = 0;
        gridWidth = 2;
        gridHeight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insetTop, insetLeft, insetBottom, insetRight);
        iPadX = 0;
        iPadY = 0;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        b.addActionListener(this);
        contentpane.add(b);

        b = new JButton("检测星点");
        gridX = 0;
        gridY = 1;
        gridWidth = 2;
        gridHeight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insetTop, insetLeft, insetBottom, insetRight);
        iPadX = 0;
        iPadY = 0;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        b.addActionListener(this);
        contentpane.add(b);

        b = new JButton("计算位移");
        gridX = 0;
        gridY = 2;
        gridWidth = 2;
        gridHeight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insetTop, insetLeft, insetBottom, insetRight);
        iPadX = 0;
        iPadY = 0;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        contentpane.add(b);

        b = new JButton("计算坏项");
        gridX = 0;
        gridY = 3;
        gridWidth = 2;
        gridHeight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insetTop, insetLeft, insetBottom, insetRight);
        iPadX = 0;
        iPadY = 0;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        contentpane.add(b);

        b = new JButton("补齐星轨");
        gridX = 0;
        gridY = 4;
        gridWidth = 2;
        gridHeight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(60, insetLeft, insetBottom, insetRight);
        iPadX = 0;
        iPadY = 0;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        contentpane.add(b);

        b = new JButton("去除抖动");
        gridX = 0;
        gridY = 5;
        gridWidth = 2;
        gridHeight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insetTop, insetLeft, insetBottom, insetRight);
        iPadX = 0;
        iPadY = 0;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        contentpane.add(b);

        b = new JButton("去除坏项");
        gridX = 0;
        gridY = 6;
        gridWidth = 2;
        gridHeight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insetTop, insetLeft, insetBottom, insetRight);
        iPadX = 0;
        iPadY = 0;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        contentpane.add(b);

        b = new JButton("延长星轨");
        gridX = 0;
        gridY = 7;
        gridWidth = 2;
        gridHeight = 1;
        weightx = 0;
        weighty = 0;
        anchor = GridBagConstraints.NORTHWEST;
        fill = GridBagConstraints.NONE;
        inset = new Insets(insetTop, insetLeft, insetBottom, insetRight);
        iPadX = 0;
        iPadY = 0;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        contentpane.add(b);

        b = new JButton("图像区");
        gridX = 2;
        gridY = 0;
        gridWidth = 8;
        gridHeight = 8;
        weightx = 1;
        weighty = 1;
        anchor = GridBagConstraints.CENTER;
        fill = GridBagConstraints.BOTH;
        inset = new Insets(insetTop, insetLeft, 0, 30);
        iPadX = 50;
        iPadY = 50;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(b, c);
        contentpane.add(b);

        statusBarLabel = new JLabel("状态栏");
        gridX = 2;
        gridY = 8;
        gridWidth = 1;
        gridHeight = 1;
        weightx = 1;
        weighty = 0.2;
        anchor = GridBagConstraints.CENTER;
        fill = GridBagConstraints.BOTH;
        inset = new Insets(insetTop, insetLeft, 30, 30);
        iPadX = 50;
        iPadY = 50;
        c = new GridBagConstraints(gridX, gridY, gridWidth, gridHeight, weightx, weighty, anchor, fill, inset, iPadX, iPadY);
        gridbag.setConstraints(statusBarLabel, c);
        contentpane.add(statusBarLabel);

        frame.setTitle("Starstail-Studio");
        frame.setSize(new Dimension(1000, 800));
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if ((e.getActionCommand()).equals("打开图像")) {
            // JFrame DKTXf = new JFrame("打开图像");
            // DKTXf.setSize(800,800);
            // DKTXf.show();
            statusBarText = statusBarText + "打开图像";
            statusBarLabel.setText(statusBarText);
            JFileChooser fileChooser = new JFileChooser("c:\\winnt");
            fileChooser.addChoosableFileFilter(new ImageFileFilter("jpg"));
            fileChooser.addChoosableFileFilter(new ImageFileFilter("tif"));
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                fileChooserLabel.setText("你选择了：" + file.getName() + "文件");
            } else if (result == JFileChooser.CANCEL_OPTION) {
                fileChooserLabel.setText("没有选取");
            }
            statusBarText = statusBarText + fileChooserLabel;
        }
        if ((e.getActionCommand()).equals("检测星点")) {
            statusBarText = statusBarText + "\n检测星点";
            statusBarLabel.setText(statusBarText);
        }
        if ((e.getActionCommand()).equals("计算位移")) {
            statusBarText = statusBarText + "计算位移";
            statusBarLabel.setText(statusBarText);
        }
        if ((e.getActionCommand()).equals("计算坏项")) {
            statusBarText = statusBarText + "计算坏项";
            statusBarLabel.setText(statusBarText);
        }
    }

    public static void main(String args[]) {
        new StarstailStudioUI();
    }
}
