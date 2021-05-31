/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Lab5_1 {
    public static String text;
    private static String[] words;
    
    public Lab5_1(String text)
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
    
    public static String FindWord(String word)
    {
        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        for (int i = 0; i < words.length; i++)
            dictionary.put(i, words[i]);
        List<Map.Entry<Integer, String>> list = new ArrayList<>(dictionary.entrySet());
        int listLength = list.size();
        Map.Entry<Integer, String> key;
        int j;
        for (int i = 1; i < listLength; i++) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0) {
                if (key.getValue().compareTo(list.get(j).getValue()) > 0) {
                  break;
                }
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }

        return Integer.toString(binarySearch(list, word, 0, list.size() - 1) + 1);
    }
    
    public static int binarySearch(List<Map.Entry<Integer, String>> list,
        String x, int l, int r)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (list.get(mid).getValue().equals(x))
                return mid;
 
            if (list.get(mid).getValue().compareTo(x) > 0)
                return binarySearch(list, x, l, mid - 1);
 
            return binarySearch(list, x, mid + 1, r);
        }
 
        return -1;
    }
    
    public String GetMostPopularWords()
    {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
           if(dictionary.containsKey(words[i]))
               dictionary.put(words[i], dictionary.get(words[i]) + 1);
           else
               dictionary.put(words[i], 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        Sort(list);
        Collections.reverse(list);
        return Arrays.toString(list.toArray());
    }
    
    public String MostPopularSequences(int length)
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
        List<Map.Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        Sort(list);
        Collections.reverse(list);
        return Arrays.toString(list.toArray());
    }
    
    public void Sort( List<Entry<String, Integer>> list)
    {
        int listLength = list.size();
        Entry<String, Integer> key;
        int j;
        for (int i = 1; i < listLength; i++) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0) {
                if (key.getValue().compareTo(list.get(j).getValue()) > 0) {
                  break;
                }
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
