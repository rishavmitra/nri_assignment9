package assignment9.resource;

import java.math.BigInteger;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import assignment9.main.config;

@Component("customer")
public class Customer{
	String name,usrName,passWord,ssN,add,em;
	int age;
	BigInteger phone;
	float bal;
	
	@Autowired
	@Qualifier("saving")
	Account acc;

	Scanner in = new Scanner(System.in);
	public void signUp()
	{
		System.out.print("Name:");
		this.name = in.nextLine();
		System.out.print("User name:");
		this.usrName = in.next();
		System.out.print("Password:");
		this.passWord = in.next();
		System.out.print("SSN:");
		this.ssN = in.next();
		System.out.print("Address:");
		in.next();
		this.add = in.nextLine();
		System.out.print("email:");
		this.em = in.next();
		System.out.print("Age:");
		this.age = in.nextInt();
		System.out.print("Phone:");
		this.phone = in.nextBigInteger();
	}	
	
	@Override
	public String toString() {
		return "Customer name=" + name + "\nSSN=" + ssN + "\nAddress="
				+ add + "\nEmail=" + em + "\nage=" + age + "\nPhone=" + phone + "\nBalance=" + bal + "\nAccount=" + acc;
	}
	
}
