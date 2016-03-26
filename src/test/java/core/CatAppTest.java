package core;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CatAppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("BeforeClass method will be executed before first test method starts");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("AfterClass method will be executed after last test method completed");

	}

	@Before
	public void setUp() throws Exception 
	{
	       System.out.println("Before method will execute before every test method");
	}

	@After
	public void tearDown() throws Exception 
	{
	       System.out.println("After method will execute after every test method");
	}

	@Test
	public void test_01_assertEquals_Positive() 
	{
		String s = "ok";
		
	    assertEquals("Test_01_assertEquals_Positive", "ok", s);
	}
	@Test
	public void test_02_asertEquals_Negative() 
	{
		String s = "ok";
		
	    assertEquals("Test_01_assertEquals_Positive", "bla", s);
	}
	@Ignore
	@Test
	public void test_03_assertEquals_Ignored()
	{
		String d = "bla";
		assertEquals("Test_02_assertEquals_Positive", "ok", d);
	}
	
	@Test
	public void test_04_assertSame_Positive()
	{
		Integer s = 125;
		assertSame("Should be the same", 125, s);
	}
	@Test
	public void test_05_assertSame_Negative()
	{
		Integer s = 125;
		assertSame("Should be the same", 14, s);
	}
	@Ignore
	@Test
	public void test_06_assertSame_Ignored()
	{
		Integer s = 125;
		assertSame("Should be the same", 125, s);
	}
	@Test
	public void test_07_assertFalse_Positive()
	{
		//Boolean F;
		assertFalse("Yes, it is false!", 5<2);
	}

	@Test
	public void test_08_assertFalse_Negative()
	{
		//Boolean F;
		assertFalse("No, it is not false!", 5>2);
	}
	@Test
	public void test_09_assertTrue_positive()
	{
		//Boolean F= true;
		assertTrue("Yes, it is true!", 5>2);
	}
	@Test
	public void test_10_assertTrue_negative()
	{
		//Boolean F= true;
		assertTrue("No, it is not true!", 5<2);
	}
	
}
