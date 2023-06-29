package com.kongboxuan.candycrushletter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    /**
     * Supplementary test: Executing the peek method when the test stack
     * is empty will throw an exception.
     */
    @Test
    public void testCase001() {
        Stack stack = new Stack();

        Assertions.assertThrows(IllegalArgumentException.class, stack::peek);
    }
}
