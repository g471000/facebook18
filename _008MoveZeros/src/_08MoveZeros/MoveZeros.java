package _08MoveZeros;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0].
 * 
 * Note: You must do this in-place without making a copy of the array. Minimize
 * the total number of operations.
 * 
 * @author Jieun Chon
 * @version 2/7/2018
 *
 */
public class MoveZeros {
	public static void main(String[] args) {
		int[] input = {0, 1, 0, 3, 12};
		System.out.println(printArr(input));
		System.out.println(printArr(moveZeros(input)));
		System.out.println(printArr(moveZerosOpt(input)));
	}
	
	public static int[] moveZerosOpt(int[] input) {
		int pos = 0;
		for(int i = 0; i < input.length; i++) {
			if(input[i] != 0) {
				int temp = input[i];
				input[i] = input[pos];
				input[pos] = temp;
				pos++;
			}
		}
		return input;
	}
	
	public static int[] moveZeros(int[] input) {
		int pos = 0;
		for(int i = 0; i < input.length; i++) {
			if(input[i] != 0) {
				input[pos++] = input[i];
			}
		}
		
		for(int i = pos; i < input.length; i++) {
			input[i] = 0;
		}
		return input;
	}
	
	public static String printArr(int[] input) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < input.length; i++) {
			sb.append(input[i]);
			if(i != input.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
