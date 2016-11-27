package com.epam.string_task;

/**
 * Created by yurii on 11/24/16.
 */
public class Runner {
    public static void main(String[] args) {

        StringAnalyzer stringAnalyzer = new StringAnalyzerImpl("dong-ding-dong");
        StringAnalyzerPrinter analyzerPrinter = new ConsoleStringAnalyzerPrinter(stringAnalyzer);

        analyzerPrinter.printLettersCount();
        analyzerPrinter.printEqualsIgnoreCase("dong-DING-dong");
        analyzerPrinter.printInUpperCase();
        analyzerPrinter.printInLowerCase();
        analyzerPrinter.printAllIndicesOfWord("dong");
        analyzerPrinter.printAfterReplace("dong", "dang");
        analyzerPrinter.printAmountOfWordOccurrences("dong");
    }
}
