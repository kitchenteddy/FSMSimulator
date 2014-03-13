/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.helper.fileChooserFilter;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author joshualoew
 */
public class FileChooserFilterCsvFile extends FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getAbsolutePath().endsWith(".csv");
    }

    @Override
    public String getDescription() {
        return "CSV (*.csv)";
    }
    
}
