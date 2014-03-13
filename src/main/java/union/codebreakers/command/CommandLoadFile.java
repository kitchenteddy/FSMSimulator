package union.codebreakers.command;

import java.io.File;
import javax.swing.JFileChooser;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.fileChooserFilter.FileChooserFilterCsvFile;

/**
 * This command loads an automaton from a file
 */
public class CommandLoadFile implements Command{

    private Container container;
    
    /**
     * Constructor
     * 
     * @param newContainer Instance of Shared container
     */
    public CommandLoadFile(Container newContainer){
       this.container = newContainer;
    }
    
    /**
     * Executes the command
     * 
     * @return Result of operation
     */
    @Override
    public boolean execute() {
        boolean res = true;
        
        JFileChooser dialog = new JFileChooser( "" );
        dialog.addChoosableFileFilter( new FileChooserFilterCsvFile() );
        
        int returnVal = dialog.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            Command command;
            File file = dialog.getSelectedFile();
            
            if( file.getAbsolutePath().endsWith(".csv") ){
                command = new CommandLoadFileCsv(file);
            } else {
                command = null;
            }
            return this.container.getCommandCenter().execute(command);
        } else {
            res = false;
        }
        
        return res;
    }
}
