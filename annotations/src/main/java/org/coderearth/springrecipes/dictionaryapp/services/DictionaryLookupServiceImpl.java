package org.coderearth.springrecipes.dictionaryapp.services;

import org.coderearth.springrecipes.dictionaryapp.dao.DictionaryDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Created by kunal_patel on 16/11/15.
 */
public class DictionaryLookupServiceImpl implements DictionaryLookupService {

    @Autowired
    private DictionaryDao dictionaryDao;

    public DictionaryLookupServiceImpl(DictionaryDao dictionaryDao) {
        this.dictionaryDao = dictionaryDao;
    }

    @Override
    public Set<String> lookup(String aWord) {
        return dictionaryDao.lookup(aWord);
    }
}
