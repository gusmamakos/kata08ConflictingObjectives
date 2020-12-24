package com.mamakos;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution3ExtendableTest {
    @Test
    public void wordSplitterTest(){
        Solution3Extendable x = new Solution3Extendable(6);
        x.add("banana");
        x.add("ban");
        x.add("ana");
        x.findTwoSubWords();
        var result = x.getResults();
        assertTrue("Failed", result.get(0).equals("ban + ana"));
    }

}