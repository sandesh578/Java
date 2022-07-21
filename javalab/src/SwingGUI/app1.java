package SwingGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class app1 extends JFrame {

    public app1() {
        super("Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenu newMenuItem = new JMenu("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem closeMenuItem = new JMenuItem("Close");
        JMenuItem closeAllMenuItem = new JMenuItem("Close All");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        JMenuItem textFileMenuItem = new JMenuItem("Text File");
        JMenuItem imgFileMenuItem = new JMenuItem("Image File");
        JMenuItem folderMenuItem = new JMenuItem("Folder");

        // you can rewrite it with a lambda if you prefer this
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        newMenuItem.add(textFileMenuItem);
        newMenuItem.add(imgFileMenuItem);
        newMenuItem.add(folderMenuItem);


        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(closeMenuItem);
        fileMenu.add(closeAllMenuItem);

        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setVisible(true);

    }

    public static void main(final String[] args) {
        new app1();
    }
}