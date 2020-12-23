package com.mamakos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        BufferedReader br = new BufferedReader( new FileReader("wordlist.txt") );
//        Solution1Readable x = new Solution1Readable();
        Solution2Fast x = new Solution2Fast();
        String word;
        while ((word = br.readLine()) != null) {
            x.add(word);
        }
        br.close();

        List<String> results = x.findTwoSubWords();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("total: " + duration);
//        System.out.println(results);

    }
}
