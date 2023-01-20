package com.lisek.leetcode._705DesignHashSet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.lisek.leetcode._705DesignHashSet.Solution705.*;

class Solution705Test {

    Solution705 solution705 = new Solution705();

    @Test
    void test() {

        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);
        myHashSet.add(2);
        assertTrue(myHashSet.contains(1));
        assertFalse(myHashSet.contains(3));
        myHashSet.add(2);
        assertTrue(myHashSet.contains(2));
        myHashSet.remove(2);
        assertFalse(myHashSet.contains(2));
    }


}