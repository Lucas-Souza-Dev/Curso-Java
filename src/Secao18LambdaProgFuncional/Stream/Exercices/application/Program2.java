package Secao18LambdaProgFuncional.Stream.Exercices.application;

import Secao18LambdaProgFuncional.Stream.Exercices.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Avarage price: ");
        double avPrice = sc. nextDouble();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> emp = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                emp.add(new Employee(fields[0],
                        fields[1],
                        Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            List<String> emails = emp.stream().filter(e -> e.getSalary() > avPrice).map(e -> e.getEmail()).collect(Collectors.toList());
            double sumOfSalary = emp.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x,y) -> x + y);

            emails.forEach(System.out::println);
            System.out.println(String.format("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",sumOfSalary)));
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        sc.close();
    }
}
