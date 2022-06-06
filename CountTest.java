package Remember_me;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CountTest {

	@Test
	public void test() {
		Count obj = new Count();
		int output = obj.countA("Abbas");
		assertEquals(2,output);
	}

}
