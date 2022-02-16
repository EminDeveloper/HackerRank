package hackerRank.days.fourth;

import java.io.*;
import java.util.*;

public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        age = (initialAge >= 0) ? initialAge : 0;
        if(age == 0){
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String s = "";
        if(age < 13){
            s = "young.";
        }
        else if(age > 12 && age < 18){
            s = "a teenager.";
        }
        else s = "old.";
        System.out.println("You are " + s);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}