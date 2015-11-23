package org.coderearth.springrecipes.dictionaryapp.dao.builder;

import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;
import org.springframework.stereotype.Service;

/**
 * Created by kunal_patel on 16/11/15.
 */
@Service
public class InMemoryDictionaryBuilderImpl implements DictionaryBuilder {

	@Override
	public Dictionary build() {
		Dictionary dictionary = new Dictionary();
		dictionary.addWord("hello", "hi");
		dictionary.addWord("hi", "hello", "greeting");
		return dictionary;
	}

}
