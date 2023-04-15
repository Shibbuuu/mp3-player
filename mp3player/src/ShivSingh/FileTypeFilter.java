/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShivSingh;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Shiv Singh
 */
public class FileTypeFilter extends FileFilter {

    

   // File Extentions String
    private final String extension;
    // File Extension Description
    private final String description;
    
    // Constructor Method
    public FileTypeFilter(String extension, String description){
        // Set Contructor Values
        this.extension = extension;
        this.description = description;
    }
    @Override
    public boolean accept(File file) {
        // If File Is Returning Directory
        if(file.isDirectory()){
            return true;
        }
        // Return File Name with Extension
        return file.getName().endsWith(extension);
    }

    /**
     *
     * @param f
     * @return
     */
    @Override
    public String getDescription() {
        // Return To Display File Type and Description
        return description + String.format(" (*%s)", extension);
    }
}
