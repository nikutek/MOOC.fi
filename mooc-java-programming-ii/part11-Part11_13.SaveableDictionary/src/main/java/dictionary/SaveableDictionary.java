/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.file = file;
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                String word = parts[0];
                String translation = parts[1];
                this.add(word, translation);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean save() {
        ArrayList<String> alreadySaved = new ArrayList<>();
        try {
            PrintWriter writer = new PrintWriter(file);
            for (String word : dictionary.keySet()) {
                if(alreadySaved.contains(translate(word))){
                    continue;
                }
                writer.println(word + ":" + translate(word));
                alreadySaved.add(word);

            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

        return true;
    }

    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        String translation = translate(word);
        dictionary.remove(word);
        dictionary.remove(translation);
    }
}
