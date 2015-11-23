package org.coderearth.springrecipes.dictionaryapp;

import org.coderearth.springrecipes.dictionaryapp.dao.DictionaryDao;
import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;
import org.coderearth.springrecipes.dictionaryapp.services.DictionaryBuilderService;
import org.coderearth.springrecipes.dictionaryapp.services.DictionaryLookupService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kunal_patel on 22/11/15.
 */
public class DictionarySpringApp {

	@Autowired
	private DictionaryBuilderService builder;

	@Autowired
	private DictionaryDao dictionaryDao;

	@Autowired
	private DictionaryLookupService lookupService;

	public DictionarySpringApp() {
		init();
	}

	private void init() {
		Dictionary dictionary = builder.build();
	}

	public static void main(String[] args) {
		/**
		 *
		 * Application workflow -
		 * Application init -
		 *  1. Build Dictionary
		 *  2. Assign built dictionary to dao
		 *
		 * Rest of the part -
		 *  1. use built dictionary for query so inject that dictionary to DAO
		 */

		
	}

}
