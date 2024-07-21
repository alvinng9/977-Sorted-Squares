package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortedSquaresTest() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0,1,9,16,100},
                solution.sortedSquares(new int[]{-4,-1,0,3,10}));
        assertArrayEquals(new int[]{4,9,9,49,121},
                solution.sortedSquares(new int[]{-7,-3,2,3,11}));
    }

}