/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author mzijlstra
 */
public class FileOps {
    public static void main(String[] args) {
        try {
            Files.copy(Paths.get("a.txt"), Paths.get("b.txt"));
            Files.createDirectories(Paths.get("some/directory/tree"));
            Files.createDirectory(Paths.get("MyStuff"));
            DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get("MyStuff"));
            for (Path p : paths) {
                System.out.print("Is a directory: " + Files.isDirectory(p));
                System.out.println(" "+ p.toAbsolutePath().getFileName());
            }
            Files.createFile(Paths.get("MyFile.txt"));
            long size = Files.size(Paths.get("MyFile.txt"));
            Files.delete(Paths.get("MyFile.txt"));
            boolean exists = Files.exists(Paths.get("MyFile.txt"));
        } catch(Exception e) {}
    }
}
