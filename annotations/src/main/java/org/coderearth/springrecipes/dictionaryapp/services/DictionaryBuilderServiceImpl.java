package org.coderearth.springrecipes.dictionaryapp.services;

import org.coderearth.springrecipes.dictionaryapp.dao.builder.DictionaryBuilder;
import org.coderearth.springrecipes.dictionaryapp.model.Dictionary;
import org.springframework.stereotype.Service;

/**
 * Created by kunal_patel on 16/11/15.
 */
@Service
public class DictionaryBuilderServiceImpl implements DictionaryBuilderService {

	private DictionaryBuilder dictionaryBuilder;

	public DictionaryBuilderServiceImpl(DictionaryBuilder dictionaryBuilder) {
		this.dictionaryBuilder = dictionaryBuilder;
	}

	@Override
	public Dictionary build() {
		return dictionaryBuilder.build();
	}
}
