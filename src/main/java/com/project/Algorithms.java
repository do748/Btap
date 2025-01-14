package com.project;

import java.util.*;

public class Algorithms {

    // Tìm số lớn thứ hai trong mảng
    public static Integer findSecondLargest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return null; // Không đủ phần tử
        }
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second == Integer.MIN_VALUE ? null : second;
    }

    // Kiểm tra chuỗi đối xứng (Palindrome)
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Đếm số lần xuất hiện của các từ trong danh sách
    public static Map<String, Integer> countWordOccurrences(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    // Tìm số phần tử duy nhất trong danh sách
    public static int countUniqueElements(List<Integer> elements) {
        if (elements == null) return 0;
        Set<Integer> uniqueElements = new HashSet<>(elements);
        return uniqueElements.size();
    }

    // Tìm giá trị lớn nhất trong ma trận
    public static int findMaxInMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix cannot be null or empty");
        }
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                max = Math.max(max, value);
            }
        }
        return max;
    }
}

