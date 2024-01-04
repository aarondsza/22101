package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addmuldivTest {

	@Test
	void test() {
		addmuldiv a1 = new  addmuldiv();
		int expected =4;
		int actual=a1.add(2,2);
		assertEquals(expected,actual);
	}
	@Test
	void multest() {
		addmuldiv m1 = new  addmuldiv();
		int expected =8;
		int actual=m1.mul(2,2,2);
		assertEquals(expected,actual);
		
	}
	@Test
	void divtest() {
		addmuldiv m3 = new  addmuldiv();
		int expected =2;
		int actual=m3.div(10,5);
		assertEquals(expected,actual);

}
}