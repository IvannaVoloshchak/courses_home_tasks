package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
    public static void main(String[] args) throws IOException {
        var fileReader = new InputStreamReader(new FileInputStream("someJava.txt"));
        BufferedReader bf = new BufferedReader(fileReader);
        while (bf.ready()) {
            System.out.println(bf.readLine());
        }
    }
}
