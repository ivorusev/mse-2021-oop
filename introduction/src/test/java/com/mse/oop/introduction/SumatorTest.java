package com.mse.oop.introduction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumatorTest {

	@Test
	public void testSumator() {
		int actual = Sumator.sum(2, 2);
		assertEquals(actual, 4);
	}

}
