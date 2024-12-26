package com.slippery.writing;

import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        String filename ="/home/slippery/Documents/textsFile.txt";
        try{
            FileWriter writer =new FileWriter(filename);
            writer.write("i created a new file and this saves everything in a file \n this will save");
            writer.close();
            System.out.println("text written to file");

        }catch (IOException e){
            throw new IOException();
        }

    }
}
