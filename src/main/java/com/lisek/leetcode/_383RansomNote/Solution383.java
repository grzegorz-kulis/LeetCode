package com.lisek.leetcode._383RansomNote;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        boolean answer = false;

        List<Integer> ransomNoteInts = ransomNote.chars().boxed().sorted(Integer::compareTo).toList();
        System.out.println("sorted ransom ints:" + ransomNoteInts.toString());

        List<Integer> magazineInts = magazine.chars().boxed().sorted(Integer::compareTo).toList();
        System.out.println("sorted magazine ints:" + magazineInts.toString());

        Queue<Integer> queue = new PriorityQueue<>(magazineInts);

        int counterOfMatches = 0;
        for (Integer i : ransomNoteInts) {

            while (!queue.isEmpty()) {
                Integer poll = queue.poll();

                System.out.println("Comparing ransom: " + i + " to magazine: " + poll);
                if (i.equals(poll)) {
                    counterOfMatches++;
                    answer = true;
                    break;
                }
                else {
                    answer = false;
                }
            }
        }

        if (counterOfMatches != ransomNoteInts.size()) return false;

        return answer;
    }
}
