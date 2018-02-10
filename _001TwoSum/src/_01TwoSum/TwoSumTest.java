package _01TwoSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	@Test
	void test() {
		TwoSum test = new TwoSum();
		assertEquals("[0, 1]", test.printArray(test.twosum1(new int[] { 2, 7, 11, 15 }, 9)));
		assertEquals("[0, 1]", test.printArray(test.twosum2(new int[] { 2, 7, 11, 15 }, 9)));
	}

}
