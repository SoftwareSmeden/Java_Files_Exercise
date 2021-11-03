package com.company;

import java.io.*;
import java.util.Scanner;

public class Task4 {
    //ASSIGNMENT FOUR:

    //Task 4.a ---> Creating a new .txt file and putting data in the file
    public void createTextFile() throws IOException {

        PrintWriter writeToFile = new PrintWriter("Persondata.txt");

        int nr = 1;
        String navn = "Pernille";
        double tal = 12.50;
        writeToFile.format("%d %s %.2f",nr,navn,tal);

        int nr2 = 2;
        String navn2 = "Peter";
        double tal2 = 22.75;
        writeToFile.format(" %d %s %.2f",nr2,navn2,tal2);

        int nr3 = 3;
        String navn3 = "Christian";
        double tal3 = 30.10;
        writeToFile.format(" %d %s %.2f",nr3,navn3,tal3);

        writeToFile.close();
    }

    //Task 4.b ---> Reading and putting the data from the .txt file into 3 arrays
    public void readFile(int[] arrThree, String[] sOne, double[] dOne) throws FileNotFoundException {

        File personFil = new File("Persondata.txt");
        Scanner input = new Scanner(personFil);

        for (int i = 0; i < 3; i++) {
            arrThree[i] = input.nextInt();
            sOne[i] = input.next();
            dOne[i] = input.nextDouble();
        }
            input.close();
    }

    //Task 4.c ---> Printing the three arrays
    public void printArrays(int[] arrThree, String[] sOne, double[] dOne, int n){

        for (int i = 0; i < n; i++) {
            System.out.format("%d %s %.2f \n",arrThree[i], sOne[i], dOne[i]);
        }
    }

    //Task 4.d ---> Writing the value from the three arrays to a .dat file
    public void writeToDatFile(int[] arrThree, String[] sOne, double[] dOne, int n) throws IOException {

        DataOutputStream writeToDat = new DataOutputStream(new FileOutputStream("MinFil4.dat"));

        for (int i = 0; i < n; i++) {
            writeToDat.writeInt(arrThree[i]);
            writeToDat.writeUTF(sOne[i]);
            writeToDat.writeDouble(dOne[i]);
        }
            writeToDat.close();
    }

    //Task 4.e ---> Reading from .dat file and putting the data in three arrays
    public void readDatFile(int[] arrFour, String[] sTwo, double[] dTwo, int n) throws IOException {

        DataInputStream readDatFile = new DataInputStream(new FileInputStream("Minfil4.dat"));

        for (int i = 0; i < 3; i++) {

            arrFour[i] = readDatFile.readInt();
            sTwo[i] = readDatFile.readUTF();
            dTwo[i] = readDatFile.readDouble();
        }
            readDatFile.close();
    }
}
