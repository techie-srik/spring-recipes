package org.coderearth.springrecipes.dictionaryapp.services;

import org.coderearth.springrecipes.dictionaryapp.dao.DictionaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by kunal_patel on 28/11/15.
 */
@Service
public class DictionaryLookupService {

	@Autowired
	private DictionaryDao dictionaryDao;

	public void setDictionaryDao(DictionaryDao dictionaryDao) {
		this.dictionaryDao = dictionaryDao;
	}

	public DictionaryLookupService() {
		this.dictionaryDao = new DictionaryDao();
	}

	public DictionaryLookupService(DictionaryDao dictionaryDao) {
		this.dictionaryDao = dictionaryDao;
	}

	public Set<String> lookup(String aWord) {
		return dictionaryDao.lookup(aWord);
	}

	public boolean isLookupReady() {
		return (dictionaryDao != null) && (dictionaryDao.size() > 0) ? true : false;
	}
}
