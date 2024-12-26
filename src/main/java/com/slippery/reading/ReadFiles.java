package com.slippery.reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String []args) throws FileNotFoundException {
        File myTextsFile =new File("/home/slippery/Documents/textsFile.txt");
        Scanner scanner =new Scanner(myTextsFile);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
