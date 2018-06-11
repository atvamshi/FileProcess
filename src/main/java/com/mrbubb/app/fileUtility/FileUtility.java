package com.mrbubb.app.fileUtility;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Project: mrb-file-process
 * Package: com.mrbubb.app.fileUtility
 * <p>
 * User: Usha
 * Date: 6/10/2018
 * Time: 4:36 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class FileUtility {
    private String inputPath;

    public FileUtility(String inputPath) {
        this.inputPath = inputPath;
    }

    public ArrayList<String> readFile() throws IOException {
        System.out.println("Inside public void readFile() of class FileUtility ");


        Path path = null;
        try {
            path = Paths.get(getClass().getClassLoader()
                    .getResource(this.inputPath).toURI());
        } catch (URISyntaxException e) {
            System.out.println("File not found in the method public void readFile() ");
            e.printStackTrace();
        }

        ArrayList<String> listOfLines = new ArrayList<>();
//        StringBuilder data = new StringBuilder();
        Stream<String> lines = Files.lines(path);
        lines.forEach(line -> {
            listOfLines.add(line);
//            data.append(line).append("\n");
//            System.out.println(line);
        });
        lines.close();
        return listOfLines;
    }
}

