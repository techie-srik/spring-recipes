package org.coderearth.springrecipes.dictionaryapp.services;

import org.apache.log4j.Logger;
import org.coderearth.springrecipes.dictionaryapp.builder.InMemoryDictionaryBuilder;
import org.coderearth.springrecipes.dictionaryapp.dao.DictionaryDao;
import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kunal_patel on 28/11/15.
 */
@Service
public class DictionaryBuilderService {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private InMemoryDictionaryBuilder dictionaryBuilder;

	@Autowired
	private DictionaryDao dictionaryDao;

	public void setDictionaryBuilder(InMemoryDictionaryBuilder dictionaryBuilder) {
		this.dictionaryBuilder = dictionaryBuilder;
	}

	public DictionaryDao getDictionaryDao() {
		return dictionaryDao;
	}

	public void setDictionaryDao(DictionaryDao dictionaryDao) {
		this.dictionaryDao = dictionaryDao;
	}

	public DictionaryBuilderService() {
		logger.info("Creating DictionaryBuilderService() !!");
		// this.dictionaryBuilder = new InMemoryDictionaryBuilder();
		// this.dictionaryDao = new DictionaryDao();
		logger.info("Created DictionaryBuilderService() !!");
	}

	public DictionaryBuilderService build() {
		dictionaryDao.populateDictionary(dictionaryBuilder.build());
		return this;
	}
}
