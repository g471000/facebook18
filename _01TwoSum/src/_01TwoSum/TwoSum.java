package _01TwoSum;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Given nums = [2, 7, 11, 15] target = 9
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9 return [0, 1]
 * 
 * @author Jieun Yoga
 *
 */
public class TwoSum {

	public int[] twosum1(int[] input, int target) {
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[i] + input[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
	
	public int[] twosum2(int[] input, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < input.length; i++) {
			if(map.containsKey(target - input[i])) {
				return new int[] {map.get(target - input[i]), i};
			}
			map.put(input[i], i);
		}
		return null;
	}

	public String printArray(int[] input) {
		if (input == null) {
			return "";
		}
		return "[" + input[0] + ", " + input[1] + "]";
	}
}
