package com.epam.string_task;

import java.util.List;

/**
 * Created by yurii on 11/23/16.
 */
public interface StringAnalyzerPrinter {
    void printLettersCount();

    void printEqualsIgnoreCase(String otherString);

    void printInUpperCase();

    void printInLowerCase();

    void printAllIndicesOfWord(String string);

    void printAfterReplace(String str1, String str2);

    void printAmountOfWordOccurrences(String str);
}
