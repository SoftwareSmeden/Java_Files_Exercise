package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	    //Java Files Exercise

        System.out.println("Task 1.a");
        Task1 taskOne = new Task1();

        int[] arrOne = new int[10];
        System.out.print("Type 10 integers: ");
        taskOne.userInput(arrOne);

        System.out.println("\n\nTask 1.b");
        int arrLen = 10;
        System.out.print("Elements in the 'arrOne' array = ");
        taskOne.printArr(arrOne,arrLen);

        System.out.println("\n\nTask 1.c");
        System.out.print("Array average = ");
        taskOne.arrAverage(arrOne,arrLen);

        //Task 2:
        System.out.println("\n\nTask 2.a");
        Task2 taskTwo = new Task2();
        taskTwo.createTextFile();
        System.out.println("File created");

        System.out.println("\nTask 2.b");
        int[] arrTwo = new int[10];
        taskTwo.readFromTextFile(arrTwo);
        System.out.println("File values have been moved to an array");

        System.out.println("\nTaks 2.c");
        System.out.print("Elements in the 'arrTwo' array = ");
        taskOne.printArr(arrTwo,arrLen);

        System.out.println("\n\nTask 2.d");
        System.out.print("Array average = ");
        taskOne.arrAverage(arrTwo,arrLen);

        System.out.println("\nTask 2.e");
        taskTwo.add10(arrTwo,arrLen);
        taskTwo.writeToFile(arrTwo,arrLen);
        System.out.println("10 have been added to each element in the 'arrTwo' array and written to a text file");

        //Task 3:
        System.out.println("\nTak 3.a");
        Task3 taskThree = new Task3();
        taskThree.writeToDatFile(arrTwo,arrLen);
        System.out.println("The 'arrTwo' array value have been written to a .dat file");

        System.out.println("\nTask 3.b");
        taskThree.readDatFile();

        //Task 4:
        System.out.println("\n\nTask 4.a");
        Task4 taskFour = new Task4();
        taskFour.createTextFile();
        System.out.println("File have been created");

        System.out.println("\nTask 4.b");
        int[] arrThree = new int[3];
        String[] sOne = new String[3];
        double[] dOne = new double[3];
        taskFour.readFile(arrThree,sOne,dOne);
        System.out.println("Data from persondata.txt have been added to the three arrays");

        System.out.println("\nTask 4.c");
        int arraysLen = 3;
        taskFour.printArrays(arrThree,sOne,dOne,arraysLen);

        System.out.println("\nTask 4.d");
        taskFour.writeToDatFile(arrThree,sOne,dOne,arraysLen);
        System.out.println("A new .dat file have been created");

        System.out.println("\nTask 4.e");
        int[] arrFour = new int[3];
        String[] sTwo = new String[3];
        double[] dTwo = new double[3];
        taskFour.readDatFile(arrFour,sTwo,dTwo,arraysLen);
        System.out.println("Data have been added to three new arrays");

        System.out.println("\nTask 4.f");
        taskFour.printArrays(arrFour,sTwo,dTwo,arraysLen);

        //Task 5:
        System.out.println("\nTask 5.a");
        System.out.println("Here we create a new class calle 'Person'");

        System.out.println("\nTask 5.b");
        Person p1 = new Person();  //Instead of using setters, use a constructor and get a shorter code: Person p1 = new Person(1,"Pernille",12.50);
        p1.setNr(1);
        p1.setNavn("Pernille");
        p1.setTal(12.50);

        Person p2 = new Person();
        p2.setNr(2);
        p2.setNavn("Peter");
        p2.setTal(22.75);

        Person p3 = new Person();
        p3.setNr(3);
        p3.setNavn("Christian");
        p3.setTal(30.10);

        System.out.println("\nTask 5.c");
        p1.printObj(p1);
        p2.printObj(p2);
        p3.printObj(p3);

        System.out.println("\nTask 5.d");
        Person[] personer = {p1,p2,p3};
        System.out.println("Person-array have been created and added the three 'p1/2/3' objects");

        System.out.println("\nTask 5.e");
        int personObjAmount = 3;
        Person person = new Person();
        person.printArrPerson(personer,personObjAmount);

        System.out.println("\nTask 5.f");
        person.writeToFile(personer,personObjAmount);
        System.out.println("Objects have been added to the .ser file");

        System.out.println("\nTask 5.g");
        Person[] pArr = new Person[3];
        person.readSerFile(pArr);
        person.printArrPerson(pArr,personObjAmount);

        System.out.println("\nASSIGNMENT COMPLETE!\n");

        //assignmentView();
    }

    //This method will print the assignment your working on (This is not part of the original assignment)
    static void assignmentView() throws FileNotFoundException {

        File asd = new File("Assignment.txt");
        Scanner out = new Scanner(asd);

        int count = 0;
        while (count < 61 && out.hasNext()){

            System.out.println(out.nextLine());
            count++;
        }
    }
}
