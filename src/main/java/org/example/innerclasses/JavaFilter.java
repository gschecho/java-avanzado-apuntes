package org.example.innerclasses;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class JavaFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}
