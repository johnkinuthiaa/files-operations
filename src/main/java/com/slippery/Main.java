package com.slippery;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
//        creation
//        String fileCreation =createNewFile("/home/slippery/Documents/names.pdf");
//        System.out.println(fileCreation);
//        writing
        String fileWriting =writeToFile("/home/slippery/Documents/names.pdf");
        System.out.println(fileWriting);

//reading
        String fileReader =readFromFile("/home/slippery/Documents/names.pdf");
        System.out.println(fileReader);
    }
    public static String createNewFile(String name) throws IOException{
        try{
            File namesTxt =new File(name);
            if(namesTxt.createNewFile()){
                return "new file created";
            }
        }catch (IOException e){
            e.printStackTrace();
            return "error "+e.getMessage();
        }
        return null;
    }
    public static String readFromFile(String name) throws FileNotFoundException {
        File file =new File(name);
        Scanner scanner =new Scanner(file);
        if(scanner.hasNext()){
            return scanner.next();
        }else{
            throw new RuntimeException("file is empty");
        }

    }
    public static String writeToFile(String name) throws IOException{
        try{
            FileWriter writer =new FileWriter(name);
            StringBuilder messages = new StringBuilder();
            messages.append("new file \n");
            messages.append("new file 1 \n");
            messages.append("new file 2\n");
            messages.append("new file 4\n");
            messages.append("new file 6 \n");

            writer.write(messages.toString());
            writer.close();
            return "message written to file";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}