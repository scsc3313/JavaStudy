package com.company;

import java.io.*;

public class Main {

    private FileInputStream fileInputStream;
    private BufferedInputStream bufferedInputStream;
    private BufferedReader bufferedReader;

    Main() throws FileNotFoundException {
        fileInputStream = new FileInputStream(new File("names.txt"));
        bufferedInputStream = new BufferedInputStream(fileInputStream);
        bufferedReader = new BufferedReader(new FileReader("names.txt"));
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.control();
    }

    private void control() throws IOException {
        String string = bufferedReader.readLine();
        String[] names = string.split(",");
        System.out.println(names[0]);
    }
}
