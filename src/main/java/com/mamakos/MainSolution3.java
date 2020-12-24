package com.mamakos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class MainSolution3 {

    public static void main(String[] args) throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader( new FileReader("wordlist.txt") );
        Solution3Extendable x = new Solution3Extendable(10);
        String word;
        while ((word = br.readLine()) != null) {
            x.add(word);
        }
        br.close();

        int noOfThreads = 1;
        final CountDownLatch executionCompleted = new CountDownLatch(noOfThreads);
        for (int i = 0; i < noOfThreads; i++) {
            new Thread() {
                @Override
                public void run() {
                    x.findTwoSubWords();
                    executionCompleted.countDown();
                }
            }.start();
        }
        try
        {
            // Wait till the count down latch opens.
            executionCompleted.await();
            System.out.println("All over");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Duration: " + duration + "ms");
    }
}