package org.coderearth.springrecipes.dictionaryapp.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Set;

/**
 * Created by kunal_patel on 28/11/15.
 */
@Service
public class DictionaryApp {
	private final Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private DictionaryBuilderService builderService;

	@Autowired
	private DictionaryLookupService lookupService;

	public DictionaryApp() {
		logger.info("Creating DictionaryApp !!");
		logger.info("Created DictionaryApp !!");
	}

	public void setBuilderService(DictionaryBuilderService builderService) {
		logger.info("Setting BuilderService !!");
		this.builderService = builderService;
	}

	public void setLookupService(DictionaryLookupService lookupService) {
		logger.info("Setting LookupService !!");
		this.lookupService = lookupService;
	}

	@PostConstruct
	public void start() {
		logger.info("Inside post-construct of DictionaryApp");
		lookupService.setDictionaryDao(builderService.build().getDictionaryDao());
		logger.info("DictionaryApp is now ready to accept lookup requests !!");
	}

	@PreDestroy
	private void destroy() {
		logger.info("Destroying DictionaryApp !!");
		this.builderService = null;
		this.lookupService = null;
		logger.info("DictionaryApp destroyed !!");
	}

	public boolean isDictionaryReadyForLookup() {
		return lookupService != null && lookupService.isLookupReady();
	}

	public Set<String> lookup(final String aWord) {
		return this.lookupService.lookup(aWord);
	}

}
