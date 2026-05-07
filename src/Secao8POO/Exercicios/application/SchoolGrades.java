package Secao8POO.Exercicios.application;

import Secao8POO.Exercicios.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter the student's name and their 3 grades: ");
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f %n", student.finalGrade());

        if (student.finalGrade() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.validation());
        }else{
            System.out.println("PASS");
        }
    }
}
