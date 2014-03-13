package union.codebreakers.helper.fileChooserFilter;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * Filter for image files in JFileChooser
 */
public class FileChooserFilterImageFile extends FileFilter {

    @Override
    public String getDescription() {
        // This description will be displayed in the dialog,
        // hard-coded = ugly, should be done via I18N
        return "Image (*.png)";
    }

    @Override
    public boolean accept(File file) {
        // Allow only directories, or files with ".txt" extension
         return file.isDirectory() || file.getAbsolutePath().endsWith(".png");
     }
} 
