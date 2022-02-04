package com.company.cursor;

import java.io.*;

public class Main {

    public static void main(String[] args){
        String oldFile;
        String newFile;

        if(args.length != 0){
                oldFile = args[0];
                newFile = args[1];
        }
        else{
            oldFile = "from.txt";
            newFile = "to.txt";
        }
        
        try(FileReader fr = new FileReader(oldFile);
            FileWriter fw = new FileWriter(newFile)){

            int c;
            while((c = fr.read()) != -1){
                fw.write(c);
            }
        }catch (FileNotFoundException e){
            System.out.println("File " + oldFile + "was not found");
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
