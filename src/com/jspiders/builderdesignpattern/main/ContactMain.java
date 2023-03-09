package com.jspiders.builderdesignpattern.main;

import com.jspiders.builderdesignpattern.builder.ContactBuilder;
import com.jspiders.builderdesignpattern.object.Contact;

public class ContactMain{
	public static void main(String[] args) {
		Contact contact=new ContactBuilder().first_name("suraj")
				.address("vita")
				.company("infy")
				.lastname("suryawanshi")
				.getContact();
		
		System.out.println(contact);
	}
}
