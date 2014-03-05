package union.codebreakers.command;

/**
 * Generic interface for every command
 */
public interface Command {
    
    /**
     * This method executes command
     * 
     * @return Whether the execution was successful or not
     */
    public boolean execute();
}
