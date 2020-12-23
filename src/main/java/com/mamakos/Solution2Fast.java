package com.mamakos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2Fast {
    private final Set<String> words = new HashSet<>();
    private final List<String> sixLetterWords = new ArrayList<>();

    public void add(String word) {
        if (word.length() == 6) {
            sixLetterWords.add(word);
        } else if (word.length() < 6) {
            words.add(word.toLowerCase());
        }
    }

    public List<String> findTwoSubWords() {
        List<String> result = new ArrayList<>();
        for (String word : sixLetterWords) {
            for (int i = 1; i < word.length(); i++) {
                String word1 = word.substring(0, i);
                String word2 = word.substring(i);
                if (words.contains(word1) && words.contains(word2)) {
                    result.add(word1 + " + " + word2);
                }
            }
        }
        return result;
    }
}