package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {
	static RemoveDuplicates instance;
	
	@BeforeAll
	public static void setup() {
		instance = new RemoveDuplicates();
	}

	@Test
	void test() {
		int[] nums = {1, 1, 2};
		assertEquals(2, instance.removeDuplicates(nums));
	}
	
	@Test
	void test1() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		assertEquals(5, instance.removeDuplicates(nums));
	}
}
