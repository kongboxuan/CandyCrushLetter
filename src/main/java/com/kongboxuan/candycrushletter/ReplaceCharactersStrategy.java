package com.kongboxuan.candycrushletter;

import java.util.ArrayList;

/**
 * Instead of removing the consecutively identical characters, replace them with a
 * single character that comes before it alphabetically.
 */
public class ReplaceCharactersStrategy implements RefreshStrategy {

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

            if (topElement != 'a') {
                stack.add((char) (topElement - 1));
            }

            ret = true;
        }

        return ret;
    }
}
