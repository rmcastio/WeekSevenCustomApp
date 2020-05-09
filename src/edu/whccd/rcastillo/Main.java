package edu.whccd.rcastillo;

 /* This Custom Application is to display the use of Arrays and ArrayLists.
    Author: Richard Castillo
  */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] grades = new double[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Grade (0-100): ");
            grades[i] = sc.nextDouble();
        }


        for(int i = 0; i < 5; i++) {
            System.out.println("grades " + grades[i]);
        }


    }
}
