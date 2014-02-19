package union.codebreakers.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import union.codebreakers.controller.ControllerPersonal;
import union.codebreakers.controller.MainController;

/**
 * Main frame of the application
 */
public class MainFrame extends JFrame{

    static private int windowsW = 512;
    static private int windowsH = 512;
       
    private MainController mainController;
    private FsmPanel machinePanel;
    private JMenuBar menuBar;
    
    private ControllerPersonal personalController;
    
    /**
     * Constructor
     */
    public MainFrame(){
        super("Finite State Machine Designer");
    }
    
    /**
     * Sets pointer to MainController
     * @param controller Instance of MainController
     */
    public void setMainController(MainController controller){
        this.mainController = controller;
    }
    
    /**
     * Gets pointer to MainController
     * 
     * @return Instance of MainController
     */
    public MainController getMainController(){
        return this.mainController;
    }
    
    /**
     * Inits frame
     */
    public void init(){
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
        this.machinePanel = new FsmPanel();
        this.machinePanel.setVew(this.getMainController().getViewImage());
        this.machinePanel.addMouseListener(this.mainController.getAutomatonController());
        BoxLayout layout = new BoxLayout(this.getContentPane(), 1);
        
        this.getContentPane().setLayout(layout);
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
    
    /**
     * Gets drawable canvas to draw finite state automaton to
     * 
     * @return Drawable canvas to draw finite state automaton to
     */
    public Graphics getGraphicsPainting(){
        return this.getDrawingPlace().getGraphics();
    }
    
    /**
     * Runs personal controller, if it can to
     */
    public void runPersonal(){
        if( this.mainController.getPersonalController() != null ){
            this.mainController.getPersonalController().run();
        }
    }
    
    /**
     * Redraws automaton on the canvas
     */
    @Override
    public void repaint()
    {
        Graphics g = this.getGraphicsPainting();
        
        g.fillRect(-1, -1, this.machinePanel.getWidth()+2, this.machinePanel.getHeight()+2);
    }
    
    /**
     * Runs main code for this frame
     */
    public void run(){
        this.setVisible(true);        
    }
    
    /**
     * Gets place to draw FSM
     * 
     * @return Place where to draw FSM
     */
    public FsmPanel getDrawingPlace(){
        return this.machinePanel;
    }
}
