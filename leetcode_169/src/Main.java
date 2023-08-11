/*
https://leetcode.com/problems/majority-element/

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
always exists in the array.
*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    class Solution {
        public int majorityElement(int[] nums) {
            //Create and update the hashMap
            HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (!hashMap.containsKey(nums[i])) {
                    hashMap.put(nums[i], 1);
                } else {
                    hashMap.replace(nums[i], hashMap.get(nums[i]) + 1);
                }
            }

            //Get key for a given value
            int half = (nums.length / 2) + 1;
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() >= half) {
                    return entry.getKey();
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}