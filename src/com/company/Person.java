package com.company;

import java.io.*;

public class Person implements Serializable {
    //ASSIGNMENT FIVE:

    //Task 5.a ---> Created instance variables
    private int nr;
    private String navn;
    private double tal;

    //Task 5.a ---> Created a default constructor
    public Person(){
    }

    //Task 5.a ---> Created a constructor with parameters
    public Person(int nr, String navn, double tal) {
        this.nr = nr;
        this.navn = navn;
        this.tal = tal;
    }

    //Task 5.c ---> Printing a person-object
    public void printObj(Person person){
        System.out.print(person.getNr() + " ");
        System.out.print(person.getNavn() + " ");
        System.out.println(person.getTal());
    }

    //Task 5.e ---> Printing all objects inside the array
    public void printArrPerson(Person[] personX, int n){

        for (int i = 0; i < n; i++) {
            System.out.format("%d %s %.2f \n",personX[i].getNr(), personX[i].getNavn(), personX[i].getTal());
        }
    }

    //Task 5.f ---> Writing person-object to a .ser file
    public void writeToFile(Person[] personX, int n) throws IOException {

        ObjectOutputStream writeToSerFile = new ObjectOutputStream(new FileOutputStream("Personer.ser"));

        for (int i = 0; i < n; i++) {
            writeToSerFile.writeObject(personX[i]);
        }
            writeToSerFile.close();
    }

    //Task 5.g ---> Reading from a .ser file
    public void readSerFile(Person[] pArr) throws IOException, ClassNotFoundException {

        ObjectInputStream readSerFile = new ObjectInputStream(new FileInputStream("Personer.ser"));

        for (int i = 0; i < 3; i++) {
            pArr[i] = (Person) readSerFile.readObject();
        }
    }


    //Task 5.a ---> Created getters and setters
    public int getNr() {
        return nr;
    }
    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getTal() {
        return tal;
    }
    public void setTal(double tal) {
        this.tal = tal;
    }
}
