package union.codebreakers.command;

import java.io.File;
import javax.swing.JFileChooser;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.fileChooserFilter.FileChooserFilterTextFile;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.helper.fileChooserFilter.FileChooserFilterImageFile;
import union.codebreakers.helper.fileChooserFilter.FileChooserFilterLatexFile;
import union.codebreakers.helper.fileChooserFilter.FileChooserFilterCsvFile;

/**
 *
 */
public class CommandSaveFile implements Command{

    private Container container;
    
    public CommandSaveFile(Container newContainer){
       this.container = newContainer;
    }

    /**
     * Saves automaton into a text file
     */
    @Override
    public boolean execute()
    {
        boolean res = true;
        JFileChooser dialog = new JFileChooser( "" );
        dialog.addChoosableFileFilter( new FileChooserFilterTextFile() );
        dialog.addChoosableFileFilter( new FileChooserFilterLatexFile() );
        dialog.addChoosableFileFilter( new FileChooserFilterImageFile() );
        dialog.addChoosableFileFilter( new FileChooserFilterCsvFile() );
        int returnVal = dialog.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            Command command;
            File file = dialog.getSelectedFile();
            
            // for now, it's OK, but thi should get improved
            if( file.getAbsolutePath().endsWith(".png") ){
                command = new CommandSaveFileImage((this.container.getDrawingArea()), file.getAbsolutePath(), this.container.getMainController().getAutomaton());
            } else {
                // Where to add save to CSV/Loadable????
                if( file.getAbsolutePath().endsWith(".txt") ){
                    command = new CommandSaveFileText((this.container.getMainController().getAutomaton()), FormatterType.eReadable, file.getAbsolutePath());
                } else if (file.getAbsolutePath().endsWith(".csv")) {
                    command = new CommandSaveFileLoadable(this.container.getMainController().getAutomaton(), FormatterType.eLoadable, file.getAbsolutePath());
                } else {
                    command = new CommandSaveFileText((this.container.getMainController().getAutomaton()), FormatterType.eLatex, file.getAbsolutePath());
                }
            }
            return this.container.getCommandCenter().execute(command);
        } else{
            res = false;
        }
        return res;
    }
}
