package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;
public class AppTest 
{
	private static Arithmetic ar;
	@Test
	public void testWithPositivesValues() {
		System.out.println("AppTest.testWithPositivesValues()");
		float expected=400.0f;
		float actual=ar.sum(200.0f, 200.0f);
		assertEquals(expected, actual,"test1");
		}
	@Test
	public void testWithNegativesValues() {
		System.out.println("AppTest.testWithNegativesValues()");
		float expected=-400.0f;
		float actual=ar.sum(-200.0f, -200.0f);
		assertEquals(expected, actual,"test2");
		}
	@Test
	public void testWithMixedValues() {
		
		System.out.println("AppTest.testWithMixedValues()");
		float expected=300.0f;
		float actual=ar.sum(-100.0f, 400.0f);
		assertEquals(expected, actual,"test3");
		}
	
	@BeforeAll
	public static void setUp() {
		System.out.println("00000:::AppTest.setUpOnce()::BeforeAll");
		ar=new Arithmetic();
	}
	@AfterAll
	public static void tearDown() {
		System.out.println("AppTest.tearDown()");
		ar=null;
	}
	@BeforeEach
	public void setAtBefore() {
		System.out.println("AppTest.setAtBefore()");
		ar=new Arithmetic();
	}
	@AfterEach
	public void setAtAfter() {
		System.out.println("AppTest.setAtAfter()");
		ar=new Arithmetic();
	}
	
}
