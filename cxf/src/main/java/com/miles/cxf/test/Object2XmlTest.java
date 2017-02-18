package com.miles.cxf.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.miles.cxf.pojo.Book;
import com.miles.cxf.pojo.BookSet;
import com.miles.cxf.pojo.Customer;

public class Object2XmlTest {

	public static void main(String[] args) {

		Customer<BookSet> customer = new Customer<BookSet>();
		customer.setId(100);
		customer.setName("suo");
		customer.setAge(29);

		Book book = new Book();
		book.setId("1");
		book.setName("哈里波特");
		book.setPrice(100);

		Book book2 = new Book();
		book2.setId("2");
		book2.setName("苹果");
		book2.setPrice(50);

		BookSet bookSet = new BookSet();
		bookSet.addBook(book);
		bookSet.addBook(book2);

		customer.setT(bookSet);

		try {
			File file = new File("D:\\books.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class,
					BookSet.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
