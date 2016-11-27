package com.epam.string_task;

import java.util.Arrays;

/**
 * Created by yurii on 11/24/16.
 */
public class ConsoleStringAnalyzerPrinter implements StringAnalyzerPrinter {

    private StringAnalyzer analyzer;

    public ConsoleStringAnalyzerPrinter(StringAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    @Override
    public void printLettersCount() {
        System.out.printf("--> '%s'%n\t#Amount of letters: %d%n",
                analyzer.getString(), analyzer.countLetters());
    }

    @Override
    public void printEqualsIgnoreCase(String otherString) {
        System.out.printf("--> '%s' and '%s'%n\t#Equals ignoring case: %b%n",
                analyzer.getString(), otherString, analyzer.equalsIgnoreCase(otherString));
    }

    @Override
    public void printInUpperCase() {
        System.out.printf("--> '%s'%n\t#To upper case: %s%n",
                analyzer.getString(), analyzer.toUpperCase());
    }

    @Override
    public void printInLowerCase() {
        System.out.printf("--> '%s'%n\t#To lower case: %s%n",
                analyzer.getString(), analyzer.toLowerCase());
    }

    @Override
    public void printAllIndicesOfWord(String word) {
        System.out.printf("--> '%s'%n\t#Indices of word '%s': %s%n", analyzer.getString(),
                word, Arrays.toString(analyzer.getAllIndicesOfWords(word).toArray()));
    }

    @Override
    public void printAfterReplace(String str1, String str2) {
        System.out.printf("--> '%s'%n\t#Replace '%s' with '%s': %s%n",
                analyzer.getString(), str1, str2, analyzer.replace(str1, str2));
    }

    @Override
    public void printAmountOfWordOccurrences(String word) {
        System.out.printf("--> '%s'%n\t#Amount of '%s' word: %d%n",
                analyzer.getString(), word, analyzer.countWordOccurrences(word));
    }
}
