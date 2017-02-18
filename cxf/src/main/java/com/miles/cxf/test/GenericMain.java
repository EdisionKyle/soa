package com.miles.cxf.test;

import com.miles.cxf.service.AnimalInte;
import com.miles.cxf.service.AnimalInteImpl;

public class GenericMain {

	public static void main(String[] args) {
		AnimalInte<String> ai = new AnimalInteImpl<String>();
		System.out.println(ai.getName("String"));
	}

}
