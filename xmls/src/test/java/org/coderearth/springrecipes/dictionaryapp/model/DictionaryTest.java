package org.coderearth.springrecipes.dictionary.model;

import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		System.out.println(dict);
		dict.addWord("hello", "hi2");
		dict.addWord("computer", "laptop");
		System.out.println(dict);
	}

	@Test
	public void testLookup() throws Exception {
		dict.addWord("hello", "hi");
		System.out.println(dict.lookup("hello"));
		System.out.println(dict.lookup("hi"));
	}

	@Test
	public void testContains() {
		dict.addWord("hello", "hi");
		System.out.println(dict);
		System.out.println(dict.contains("hello"));
		System.out.println(dict.contains("hello2"));
	}
}