package org.example.newio;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;


//JAVA 7
public class Newio {

public static void main(String ... arg ){
    Path dictionary = Paths.get("/", "Users","gon","Documents","SPRING - JAVA","JAVA","doc");
    System.out.println(dictionary);

    Path home = Paths.get("/Users/gon");
    System.out.println(home);

    //resolve para encontrar directorios anidados
    Path docs =  home.resolve("Documents");
    System.out.println(docs);

    //Resolver hermanos
    Path downloads = docs.resolveSibling("Downloads");
    System.out.println(downloads);


    //Project Directory
    Path project = Paths.get(".");
    System.out.println(project);
    System.out.println(project.toAbsolutePath());
    System.out.println("Como URI: " + project.toUri());


    //Normalize Path, te quita los puntos
    Path p = Paths.get("/Users/gon/Documents/./Intellij/..").normalize();
    System.out.println("normalized: " + p);

    System.out.println("parent: " + project.toAbsolutePath().getParent());
    System.out.println("file name: " + project.toAbsolutePath().getFileName());
    System.out.println("root" + project.getRoot());
    for(Path path: project.toAbsolutePath()){
        System.out.println(path);
    }

    File localDir = new File("..");
    System.out.println(localDir);
    System.out.println(localDir.toPath().toAbsolutePath().normalize());

}}
