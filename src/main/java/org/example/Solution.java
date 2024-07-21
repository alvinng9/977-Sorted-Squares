package org.example;

import java.util.PriorityQueue;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> {
            return a - b;
        });
        for (int here : nums) {
            pq.offer(here*here);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = pq.remove();
        }
        return nums;
    }
}
