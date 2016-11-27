package com.epam.string_task;

import java.util.List;
import java.util.Map;

/**
 * Created by yurii on 11/23/16.
 */
public interface StringAnalyzer {
    int countLetters();

    boolean equalsIgnoreCase(String otherString);

    String toUpperCase();

    String toLowerCase();

    List<Integer> getAllIndicesOfWords(String string);

    String replace(String str1, String str2);

//    Map<String, Integer> countWords();

    int countWordOccurrences(String str);

    String getString();

    void setString(String newString);
}
