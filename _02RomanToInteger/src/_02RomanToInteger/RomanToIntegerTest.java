package _02RomanToInteger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

	RomanToInteger ri;

	@BeforeEach
	void setUp() throws Exception {
		ri = new RomanToInteger();
	}

	@Test
	void test() {
		assertEquals(1, ri.romanToInt("I"));
		assertEquals(4, ri.romanToInt("IV"));
		assertEquals(9, ri.romanToInt("IX"));
		assertEquals(11, ri.romanToInt("XI"));
		assertEquals(18, ri.romanToInt("XVIII"));
		assertEquals(37, ri.romanToInt("XXXVII"));
		assertEquals(47, ri.romanToInt("XLVII"));
		assertEquals(64, ri.romanToInt("LXIV"));
		assertEquals(72, ri.romanToInt("LXXII"));
		assertEquals(94, ri.romanToInt("XCIV"));
		assertEquals(530, ri.romanToInt("DXXX"));
		assertEquals(707, ri.romanToInt("DCCVII"));
		assertEquals(890, ri.romanToInt("DCCCXC"));
		assertEquals(1800, ri.romanToInt("MDCCC"));
	}

}
