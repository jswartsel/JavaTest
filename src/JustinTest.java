import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JustinTest {

	@Test
	public final void testBeCool() {
		Justin j = new Justin();
		assertTrue(j.HowCoolAmI() > 50);
	}

}
