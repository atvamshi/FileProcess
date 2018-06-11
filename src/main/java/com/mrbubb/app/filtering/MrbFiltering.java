package com.mrbubb.app.filtering;

import com.mrbubb.app.fileUtility.FileUtility;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Project: mrb-file-process
 * Package: com.mrbubb.app.filtering
 * <p>
 * User: Usha
 * Date: 6/10/2018
 * Time: 4:11 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class MrbFiltering {

    public void filteringFlowOfMrbubble(){
        System.out.println("Inside public void filteringFlowOfMrbubble() of class MrbFiltering ");
        FileUtility fileUtility = new FileUtility("input/DirtyFile.txt");
//        System.out.println(Boolean.valueOf("True"));

        try {
           ArrayList<String> listOfLinesInText = fileUtility.readFile();
           for (String line: listOfLinesInText){
               System.out.println(line);
               String[] items = line.split("\\|");
               System.out.println("hello");
           }

        } catch (IOException e) {
            System.out.println("Exception in public void filteringFlowOfMrbubble()");
            e.printStackTrace();
        }
    }

}
