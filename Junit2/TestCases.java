package Junit2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.JUnit4;

import Junit.Example;

class TestCases {

	@BeforeClass
	public void testbeforeclass() {
		System.out.println("Before class");
		}
	//@AfterClass
	public void testafterclass() {
		System.out.println("After class");
		}
	@Before
	public void setup() {
	System.out.println("Before");
	}
	@After
	void test1() {
		
		System.out.println("After");
	}
	//@Test
	void test2() {
		Example M=new Example();
		int a=M.add(3, 5);
		assertEquals(a,8);
		System.out.println("Test2");
		
	}
	@Test
	void test3() {
		System.out.println("test3");
		
	}
@Test
	void test4() {
		System.out.println("test4");
		
	}




}
