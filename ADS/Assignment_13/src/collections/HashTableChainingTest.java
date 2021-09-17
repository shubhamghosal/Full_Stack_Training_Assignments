package collections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashTableChainingTest {
	
	HashTableChaining ht;
	
	@BeforeEach
	void setUp() throws Exception {
		ht = new HashTableChaining(10);
	}

	@AfterEach
	void tearDown() throws Exception {
		ht = null;
	}

	@Test
	void test1Add() {
		assertTrue(ht.add(5));
		
		
	}
	
	@Test
	void test4SearchNotFound() {
		assertTrue(ht.add(5));
		assertFalse(ht.search(25));
	}
	
	@Test
	void test5SearchNotFound() {
		assertTrue(ht.add(5));
		assertFalse(ht.search(2));
	}
	
	@Test
	void test6SearchFound() {
		assertTrue(ht.add(5));
		assertTrue(ht.search(5));
	}
	
	@Test
	void test7Delete() {
		assertTrue(ht.add(5));
		assertFalse(ht.add(5));
		assertTrue(ht.delete(5));
		assertFalse(ht.search(5));
	}
	
	
	

}
