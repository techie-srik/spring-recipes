package org.coderearth.springrecipes.dictionaryapp.dao;

import java.util.Set;

/**
 * Created by kunal_patel on 22/11/15.
 */
public interface DictionaryDao {

	public Set<String> lookup(final String aWord);

	public void addWord(final String aWord, final String... aMeanings);

}
