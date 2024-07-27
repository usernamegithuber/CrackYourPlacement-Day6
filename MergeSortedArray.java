package CrackYourPlacementDay6;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        sol.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of nums1 and nums2
        int p1 = m - 1; // Pointer for the last element in the m elements of nums1
        int p2 = n - 1; // Pointer for the last element in nums2
        int p = m + n - 1; // Pointer for the last position in nums1

        // Compare elements from the end of nums1 and nums2 and fill nums1 from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are any remaining elements in nums2, copy them to nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
