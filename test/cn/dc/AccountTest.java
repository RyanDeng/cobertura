package cn.dc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	@SuppressWarnings("serial")
    	private Account account;
	@Before
	public void setUp() throws Exception {
		account=new Account();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHelloWorld() {
		assertEquals(account.helloWorld(), "Hello world!");
	}
	@Test
	public void testAbs(){
		assertEquals(account.abs(28), 28);
		assertEquals(account.abs(-728), 728);
		assertEquals(account.abs(0), 0);
	}

}
