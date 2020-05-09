package edu.whccd.rcastillo;

 /* This Custom Application is to display the use of Arrays and ArrayLists.
    Author: Richard Castillo
  */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
            System.out.println("grades: " + grades[i]);

        }

        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + grades[i];
        }
        System.out.println("Grades total: " + sum);
        System.out.println("Grades average: " + sum/grades.length);
        System.out.println("Grades length: " + grades.length);


        System.out.println("*******************************************************");

        List<String> cities = new ArrayList<String>();

        String continueFlag = "n";
        String city = sc.nextLine();
        do {
            System.out.print("Enter a City: ");
            city = sc.nextLine();
            cities.add(city);
            System.out.print("Add another City? (y/n): ");
            continueFlag = sc.nextLine();
        } while (continueFlag.equalsIgnoreCase("y"));
        Collections.sort(cities);
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        System.out.print("Cities Size: " + cities.size());

    }
}
