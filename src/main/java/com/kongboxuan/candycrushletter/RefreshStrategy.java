package com.kongboxuan.candycrushletter;

import java.util.ArrayList;

public interface RefreshStrategy {
    /**
     * Refresh stack operation method
     *
     * @param array stack
     * @return Is there a refresh stack during the stack pressing process
     */
    boolean refresh(ArrayList<Character> array);
}
