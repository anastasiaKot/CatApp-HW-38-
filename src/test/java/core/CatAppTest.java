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
	public static void BeforeClass() throws Exception {}
	@AfterClass
	public static void AfterClass() throws Exception {}
	@Before
	public void before() throws Exception {}
	@After
	public void after() throws Exception {}
	
	@Test
	public void test_01_assertEquals_Positive() 
	{
		assertEquals("String not the same", "Testing JUnit 4", App.s);
	}
	@Test
	public void test_02_asertEquals_Negative() 
	{
		assertEquals("String not the same", "Testing JUnit 44", App.s);
	}
	@Ignore
	@Test
	public void test_03_assertEquals_Ignored()
	{
		assertEquals("String not the same", "Testing JUnit 4", App.s);
	}
	
	@Test
	public void test_04_assertSame_Positive()
	{
		assertSame("Integer not the same.", 55,App.i);
	}
	@Test
	public void test_05_assertSame_Negative()
	{
		assertSame("Integer not the same.", 5,App.i);
	}
	@Ignore
	@Test
	public void test_06_assertSame_Ignored()
	{
		assertSame("Integer not the same.", 55,App.i);
	}
	@Test
	public void test_07_assertFalse_Positive()
	{
		assertTrue("Boolean should be false", App.f);
	}

	@Test
	public void test_08_assertFalse_Negative()
	{
		assertTrue("Boolean should be false", App.t);
	}
	@Test
	public void test_09_assertTrue_positive()
	{
		assertTrue("Boolean should be true", App.f);
	}
	@Test
	public void test_10_assertTrue_negative()
	{
		assertTrue("Boolean should be true", App.t);
	}
	
}
