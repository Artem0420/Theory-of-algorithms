/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.util.StringUtils;

/**
 *
 * @author Ruslan
 */
public class Lab4 {
    private String text;
    private String[] words;
    
    public Lab4(String text)
    {
        this.text = text;
        String textWithoutPunctuation = text;
        textWithoutPunctuation = textWithoutPunctuation.replace("!", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("?", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("\"", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(",", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(":", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("(", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(")", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("\"", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(".", "");
        textWithoutPunctuation = textWithoutPunctuation.replace("'", "");
        textWithoutPunctuation = textWithoutPunctuation.replace(";", "");
        textWithoutPunctuation = textWithoutPunctuation.toLowerCase();
        words = textWithoutPunctuation.split("\\s+");
    }
    
    public String GetText()
    {
        return text;
    }
    
    public String GetClearedText()
    {
        return String.join(" ", words);
    }
    
    public int GetWordsNumber()
    {
        return words.length;
    }
    
    public int GetUniqueWordsNumber()
    {
        HashSet uniqueWords = new HashSet(Arrays.asList(words));
        return uniqueWords.size();
    }
    
    public String GetFirstNMostPopularWords(int n)
    {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
           if(dictionary.containsKey(words[i]))
               dictionary.put(words[i], dictionary.get(words[i]) + 1);
           else
               dictionary.put(words[i], 1);
        }
        List<Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);
        Object[] sortedArray = list.toArray();
        return Arrays.toString(Arrays.copyOfRange(sortedArray, 0, n));
    }
    
    public int GetNumberOfWordsThatNotContain(char letter)
    {
        int counter = 0;
        for (int i = 0; i < words.length; i++) 
            if(words[i].indexOf(Character.toLowerCase(letter)) == -1 &&
               words[i].indexOf(Character.toUpperCase(letter)) == -1)
                counter++;
        return counter;
    }
    
    public int GetNumberOfWordsThatContainLetters(int number)
    {
        int wordLength;
        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            wordLength = words[i].length();
            if(wordLength == number)
                counter++;
        }
        return counter;
    }
    
    public String MostPopularSequences(int number, int length)
    {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        int currentWordLength;
        String sequence;
        for (int i = 0; i < words.length; i++) {
            currentWordLength = words[i].length();
            for (int j = 0; j < currentWordLength - length; j++) {
                sequence = words[i].substring(j, j + length);
                if(dictionary.containsKey(sequence))
                    dictionary.put(sequence, dictionary.get(sequence) + 1);
                else
                   dictionary.put(sequence, 1);
            }
        }
        List<Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);
        Object[] sortedArray = list.toArray();
        return Arrays.toString(Arrays.copyOfRange(sortedArray, 0, number));
    }
}
