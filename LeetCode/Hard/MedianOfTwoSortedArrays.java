package LeetCode.Hard;

import java.util.Arrays;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] array = new int[size];
        for (int i = 0; i < nums1.length; i++) {
            array[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            array[i + nums1.length] = nums2[i];
        }
        Arrays.sort(array);
        if (size % 2 == 1) {
            return array[size / 2];
        }

        return (array[size / 2] + array[size / 2 - 1]) / (double) 2;
    }

    public static void main(String[] args) {
        double answer = findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 });
        System.out.println(answer);
    }
}