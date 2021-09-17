package collections;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashTableFoldingHashedTest {

	HashTableFoldingHashed ht;

	@BeforeEach
	void setUp() throws Exception {
		ht = new HashTableFoldingHashed(10);
	}

	@AfterEach
	void tearDown() throws Exception {
		ht = null;
	}

	@Test
	void testAdd1() {
		assertTrue(ht.add(5));
	}

	@Test
	void testAdd2() {
		assertTrue(ht.add(5));
		assertTrue(ht.add(25));
		assertTrue(ht.add(13));
		assertTrue(ht.add(19));
		assertFalse(ht.add(5));
	}
	
	
	@Test
	void testAdd3() {
		assertTrue(ht.add(1));
		assertTrue(ht.add(2));
		assertTrue(ht.add(3));
		assertTrue(ht.add(4));
		assertTrue(ht.add(5));
		assertTrue(ht.add(6));
		assertTrue(ht.add(7));
		assertTrue(ht.add(8));
		assertTrue(ht.add(9));
		assertTrue(ht.add(10)); 
		assertFalse(ht.add(11)); 
		assertFalse(ht.add(12));
	}

	@Test
	void testSearch1() {

		assertTrue(ht.add(5));
		assertTrue(ht.add(25));
		assertTrue(ht.add(13));
		
		
		assertTrue(ht.search(5));
		assertTrue(ht.search(25));
		assertTrue(ht.search(13));
	}
	@Test
	void testSearch2() {

		assertTrue(ht.add(5));
		assertTrue(ht.add(25));
		assertTrue(ht.add(13));
		
		assertFalse(ht.search(0));
	}
	
	@Test
	void testDelete1() {

		assertTrue(ht.add(5));
		assertTrue(ht.add(25));
		assertTrue(ht.add(13));
		assertTrue(ht.delete(5));
		assertFalse(ht.search(5));
	}
	
	
	@Test
	void testDelete2() {

		assertTrue(ht.add(5));
		assertTrue(ht.add(25));
		assertTrue(ht.add(13));
		assertTrue(ht.delete(5));
		assertFalse(ht.delete(5));
		assertFalse(ht.search(5));
	}
}
