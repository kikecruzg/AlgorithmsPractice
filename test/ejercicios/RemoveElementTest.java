package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RemoveElementTest {
	public static RemoveElement instance; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		instance = new RemoveElement();
	}

	@Test
	void test1() {
		int[] nums = {3,2,2,3};
		int val = 3;
		assertEquals(2, instance.removeElement(nums, val));
	}

}
