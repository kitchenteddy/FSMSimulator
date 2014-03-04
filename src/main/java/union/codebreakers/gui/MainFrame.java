package union.codebreakers.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import union.codebreakers.command.CommandCenter;
import union.codebreakers.controller.AutomatonController;
import union.codebreakers.controller.ControllerPersonal;
import union.codebreakers.controller.MainController;
import union.codebreakers.controller.ToolbarController;
import union.codebreakers.controller.behavior.KeyboardBehaviorManager;
import union.codebreakers.controller.behavior.MouseBehaviorManager;
import union.codebreakers.helper.CollisionHandler;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.KeyboardBehaviorType;
import union.codebreakers.helper.enums.MouseBehaviorType;

/**
 * Main frame of the application
 */
public class MainFrame extends JFrame{

    static private int windowsW = 512;
    static private int windowsH = 512;
       
    private MainController mainController;
    private Container container;
    private FsmPanel machinePanel;
    private JMenuBar menuBar;
    private BoxLayout layout = null;
    
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
     * Init frame
     */
    public void init(){
        this.initFrame();
        this.initContainer();
        this.initToolbar();
        this.initElements();  
   }
    
    private void initContainer(){
        this.container = new Container();
        
        this.container.setKeyboardBehaviorManager( new KeyboardBehaviorManager(this.container ) );
        this.container.setMouseBehaviorManager( new MouseBehaviorManager(this.container ) );
        this.container.setCollisionHandler(new CollisionHandler(this.container) );
        this.container.setMainController(this.mainController);
        this.container.setToolbarController(new ToolbarController());
        this.container.setAutomatonController(new AutomatonController());
        this.container.setCommandCenter( new CommandCenter() );

        this.container.getCollisionHandler().setHitElement(null);
        this.container.getCollisionHandler().setSelectedState(null);
        this.container.getKeyboardBehaviorManager().setKeyboardBehavior(KeyboardBehaviorType.eInitial, true);
        this.container.getMouseBehaviorManager().setMouseBehavior(MouseBehaviorType.eInitial, true);
        this.container.getToolbarController().setMainFrame(this);
        this.container.getToolbarController().setContainer(this.container);
        this.container.getAutomatonController().setMainFrame(this);
        this.container.getAutomatonController().setContainer(this.container);
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
        this.machinePanel.addMouseListener(this.getContainer().getAutomatonController());
        this.addKeyListener(this.getContainer().getAutomatonController());
        this.machinePanel.addMouseMotionListener(this.getContainer().getAutomatonController());

        this.layout = new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS);
        
        this.getContentPane().setLayout(layout);
        this.getContentPane().add(this.machinePanel);
        this.container.setDrawingArea(this.machinePanel);
    }
    
    private void initToolbar(){
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        ImageIcon newi = new ImageIcon("resources/Clipboard.png");
        ImageIcon open = new ImageIcon("resources/Box.png");
        ImageIcon save = new ImageIcon("resources/Pencil.png");
        ImageIcon save_as = new ImageIcon("resources/Pencil.png");
        ImageIcon quit = new ImageIcon("resources/Delete.png");

        JButton newb = new JButton(newi);
        newb.setText("New");
        newb.setName("buttonNew");
        newb.addActionListener(this.getContainer().getToolbarController());
        
        JButton openb = new JButton(open);
        openb.setText("Open");
        openb.setName("buttonOpen");
        openb.addActionListener(this.getContainer().getToolbarController());

        JButton saveb = new JButton(save);
        saveb.setText("Save");
        saveb.setName("buttonSave");
        saveb.addActionListener(this.getContainer().getToolbarController());

        JButton save_asb = new JButton(save_as);
        save_asb.setText("Save As ...");
        save_asb.setName("buttonSaveAs");
        save_asb.addActionListener(this.getContainer().getToolbarController());

        JButton quitb = new JButton(quit);
        quitb.setText("Quit");
        quitb.setName("buttonQuit");
        quitb.addActionListener(this.getContainer().getToolbarController());

        toolbar.add(newb);
        toolbar.add(openb);
        toolbar.add(saveb);
        toolbar.add(save_asb);
        toolbar.add(quitb);
        toolbar.setAlignmentY(0);
        this.getContentPane().add(toolbar);
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
    
    /**
     * Gets container for this main controller
     * 
     * @return Instance of container for this main controller
     */
    public Container getContainer(){
        return this.container;
    }
}
