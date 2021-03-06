package org.coderearth.springrecipes.dictionaryapp.services;

import com.google.common.collect.Sets;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;



import static org.junit.Assert.*;

/**
 * Created by kunal_patel on 28/11/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader= AnnotationConfigContextLoader.class )

public class DictionaryAppTest {

	private final Logger logger = Logger.getLogger(getClass());
	
	
	
	@Autowired
	private DictionaryApp dictionaryApp;

	@Before
	public void setUp() throws Exception {
		logger.debug("Setting up " + getClass().getSimpleName());
		logger.debug("Setup is done " + getClass().getSimpleName());
	}

	@After
	public void tearDown() throws Exception {
		logger.debug("Destroying " + getClass().getSimpleName());
		logger.debug("Destroyed " + getClass().getSimpleName());
	}

	@Test
	public void testDictionaryApp() {
		logger.debug("Inside testDictionaryApp()");
		assertNotNull(dictionaryApp);
		assertTrue(dictionaryApp.isDictionaryReadyForLookup());
		assertEquals(dictionaryApp.lookup("hello"), Sets.newHashSet("hi"));
		assertEquals(dictionaryApp.lookup("hi"), Sets.newHashSet("hello", "greeting"));
	}
}