package com.slippery;

import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        File texts =new File("/home/slippery/Documents/textsFile.txt");
        if(texts.createNewFile()){
            System.out.println("new file created at"+texts.toString().substring(0,texts.toString().length() -14) );
        }else{
            System.out.println("file not created");
        }
    }
}