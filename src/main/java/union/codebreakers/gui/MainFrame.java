package union.codebreakers.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import union.codebreakers.controller.AutomatonController;
import union.codebreakers.controller.ControllerPersonal;
import union.codebreakers.controller.MainController;
import union.codebreakers.controller.MenuController;

/**
 * Main frame of the application
 */
public class MainFrame extends JFrame{

    static private int windowsW = 512;
    static private int windowsH = 512;
       
    private MainController mainController;
    private JPanel machinePanel;
    private JMenuBar menuBar;
    
    private ControllerPersonal personalController;
    
    public MainFrame(){
        super("Finite State Machine Designer");
    }
    
    public void setMainController(MainController controller){
        this.mainController = controller;
    }
    
    public void init(){
        this.initFrame();
 //       this.initMenu();
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
        this.machinePanel.addMouseListener(this.mainController.getAutomatonController());
        this.getContentPane().add(this.machinePanel);
    }
    
    private void initMenu() {
        this.menuBar = new JMenuBar();
        this.setJMenuBar(this.menuBar);
        
        JMenu menu = new JMenu("File"); 
        this.menuBar.add(menu);
        
        JMenuItem item = new JMenuItem("New");
        item.setName("menuitemNew");
        item.addActionListener(this.mainController.getMenuController());
        menu.add(item);
        
        item = new JMenuItem("Open");
        item.setName("menuitemOpen");
        item.addActionListener(this.mainController.getMenuController());
        menu.add(item);

        item = new JMenuItem("Save");
        item.setName("menuitemSave");
        item.addActionListener(this.mainController.getMenuController());
        menu.add(item);

        item = new JMenuItem("Save As ...");
        item.setName("menuitemSaveAs");
        item.addActionListener(this.mainController.getMenuController());
        menu.add(item);
        
        menu.addSeparator();
        item = new JMenuItem("Quit");
        item.setName("menuitemQuit");
        item.addActionListener(this.mainController.getMenuController());
        menu.add(item);
    }
    
    public Graphics getGraphicsPainting(){
        return this.machinePanel.getGraphics();
    }
    
    public void runPersonal(){
        if( this.mainController.getPersonalController() != null ){
            this.mainController.getPersonalController().run();
        }
    }
    
    public void run(){
        this.setVisible(true);        
    }
}
