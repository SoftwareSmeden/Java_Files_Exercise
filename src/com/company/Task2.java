package com.company;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    //ASSIGNMENT TWO:

    //Task 2.a ---> Creating a text file (.txt) and inserting 10 integers
    public void createTextFile() throws IOException {

        PrintWriter writeToFile = new PrintWriter("MinFil.txt");

        for (int i = 0; i < 10; i++) {
            writeToFile.format("%d ",i + 1);
        }
        writeToFile.close();
    }

    //Task 2.b ---> Reading integers from file "MinFil.txt"
    public void readFromTextFile(int[] arrFileValue) throws FileNotFoundException {

        File readFile = new File("MinFil.txt");
        Scanner reading = new Scanner(readFile);

        int index = 0;
        while(reading.hasNext()){
            arrFileValue[index] = reading.nextInt();
            index++;
        }
        reading.close();
    }

    //Task 2.e ---> Adding 10 to each value in the 'arrTwo' array
    public void add10(int[] arrAdd10, int n) throws FileNotFoundException {

        for (int i = 0; i < n; i++) {
            arrAdd10[i] += 10;
        }
    }

    //Task 2.e ---> Writing the array 'arrTwo''s new values to a new text file 'MinFil.txt'
    public void writeToFile(int[] arrTwoNew, int n) throws FileNotFoundException {

        PrintWriter writeToFile = new PrintWriter("MinFil1.txt");

        for (int i = 0; i < n; i++) {
            writeToFile.format("%d ", arrTwoNew[i]);
        }
        writeToFile.close();
    }
}
