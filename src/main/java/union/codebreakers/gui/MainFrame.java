package union.codebreakers.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import union.codebreakers.controller.MainController;

/**
 * Main frame of the application
 */
public class MainFrame extends JFrame{

    static private int windowsW = 512;
    static private int windowsH = 512;
       
    private MainController controller;
    private JPanel machinePanel;
    private JMenuBar menuBar;
    
    public MainFrame(MainController appController){
        super("Finite State Machine Designer");
        this.controller = appController;
        this.initFrame();
        this.initMenu();
        this.initElements();
    }
    
    private void initFrame(){
        // set dimensions and position to center of screen
        this.setSize(MainFrame.windowsW, MainFrame.windowsH);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        // Move the window
        this.setLocation(( screen.width - MainFrame.windowsW ) / 2, ( screen.height - MainFrame.windowsH ) / 2);
        this.setResizable(false); // disable maximizing
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
    }
    
    private void initElements(){
        this.machinePanel = new JPanel();
        this.getContentPane().add(this.machinePanel);
    }
    
    private void initMenu() {
        this.menuBar = new JMenuBar();
        this.setJMenuBar(this.menuBar);
        
        JMenu menu = new JMenu("File"); 
        this.menuBar.add(menu);
        
        JMenuItem item = new JMenuItem("New");
        item.setName("menuitemNew");
        item.addActionListener(this.controller.getMenuController());
        menu.add(item);
        
        item = new JMenuItem("Open");
        item.setName("menuitemOpen");
        item.addActionListener(this.controller.getMenuController());
        menu.add(item);

        item = new JMenuItem("Save");
        item.setName("menuitemSave");
        item.addActionListener(this.controller.getMenuController());
        menu.add(item);

        item = new JMenuItem("Save As ...");
        item.setName("menuitemSaveAs");
        item.addActionListener(this.controller.getMenuController());
        menu.add(item);
        
        menu.addSeparator();
        item = new JMenuItem("Quit");
        item.setName("menuitemQuit");
        item.addActionListener(this.controller.getMenuController());
        menu.add(item);
    }
    
    public Graphics getGraphicsPainting(){
        return this.machinePanel.getGraphics();
    }
}
