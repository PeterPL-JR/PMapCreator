package com.peterpl.pmap.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class FileHandler {
    public static String readResource(String path) {
        return read(FileHandler.class.getResource(path).getFile());
    }

    public static String readFile(String path) {
        return read(path);
    }

    private static String read(String path) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
