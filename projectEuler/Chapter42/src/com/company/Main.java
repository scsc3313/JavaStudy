package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private ArrayList<Integer> tripleNumbers;
    private ArrayList<Integer> tripleWordNumbers;

    Main(){
        tripleNumbers = new ArrayList<>();
        tripleWordNumbers = new ArrayList<>();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.control();
    }

    private void control() throws IOException {
        makeTripleNumbers();
        String string = readFile("words.txt");
        String[] names = string.split(",");
        makeTripleWords(names);
        int count = findTripleWord();
        System.out.println("TripleWord Count is "+count);
    }

    private int findTripleWord() {
        int count = 0;
        for(int i = 0; i < tripleNumbers.size() ; i++){
            for(int j = 0; j < tripleWordNumbers.size() ; j++){
                if(tripleNumbers.get(i) == tripleWordNumbers.get(j))
                    count++;
            }
        }
        return count;
    }

    private void makeTripleWords(String[] names) {
        for(int i = 0; i < names.length; i++){
            char namesAlphabet[] = names[i].toCharArray();
            int sum = 0;
            for(int j = 1; j < namesAlphabet.length - 1; j++){
                sum += namesAlphabet[j] - 64;
            }
            tripleWordNumbers.add(sum);
        }
    }

    private String readFile(String file) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        String line = "";

        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
        }
        catch (Exception e)
        {
            System.out.print(e);
            System.exit(1);
        }
        finally {
            try {
                bufferedReader.close();
            }
            catch (Exception e){
                System.out.println(e);
                System.exit(1);
            }
            finally {
                try{
                    fileReader.close();
                }
                catch (Exception e){
                    System.out.println(e);
                    System.exit(1);
                }
            }
        }

        return line;
    }

    private void makeTripleNumbers() {
        for(int i = 1 ; i < 25; i++){
            tripleNumbers.add(i*(i+1)/2);
        }
    }
}
