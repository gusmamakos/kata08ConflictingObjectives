package com.mamakos;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution2FastTest {

    @Test
    public void findTwoWords(){
        Solution2Fast x = new Solution2Fast();
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
        Solution2Fast x = new Solution2Fast();
        x.add("albums");
        x.add("barely");
        x.findTwoSubWords();
        List<String> results = x.getResults();
        assertEquals( "failed", 0, results.size());

    }
}