package com.lisek.leetcode._205IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {

    public boolean isIsomorphic(String s, String t) {

        boolean answer = true;

        Map<Character, Character> characterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);

            if (characterMap.containsKey(c) || characterMap.containsValue(c1)) {
                if (characterMap.getOrDefault(c, Character.MIN_VALUE) != c1)
                    return false;
            }

            characterMap.put(c, c1);
        }


        return answer;
    }
}
