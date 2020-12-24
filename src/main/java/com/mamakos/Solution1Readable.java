package com.mamakos;

import java.util.ArrayList;
import java.util.List;

public class Solution1Readable {
    private final List<String>  words = new ArrayList<>();
    private final List<String> sixLetterWords = new ArrayList<>();
    private final List<String> result = new ArrayList<>();

    public void add(String word){
        words.add(word.toLowerCase());
        if(word.length() == 6){
            sixLetterWords.add(word);
        }
    }
    public void findTwoSubWords(){
        for (String word: sixLetterWords){
            for (int i = 1; i < word.length(); i++) {
                String word1 = word.substring(0,i);
                String word2 = word.substring(i);
                if(words.contains(word1) && words.contains(word2)){
                    result.add(word1 + " + " + word2 );
                }
            }
        }
    }
    public List<String> getResults(){
        return result;
    }
}