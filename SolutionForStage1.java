package com.kongboxuan.candycrushletter;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for Stage1：implement with custom stack structure
 */
public class SolutionForStage1 {

    public static List<String> solution(String input) {
        List<String> output = new ArrayList<>();

        char[] array = input.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            boolean res = stack.push(c);
            if (res) {
                output.add(stack + input.substring(i + 1));
            }
        }
        boolean res = stack.refresh();
        if (res) {
            output.add(stack.toString());
        }

        return output;
    }
}
