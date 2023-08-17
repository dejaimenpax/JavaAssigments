package Ejercicio3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        int totalMarks = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        totalMarks+= scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        totalMarks+= scanner.nextInt();

        double average = totalMarks / 3.0;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + average);

        if (average > 90) {
            System.out.println("Grade: A+");
        } else if (average > 75) {
            System.out.println("Grade: A");
        } else if (average > 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        scanner.close();
    }

}
