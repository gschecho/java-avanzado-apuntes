package org.example.newio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesDemo {
    public static void main(String...args ) throws IOException {

         //Crea un directorio
        Files.createDirectory((Paths.get("data")));

        //Crea un directorio con directorios intermedios
        Files.createDirectories(Paths.get("sub1", "sub2", "sub3"));

        //Añadir un archivo vacío al directorio
        Files.createFile(Paths.get("sub1", "sub2", "sub3", "nuevoArchivo.txt"));

        //Elimina todo
        boolean deleted = Files.deleteIfExists(Paths.get("sub1", "sub2", "sub3", "nuevoArchivo.txt"));
        deleted = Files.deleteIfExists(Paths.get("data"));
        deleted = Files.deleteIfExists(Paths.get("sub1", "sub2", "sub3"));
        deleted = Files.deleteIfExists(Paths.get("sub1", "sub2"));
        deleted = Files.deleteIfExists(Paths.get("sub1"));

        //Acceso a archivo, leer en una coleccion y imprimir
        Path sourceDir  = Paths.get("src","main","java","org","example","newio");
        Path dataFile = sourceDir.resolve("data.txt");
        System.out.println(Files.lines(dataFile).collect(Collectors.toList()));

        // Copear  a una nueva localización
        Path destination =  sourceDir.resolve("data_copy.txt");
        Files.copy(dataFile, destination);

        //Mover archivo
        Path otro = sourceDir.resolve("data_moved.txt");
        Files.move(destination, otro);

        //Eliminar la copia
        Files.deleteIfExists(otro);



        //Visita todos los archivos del directorio
        Path javaDir = Paths.get("src", "main", "java");
        try(Stream<Path> entries = Files.walk(javaDir)){
            entries.forEach(System.out::println);
        }

    }
}
