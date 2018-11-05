package io;

import java.io.File;
import java.io.IOException;

public class FileCreator  {
    public static void main(String[] args) throws IOException {
       File file = new File("someJava.txt");
       if (file.exists()){
           System.out.println("yoooo-hoo");
           System.out.println(file.getAbsolutePath());
           System.out.println(file.getPath());
           System.out.println(file.getName());
           System.out.println(file.getParent());
           System.out.println(file.isDirectory());
           System.out.println(file.isFile());
       }else {
           System.out.println("File not found");
           file.createNewFile();
       }
    }
}
