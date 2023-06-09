package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher("Anjali");
		if (matcher.matches())
			System.out.println("valid first name");
		else
			System.out.println("Invalid first name");

		Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher1 = pattern.matcher("Rawke");
		if (matcher.matches())
			System.out.println("valid lastname");
		else
			System.out.println("Invalid lastname");

		Pattern pattern2 = Pattern.compile("^( [a-z]{3} [.] [a-z]{3}  @ ([a-z]{2} [.] [a-z]{2}) [.][a-z]{2,})");
		Matcher matcher2 = pattern.matcher("abc.xyz@bl.co.in");
		if (matcher.matches())
			System.out.println("valid email");
		else
			System.out.println("Invalid email");

		Pattern pattern3 = Pattern.compile("^(\\+?\\d{1,3})\s\\d{10}$");
		Matcher matcher3 = pattern.matcher("+91 7058162286");
		if (matcher.matches())
			System.out.println("valid phone number");
		else
			System.out.println("Invalid phone number");

		Pattern pattern4 = Pattern.compile("^[a-z]{8,}$");
		Matcher matcher4 = pattern.matcher("MyPassword");
		if (matcher.matches())
			System.out.println("valid password rule1");//rule1-minimum 8 characters
		else
			System.out.println("Invalid password rule1");

		Pattern pattern5 = Pattern.compile("^(?=[a-z]*[A-Z]).{8,}$");
		Matcher matcher5 = pattern.matcher("myPassword");
		if (matcher.matches())
			System.out.println("valid password rule2");//atleast1uppercase
		else
			System.out.println("Invalid password rule2");

		Pattern pattern6 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9]).{8,}$");
		Matcher matcher6 = pattern6.matcher("Password21");
		if (matcher6.matches())
			System.out.println("valid password rule3");//atleast 1 numeric number
		else
			System.out.println("Invalid password rule3");

		Pattern pattern7 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$");
		Matcher matcher7 = pattern7.matcher("Password*123");
		if (matcher7.matches())
			System.out.println("valid password rule4");//exactly 1 special character
		else
			System.out.println("Invalid password rule4");


		String text = "valid sample email addresses:"+
				"        //  1. abc@yahoo.com,\n" +
				"        //• 2. abc-100@yahoo.com,\n" +
				"        //• 3. abc.100@yahoo.com\n" +
				"        //• 4. abc111@abc.com,\n" +
				"        //• 5. abc-100@abc.net,\n" +
				"        //• 6. abc.100@abc.com.au\n" +
				"        //• 7. abc@1.com,\n" +
				"        //• 8. abc@gmail.com.com\n" +
				"        //• 9. abc+100@gmail.com";


		String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

		Pattern pattern8 = Pattern.compile(emailPattern);
		Matcher matcher8 = pattern8.matcher(text);
		System.out.println("Valid emails are : ");
		while (matcher8.find()) {
			String email = matcher8.group();
			System.out.println(email);
		}

	}
}
