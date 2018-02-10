package _143Sum;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, 4 }));
		System.out.println(threeSum(new int[] { 2, 2, 2, 2, 0, 0, -1, -1, 1, 1 }));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0)
				break;
			if (i == 0 || nums[i] != nums[i - 1]) {
				int p1 = i + 1, p2 = nums.length - 1, target = 0 - nums[i];
				while (p1 < p2) {
					if (nums[p1] + nums[p2] == target) {
						list.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
						while (p1 < p2 && nums[p1] == nums[p1 + 1])
							p1++;
						while (p1 < p2 && nums[p2] == nums[p2 - 1])
							p2--;
						p1++;
						p2--;
					} else if (nums[p1] + nums[p2] < target) {
						while (p1 < p2 && nums[p1] == nums[p1 + 1])
							p1++;
						p1++;
					} else {
						while (p1 < p2 && nums[p2] == nums[p2 - 1])
							p2--;
						p2--;
					}

				}
			}
		}
		return list;
	}
}
