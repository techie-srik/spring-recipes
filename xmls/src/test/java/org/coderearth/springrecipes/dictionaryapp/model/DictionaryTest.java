package org.coderearth.springrecipes.dictionaryapp.model;

import com.google.common.collect.Sets;
import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kunal_patel on 15/11/15.
 */
public class DictionaryTest {

	private Dictionary dict = null;

	@Before
	public void setup() {
		dict = new Dictionary();
	}

	@After
	public void destroy() {
		dict = null;
	}

	@Test
	public void testAddWord() throws Exception {
		dict.addWord("hello", "hi");
		assertEquals(Sets.newHashSet("hi"), dict.lookup("hello"));
		dict.addWord("hello", "hi2");
		assertEquals(Sets.newHashSet("hi", "hi2"), dict.lookup("hello"));
		dict.addWord("computer", "laptop");
		assertEquals(Sets.newHashSet("laptop"), dict.lookup("computer"));
	}

	@Test
	public void testLookup() throws Exception {
		dict.addWord("hello", "hi");
		assertEquals(Sets.newHashSet("hi"), dict.lookup("hello"));
		assertNull(dict.lookup("null"));
	}

	@Test
	public void testContains() {
		dict.addWord("hello", "hi");
		assertTrue(dict.contains("hello"));
		assertFalse(dict.contains("hello2"));
	}
}