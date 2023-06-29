package com.kongboxuan.candycrushletter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Test Case for Solution 2d
 */
public class SolutionForStage2Test {
    @Test
    public void testCase001() {
        List<String> output = SolutionForStage2.solution("abcccbad");

        Assertions.assertEquals("d", output.get(output.size() - 1));
    }

    @Test
    public void testCase002() {
        List<String> output = SolutionForStage2.solution("abcccba");

        Assertions.assertTrue(output.get(output.size() - 1).isEmpty());
    }
}
