package com.lisek.leetcode._13RomanToInteger;

public class Solution13 {


    public int romanToInt(String s) {

        // III 3
        // LVIII 58
        // MCMXCIV 1994

        // 4

        int ans = 0, num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
                default -> num = 0;
            }
            if (4 * num < ans) ans -= num;
                    else ans += num;

        }

        return ans;
    }
}
