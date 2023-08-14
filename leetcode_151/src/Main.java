/*
https://leetcode.com/problems/reverse-words-in-a-string/

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only
have a single space separating the words. Do not include any extra spaces.
*/

class Solution {
    public String reverseWords(String s) {
        //Remove leading or trailing spaces, then separate with space
        String[] str = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = str.length-1; i >= 0; i--) {
            result.append(str[i]).append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}