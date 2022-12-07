package io.zipcoder.polymorphism;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        List<String> petList = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = Integer.parseInt(scan.nextLine());
        petList.add(String.valueOf(numOfPets));
        System.out.println("What kind of animal is each pet?");
        String typeOfPets = scan.nextLine();
        petList.add(typeOfPets);
        System.out.println("What would you like to name your pet or pets?");
        String nameOfPets = scan.nextLine();
        petList.add(nameOfPets);

        System.out.println("you have " + numOfPets + " " + typeOfPets + "s");
        System.out.println(petList);
    }
}
