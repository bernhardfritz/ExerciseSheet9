import static org.junit.Assert.*;

import org.junit.Test;

public class JoinerTest {

	@Test
	public void test() {
		JoinerExample j=new JoinerExample();
		assertEquals("Harry; Ron; Hermione", j.join("; ", "Harry", null, "Ron", "Hermione"));
	}

}
