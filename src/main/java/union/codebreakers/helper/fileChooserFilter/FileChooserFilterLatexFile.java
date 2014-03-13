package union.codebreakers.helper.fileChooserFilter;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * Filter for LaTex files in JFileChooser
 */
public class FileChooserFilterLatexFile extends FileFilter {

    @Override
    public String getDescription() {
        // This description will be displayed in the dialog,
        // hard-coded = ugly, should be done via I18N
        return "LaTex (*.tex)";
    }

    @Override
    public boolean accept(File file) {
        // Allow only directories, or files with ".txt" extension
         return file.isDirectory() || file.getAbsolutePath().endsWith(".tex");
     }
} 
