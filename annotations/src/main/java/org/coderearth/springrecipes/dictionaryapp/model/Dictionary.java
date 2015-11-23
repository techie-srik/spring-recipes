package org.coderearth.springrecipes.dictionaryapp.model;


import com.google.common.base.MoreObjects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by kunal_patel on 22/11/15.
 */
public class Dictionary {

	private Map<String, DictionaryEntry> dictionaryEntries = null;

	public Dictionary() {
		this.dictionaryEntries = new HashMap<>();
	}

	public void addWord(final String aWord, String... meanings) {
		DictionaryEntry dictionaryEntry = this.dictionaryEntries.getOrDefault(aWord, new DictionaryEntry(aWord));
		this.dictionaryEntries.put(aWord, dictionaryEntry.addMeanings(meanings));
	}

	public Set<String> lookup(final String aWord) {
		return this.contains(aWord) ? this.dictionaryEntries.get(aWord).getMeanings() : null;
	}

	public boolean contains(final String aWord) {
		return this.dictionaryEntries.containsKey(aWord);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).addValue(this.dictionaryEntries).toString();
	}
}

class DictionaryEntry {

	private String word = null;
	private Set<String> meanings = null;

	public DictionaryEntry(String word) {
		this.word = word;
		this.meanings = new HashSet<>();
	}

	public DictionaryEntry(String word, Set<String> meanings) {
		this.meanings = meanings;
		this.word = word;
	}

	public DictionaryEntry addMeaning(final String aMeaning) {
		this.meanings.add(aMeaning);
		return this;
	}

	public DictionaryEntry addMeanings(final String... aMeanings) {
		Stream.of(aMeanings).forEach(aMeaning -> this.addMeaning(aMeaning));
		return this;
	}

	public Set<String> getMeanings() {
		return meanings;
	}

	public void setMeanings(Set<String> meanings) {
		this.meanings = meanings;
	}

	public String getWord() {
		return word;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).addValue(this.getWord()).addValue(this.getMeanings()).toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DictionaryEntry that = (DictionaryEntry) o;

		return this.getWord().equals(that.getWord());
	}

	@Override
	public int hashCode() {
		return this.getWord().hashCode();
	}
}
