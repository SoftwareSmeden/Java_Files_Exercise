package com.company;

import java.io.*;

public class Task3 {
    //ASSIGNMENT THREE:
    
    //Task 3.a ---> Writting to a .dat file
    public void writeToDatFile(int[] arrTwo, int n) throws IOException {

        FileOutputStream writeDat = new FileOutputStream("MinFil3.dat");

        for (int i = 0; i < n; i++) {
            
            writeDat.write(arrTwo[i]);
        }
        writeDat.close();
    }
    
    //Task 3.b ---> Reading from a .dat file
    public void readDatFile() throws IOException {

        FileInputStream readDat = new FileInputStream("MinFil3.dat");

        int value;
        while((value = readDat.read()) != -1){
            System.out.format("%d ",value);
        }
        readDat.close();
    }
}
