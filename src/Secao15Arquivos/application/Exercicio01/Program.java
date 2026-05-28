package Secao15Arquivos.application.Exercicio01;

import Secao15Arquivos.application.Exercicio01.entities.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Item> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String filePath = sc.nextLine();

        File sourceFile = new File(filePath);
        String sourceFolder = sourceFile.getParent(); // Retorna o nome de caminho abstrato do "pai".

        boolean sucess = new File(sourceFolder + "\\out").mkdir();

        String targetFile = sourceFolder + "\\out\\sumary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String itemCsv = br.readLine();
            while (itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Item(name, quantity, price));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
                for (Item i : list){
                    bw.write(i.getName()+", "+String.format("%.2f", i.calculateTotalValue()));
                    bw.newLine();
                }
                System.out.println(targetFile + " CREATED!");

            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: "+ e.getMessage());
        }
        sc.close();
    }
}
