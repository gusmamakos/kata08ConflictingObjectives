package com.mamakos;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution1ReadableTest {

    @Test
    public void findTwoWords(){
        Solution1Readable x = new Solution1Readable();
        x.add("albums");
        x.add("Al");
        x.add("BUMS");
        x.findTwoSubWords();
        List<String> results = x.getResults();
        String expected = "al + bums";
        assertEquals("Didn't find sub words", expected, results.get(0));
    }
    @Test
    public void dontFindTwoWords(){
        Solution1Readable x = new Solution1Readable();
        x.add("albums");
        x.add("barely");
        x.findTwoSubWords();
        List<String> results = x.getResults();
        assertEquals( "failed", 0, results.size());

    }
}