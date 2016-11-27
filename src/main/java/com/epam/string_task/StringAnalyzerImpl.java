package com.epam.string_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yurii on 11/23/16.
 */
public class StringAnalyzerImpl implements StringAnalyzer {
    private String string;

    public StringAnalyzerImpl(String string) {
        this.string = string;
    }

    @Override
    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String getString() {
        return string;
    }

    @Override
    public int countLetters() {
        int lettersCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                lettersCount++;
            }
        }
        return lettersCount;
    }

    @Override
    public boolean equalsIgnoreCase(String anotherString) {
        return string.equalsIgnoreCase(anotherString);
    }

    @Override
    public String toUpperCase() {
        return string.toUpperCase();
    }

    @Override
    public String toLowerCase() {
        return string.toLowerCase();
    }

    @Override
    public List<Integer> getAllIndicesOfWords(String word) {
        List<Integer> indices = new ArrayList<>();
        int index = string.indexOf(word);
        while (index >= 0) {
            indices.add(index);
            index = string.indexOf(word, index + 1);
        }
        return indices;
    }

    @Override
    public String replace(String str1, String str2) {
        return string.replace(str1, str2);
    }

//    @Override
//    public Map<String, Integer> countWords() {
//        Map<String, Integer> wordsCountMap = new HashMap<>();
//        for(String word : string.split("\\P{L}+")) {
//            if(!wordsCountMap.keySet().contains(word)) {
//                wordsCountMap.put(word, 1);
//            } else {
//                wordsCountMap.get(word);
//            }
//        }
//        return null;
//    }

    @Override
    public int countWordOccurrences(String str) {
        return getAllIndicesOfWords(str).size();
    }
}
