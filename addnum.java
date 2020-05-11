package JUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class numbers {
	@Test
	public void test1() {
		jUnitTesting junit = new jUnitTesting();
		int add1= junit.addNumbers(77, 99);
		assertEquals(176,result);
	}
	@Test
	public void test2() {
		jUnitTesting junit = new jUnitTesting();
		int add2= junit.addNumbers(19, 8);
		assertEquals(27,result);
	}

}
