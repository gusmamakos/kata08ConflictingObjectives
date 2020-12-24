package com.mamakos;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution2Fast{
    private final Set<String> words = new HashSet<>();
    private final Queue<String> sixLetterWords = new ConcurrentLinkedQueue<>();
    private final Queue<String> results = new ConcurrentLinkedQueue<>();


    public void add(String word) {
        if (word.length() == 6) {
            sixLetterWords.offer(word);
        } else if (word.length() < 6) {
            words.add(word.toLowerCase());
        }
    }

    public void findTwoSubWords() {
        while(sixLetterWords.peek() != null){
            String word = sixLetterWords.poll();
            for (int i = 1; i < word.length(); i++) {
                String word1 = word.substring(0, i);
                String word2 = word.substring(i);
                if (words.contains(word1) && words.contains(word2)) {
                    results.offer(word1 + " + " + word2);
//                    System.out.println(word1 + " + " + word2 + " -- " + Thread.currentThread().getName());
                }
            }
        }
    }

    public List<String> getResults() {
        List<String> resultsList = new ArrayList<>(results);
        return resultsList;
    }
}