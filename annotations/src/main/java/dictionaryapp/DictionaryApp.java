package dictionaryapp;

import org.coderearth.springrecipes.dictionaryapp.services.DictionaryLookupService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kunal_patel on 22/11/15.
 */
public class DictionaryApp {

	public static void main(String[] args) {
		final ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("dictionaryapp/applicationContext.xml");

		DictionaryLookupService lookupService = applicationContext.getBean("dictionaryLookupService",
				DictionaryLookupService.class);
		System.out.println(lookupService.lookup("hi"));
	}

}
