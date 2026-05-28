package Secao15Arquivos.application.Exercicio02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
