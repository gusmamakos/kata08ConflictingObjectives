package com.mamakos;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution3Extendable {
    private final Set<String> dictionary = new HashSet<>();
    private final Queue<String> targetWords = new ConcurrentLinkedQueue<>();
    private final Queue<String> results = new ConcurrentLinkedQueue<>();
    private int wordLength;

    public Solution3Extendable(int wordLength) {
        this.wordLength = wordLength;
    }

    public void add(String word) {
        if (word.length() == wordLength) {
            targetWords.offer(word);
        } else if (word.length() < wordLength) {
            dictionary.add(word.toLowerCase());
        }
    }

    public void findTwoSubWords() {
        while(targetWords.peek() != null){
            String word = targetWords.poll();
            for (int i = 1; i < word.length(); i++) {
                String word1 = word.substring(0, i);
                String word2 = word.substring(i);
                if (dictionary.contains(word1) && dictionary.contains(word2)) {
                    results.offer(word1 + " + " + word2);
                }
            }
        }
    }

    public List<String> getResults() {
        List<String> resultsList = new ArrayList<>(results);
        return resultsList;
    }
}