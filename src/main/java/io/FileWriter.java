package io;

import java.io.*;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        var bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("someJava.txt")));
        bw.append("Kyiv is a good city " );
        bw.append("Lviv is a good city");
        bw.flush();
        bw.close();

    }
}
