package com.kongboxuan.candycrushletter;

import java.util.ArrayList;

/**
 * For a given string that only contains alphabet characters a-z, if 3 or more consecutive
 * characters are identical, remove them from the string.
 */
public class RemoveCharactersStrategy implements RefreshStrategy {

    @Override
    public boolean refresh(ArrayList<Character> stack) {
        boolean ret = false;

        int top = stack.size() - 1;
        char topElement = stack.get(top);
        int count = 1;
        for (int i = top - 1; i >= 0; i--) {
            if (stack.get(i) != topElement) {
                break;
            }

            count++;
        }

        if (count >= 3) {
            for (int i = 0; i < count; i++) {
                stack.remove(stack.size() - 1);
            }

            ret = true;
        }

        return ret;
    }
}
