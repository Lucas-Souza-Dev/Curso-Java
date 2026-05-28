package Secao15Arquivos.application.Exercicio03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Ler um arquivo .txt
public class Program {
    public static void main(String[] args) {
        String path = "c:\\temp\\in.txt";

        //FileReader fr = null; // essencial para ter uma referencia dos dados de entrada.
        //BufferedReader br = null; // essencial para otimizar a leitura de arquivos.

        // Try with resources
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
           // fr = new FileReader(path);
           // br = new BufferedReader(fr);

            String line = br.readLine();// vira Null quando não há mais linhas
            while (line != null){
                line = br.readLine();
            }
        }
         catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
        /*finally {
            try{
                br.close();
                fr.close();
            }
            catch (IOException e){
                e.printStackTrace();// Imprime as linhas vermelhas
            }

        }*/
    }
}
