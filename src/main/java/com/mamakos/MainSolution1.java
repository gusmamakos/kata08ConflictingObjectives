package com.mamakos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainSolution1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader( new FileReader("wordlist.txt") );
        Solution1Readable x = new Solution1Readable();
        String word;
        while ((word = br.readLine()) != null) {
            x.add(word);
        }
        br.close();
        x.findTwoSubWords();
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Duration: " + duration + "ms");
    }
}