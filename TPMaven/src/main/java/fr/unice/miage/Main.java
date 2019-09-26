package fr.unice.miage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        String str;
        InputStream in = cl.getResourceAsStream("config.cfg");
        InputStreamReader streamReader = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(streamReader);
        while ((str = reader.readLine()) != null) {
            System.out.println(str);

        }
    }
}
