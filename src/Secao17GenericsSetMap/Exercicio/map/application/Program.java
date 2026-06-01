package Secao17GenericsSetMap.Exercicio.map.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.println("Enter file full path: ");
        String filePath = sc. nextLine();
        File file = new File(filePath);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String itemCsv = br.readLine();
            while (itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                int votesQuantity = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)){
                    int votesSoFar = votes.get(name);
                    votes.put(name,votesQuantity + votesSoFar);
                }else{
                    votes.put(name, votesQuantity);
                }
                itemCsv = br.readLine();
            }
            for (String key: votes.keySet()){
                System.out.println(key+": " + votes.get(key));
            }
        }catch (IOException e){
            System.out.println("Error reading file: "+ e.getMessage());
        }
    }
}
