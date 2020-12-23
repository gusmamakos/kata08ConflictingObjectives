package com.mamakos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("wordlist.txt") );
        Solution1Readable x = new Solution1Readable();
        String word;
        while ((word = br.readLine()) != null) {
            x.add(word);
        }
        br.close();
        Date date = new Date();
        var start = date.getTime();
        System.out.println("start: " + start);
        List<String> results = x.findTwoSubWords();
        var end = date.getTime();
        System.out.println("end: " + start);
        System.out.println("total: " + (end - start));

        System.out.println(results);
    }
}
