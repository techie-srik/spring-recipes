package org.coderearth.springrecipes.dictionaryapp.builder;

import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;
import org.springframework.stereotype.Component;

/**
 * Created by kunal_patel on 28/11/15.
 */
@Component
public class InMemoryDictionaryBuilder {

	public InMemoryDictionaryBuilder() {
	}

	public Dictionary build() {
		Dictionary dictionary = new Dictionary();
		dictionary.addWord("hello", "hi");
		dictionary.addWord("hi", "hello", "greeting");
		return dictionary;
	}

}
