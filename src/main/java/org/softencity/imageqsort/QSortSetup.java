package org.softencity.imageqsort;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Artur
 */
public class QSortSetup {
    public String sourceDir = "input";
    public String categoriesDir = "sorted";
    public List<File> sourceFiles = new ArrayList<File>();
    public List<File> categoryDirs = new ArrayList<File>();
    public int currentImageNo = 0;
    int labelWidth = 150;
}
