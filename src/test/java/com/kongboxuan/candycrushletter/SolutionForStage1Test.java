package com.kongboxuan.candycrushletter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Test Case for Solution 1
 */
public class SolutionForStage1Test {
    @Test
    public void testCase001() {
        List<String> output = SolutionForStage1.solution("aabcccbbad");

        Assertions.assertEquals("d", output.get(output.size() - 1));
    }

    @Test
    public void testCase002() {
        List<String> output = SolutionForStage1.solution("aabcccbba");

        Assertions.assertTrue(output.get(output.size() - 1).isEmpty());
    }
}
