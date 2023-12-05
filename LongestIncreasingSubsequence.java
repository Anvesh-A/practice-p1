package Phase1;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class LongestIncreasingSubsequence {
	    public static List<Integer> value(int[] nums) {
	        int n = nums.length;
	        int[] list = new int[n];
	        Arrays.fill(list, 1);

	        int[] prevIndex = new int[n];
	        Arrays.fill(prevIndex, -1);

	        int maxLength = 1;
	        int lastIndex = 0;

	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j] && list[i] < list[j] + 1) {
	                    list[i] = list[j] + 1;
	                    prevIndex[i] = j;
	                }
	            }
	            if (list[i] > maxLength) {
	                maxLength = list[i];
	                lastIndex = i;
	            }
	        }

	        List<Integer> longestIncreasingSubsequence = new ArrayList<>();
	        while (lastIndex >= 0) {
	            longestIncreasingSubsequence.add(nums[lastIndex]);
	            lastIndex = prevIndex[lastIndex];
	        }
	        // Reverse the list to get the correct order
	        List<Integer> reversed = new ArrayList<>();
	        for (int i = longestIncreasingSubsequence.size() - 1; i >= 0; i--) {
	            reversed.add(longestIncreasingSubsequence.get(i));
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	    	
	        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
	        
	        List<Integer> longestIncreasingSubsequence = value(nums);

	        System.out.println("Longest Increasing Subsequence:");

	        for (int num : longestIncreasingSubsequence) {
	            System.out.print(num + " ");
	        }
	    }
	}



