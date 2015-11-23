package org.coderearth.springrecipes.dictionaryapp.services;

import java.util.Set;

/**
 * Created by kunal_patel on 15/11/15.
 */
public interface DictionaryLookupService {

    Set<String> lookup(final String aWord);

}
