package com.zoo.animal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplicatio {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.zoo");
		context.refresh();
		
		Zoo zoo = context.getBean(Zoo.class);
		
		System.out.println(zoo.getAnimal());
		
		context.close();
		
	     

	}

}
