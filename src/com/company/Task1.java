package com.company;

import java.util.Scanner;

public class Task1 {
    //ASSIGNMENT ONE:

    //Task 1.a ---> Asking for user input here
    public void userInput(int[] arrInput){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arrInput.length; i++) {
            arrInput[i] = input.nextInt();
        }
    }

    //Task 1.b ---> Printing the array here
    public void printArr(int[] arrPrint, int n){

        for (int i = 0; i < n; i++) {
            System.out.format("%d ",arrPrint[i]);
        }
    }

    //Task 1.c ---> Calculates the average of the array here
    public void arrAverage(int[] arrAverage, int n){

        int arrSum = 0;
        double arrAve;

        for (int i = 0; i < n; i++) {
           arrSum += arrAverage[i];
        }

        arrAve = arrSum/(double)n;
        System.out.println(arrAve);
    }
}
