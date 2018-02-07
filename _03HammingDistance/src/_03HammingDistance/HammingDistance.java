package _03HammingDistance;

/**
 * The Hamming distance between two integers is the number of positions at which
 * the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 * 
 * Note 0 <= x, y < 2^31
 * 
 * 
 * Example
 * 
 * Input: x = 1, y = 4 Output: 2
 * 
 * Explanation:
 * 
 * 1 (0 0 0 1)
 * 
 * 4 (0 1 0 0) v v
 * 
 * 
 * The above check under the positions where the corresponding bits are
 * different.
 * 
 * @author Jieun Yoga
 *
 */
public class HammingDistance {
	public static void main(String[] args) {
		System.out.println(hammingDistanceSimple(1, 4));
		System.out.println(hammingDistance(1, 4));
	}

	public static int hammingDistanceSimple(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

	public static int hammingDistance(int x, int y) {
		int sum = 0;
		int xor = x ^ y;
		while (xor != 0) {
			sum += xor & 1;
			xor >>= 1;
		}
		return sum;
	}
}
