package ufogame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UfoTest {
	
	Ufo ufo;
	
	//muss STATIC METHODE sein
	@BeforeAll
	static void begin() {
		System.out.println("@BeforAll");
	}

	//Vor jeder TestMethode wird ein neues Ufo erstellt
	@BeforeEach
	void init() {
		System.out.println("beforeEach");
		ufo = new Ufo(100, 100, 50, 50, 3, "");
	}
	
	@AfterEach
	void afterMethods() {
		System.out.println("@AfterEach");
	}
	
	//muss STATIC METHODE sein
	@AfterAll
	static void end() {
		System.out.println("@AfterAll");
	}
	
	@Test
	void testMove() {
		System.out.println("TestMove");
		ufo.move();
		assertEquals(103, ufo.getX());
	}
	
	@Test
	void testBla(){
		System.out.println("testBla");
		
	}
	

}
