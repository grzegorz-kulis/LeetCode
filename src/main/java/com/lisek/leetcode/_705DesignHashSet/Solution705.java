package com.lisek.leetcode._705DesignHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution705 {


    static class MyHashSet {

        private List<Integer> list;

        public MyHashSet() {
            list = new ArrayList<>();
        }

        public void add(Integer key) {
            int i = Collections.binarySearch(list, key);
            if (i < 0)
                list.add(-i - 1, key);
        }

        public void remove(Integer key) {
            int i = Collections.binarySearch(list, key);
            if (i >= 0) {
                list.remove(i);
            }
        }

        public boolean contains(Integer key) {
            int i = Collections.binarySearch(list, key);
            return i >= 0;
        }

    }

}
