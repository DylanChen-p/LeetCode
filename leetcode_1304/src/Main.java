/*
https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

Given an integer n, return any array containing n unique integers such that they add up to 0.
 */

public class Main {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int start = 0;
        int end = n - 1;
        int diff = 1;
        while (start < end) {
            result[start] = diff;
            result[end] = -diff;
            start++;
            end--;
            diff++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}