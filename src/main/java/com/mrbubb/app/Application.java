package com.mrbubb.app;

import com.mrbubb.app.filtering.MrbFiltering;

/**
 * Project: mrb-file-process
 * Package: com.mrbubb.app
 * <p>
 * User: Usha
 * Date: 6/10/2018
 * Time: 4:02 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    public static void main (String args[]){
        MrbFiltering mrbFiltering = new MrbFiltering();
        mrbFiltering.filteringFlowOfMrbubble();
    }
}
