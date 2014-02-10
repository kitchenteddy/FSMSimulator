package union.codebreakers.controller;

/**
 * Interface for the main controller
 */
public interface Controller
{	
	/**
	 * Assigns actions from user to controller's methods 
	 */	
	public void InitializeActions();
	
	/**
	 * Handles saveAsImage action from user
	 */	
	public void saveAsImage();
	
}

