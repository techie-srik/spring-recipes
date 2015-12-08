package org.coderearth.springrecipes.dictionaryapp.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan


public class DictionaryConfiguration {
	
	public static void main(String[] args)  {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
 
		ctx.register(DictionaryConfiguration.class);
		ctx.refresh();

	
	}

}
