package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by BUBBABAIRD on 4/25/17.
 */
public class MainTest {
    @Test
    public void fibonacci() throws Exception {

        assertArrayEquals(Main.fibonacci(9), new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34});
    }

}