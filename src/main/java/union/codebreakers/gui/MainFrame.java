package union.codebreakers.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import union.codebreakers.command.CommandCenter;
import union.codebreakers.controller.AutomatonController;
import union.codebreakers.controller.ControllerPersonal;
import union.codebreakers.controller.MainController;
import union.codebreakers.controller.ObserverView;
import union.codebreakers.controller.ToolbarController;
import union.codebreakers.controller.behaviorManager.KeyboardBehaviorManager;
import union.codebreakers.controller.behaviorManager.MouseBehaviorManager;
import union.codebreakers.helper.CollisionHandler;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.KeyboardBehaviorType;
import union.codebreakers.helper.enums.MouseBehaviorType;
import union.codebreakers.keyboardHandler.FourAction;
import union.codebreakers.keyboardHandler.OneAction;
import union.codebreakers.keyboardHandler.ZeroAction;
import union.codebreakers.keyboardHandler.ThreeAction;
import union.codebreakers.keyboardHandler.TwoAction;
import union.codebreakers.model.ModelAutomaton;
import union.codebreakers.view.drawer.DrawerStockSimulator;

/**
 * Main frame of the application
 */
public class MainFrame extends JFrame{

    static private int windowsW = 650;
    static private int windowsH = 600;
       
    private MainController mainController;
    private Container container;
    private FsmPanel machinePanel;
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
        this.container.setObserverView(new ObserverView() );

        this.container.getCollisionHandler().setHitElement(null);
        this.container.getCollisionHandler().setSelectedState(null);
        this.container.getKeyboardBehaviorManager().setKeyboardBehavior(KeyboardBehaviorType.eInitial, true);
        this.container.getMouseBehaviorManager().setMouseBehavior(MouseBehaviorType.eInitial, true);
        this.container.getToolbarController().setContainer(this.container);
        this.container.getAutomatonController().setContainer(this.container);
        this.container.getCollisionHandler().addObserver(this.container.getObserverView());
        
        ModelAutomaton fsm = (ModelAutomaton)this.container.getMainController().getAutomaton();
        fsm.addObserver(this.container.getObserverView());
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
        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(this.getContainer().getAutomatonController());
        this.machinePanel.addMouseMotionListener(this.getContainer().getAutomatonController());

        this.layout = new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS);
        //TBK MAKE BUTTONS WORK HERE
        this.initKeyBindings();
        
        this.getContentPane().setLayout(layout);
        this.getContentPane().add(this.machinePanel);
        this.container.setDrawingArea(this.machinePanel);
        
        this.container.getMainController().getViewImage().setDrawerStock(new DrawerStockSimulator(this.container));
        this.container.getObserverView().setView(this.machinePanel);
    }
    
    private void initToolbar(){
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);
        
        JToolBar simBar = new JToolBar();
        simBar.setFloatable(false);

        ImageIcon newi = new ImageIcon("resources/Clipboard.png");
        ImageIcon open = new ImageIcon("resources/Box.png");
        ImageIcon save = new ImageIcon("resources/Pencil.png");
        // ImageIcon save_as = new ImageIcon("resources/Pencil.png");
        ImageIcon quit = new ImageIcon("resources/Delete.png");
        ImageIcon start = new ImageIcon("resources/Play.png");
        ImageIcon enterPath = new ImageIcon("resources/Arrow.png");

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

        JButton quitb = new JButton(quit);
        quitb.setText("Quit");
        quitb.setName("buttonQuit");
        quitb.addActionListener(this.getContainer().getToolbarController());
        
        JButton pathb = new JButton(enterPath);
        pathb.setText("Enter Path");
        pathb.setName("buttonPathPrompt");
        pathb.addActionListener(this.getContainer().getToolbarController());
        
        JButton startb = new JButton(start);
        startb.setText("Step Through");
        startb.setName("buttonStart");
        startb.addActionListener(this.getContainer().getToolbarController());

        toolbar.add(newb);
        toolbar.add(openb);
        toolbar.add(saveb);
        toolbar.add(quitb);
        toolbar.setAlignmentY(0);
        
        simBar.add(pathb);
        simBar.add(startb);
        simBar.setAlignmentY(0);
        
        this.getContentPane().add(toolbar);
        this.getContentPane().add(simBar);
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
     * Runs main code for this frame
     */
    public void run(){
        this.setVisible(true);        
    }
    
    /**
     * Gets container for this main controller
     * 
     * @return Instance of container for this main controller
     */
    public Container getContainer(){
        return this.container;
    }
    
    
    private void initKeyBindings(){
        AbstractAction mySpaceAction, myOneAction, myTwoAction, myThreeAction, myFourAction, myZeroAction;      
        
        myOneAction = new OneAction(container);
        myTwoAction = new TwoAction(container);
        myThreeAction = new ThreeAction(container);
        myFourAction = new FourAction(container);
        myZeroAction = new ZeroAction(container);
        
        
        this.machinePanel.grabFocus(); 
        
        Character myCharacter;
         
        //One
        myCharacter = new Character('1');
        this.addKeyBinding(myCharacter, "One", myOneAction);
        
        //Two
        myCharacter = new Character('2');
        this.addKeyBinding(myCharacter, "Two", myTwoAction);
        
        //Three
        myCharacter = new Character('3');
        this.addKeyBinding(myCharacter, "Three", myThreeAction);
        
        
        //Four
        myCharacter = new Character('4');
        this.addKeyBinding(myCharacter, "Four", myFourAction);
        
        
        
        //Zero
        myCharacter = new Character('0');
        this.addKeyBinding(myCharacter, "Zero", myZeroAction);
                
    }
    
    private void addKeyBinding(Character myCharacter, String myString, AbstractAction myAction){
        this.machinePanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(myCharacter), myString);
        this.machinePanel.getActionMap().put(myString, myAction);
        
    }
    
    
}
