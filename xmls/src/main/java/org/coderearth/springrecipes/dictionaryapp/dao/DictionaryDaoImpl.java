package org.coderearth.springrecipes.dictionaryapp.dao;

import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;

import java.util.Set;

/**
 * Created by kunal_patel on 22/11/15.
 */
public class DictionaryDaoImpl implements DictionaryDao {

	private Dictionary dictionary;

	/**
	 * Default constructor - initializing empty Dictionary
	 */
	public DictionaryDaoImpl() {
		dictionary = new Dictionary();
	}

	/**
	 * Constructor with Dictionary embedded. Here Dictionary model should be coming from DictionaryBuilder class
	 *
	 * @param aDictionary
	 */
	public DictionaryDaoImpl(final Dictionary aDictionary) {
		this.dictionary = aDictionary;
	}

	@Override
	public Set<String> lookup(String aWord) {
		return this.dictionary.lookup(aWord);
	}

	@Override
	public void addWord(String aWord, String... aMeanings) {
		this.dictionary.addWord(aWord, aMeanings);
	}

}
