package com.android.ryan.w8d1homework;

public class WordCount {

    String wordsToBeCounted;

    public void WordCount(String wordsToBeCounted){
        this.wordsToBeCounted = wordsToBeCounted;
    }

    public static int countWords(String words){
        String[] wordsArray = words.trim().split("\\s+");
        return wordsArray.length;
    }


}
