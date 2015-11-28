package org.coderearth.springrecipes.dictionaryapp.dao;

import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by kunal_patel on 28/11/15.
 */
@Repository
public class DictionaryDao {

	private Dictionary dictionary;

	public DictionaryDao() {
		this.dictionary = new Dictionary();
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	public Set<String> lookup(String aWord) {
		return this.dictionary.lookup(aWord);
	}

	public void addWord(String aWord, String... aMeanings) {
		this.dictionary.addWord(aWord, aMeanings);
	}

	public void populateDictionary(Dictionary aDictionary) {
		this.setDictionary(aDictionary);
	}

	public long size() {
		return dictionary.size();
	}
}
