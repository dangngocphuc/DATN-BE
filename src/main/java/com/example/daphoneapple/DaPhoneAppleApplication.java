package com.example.daphoneapple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class DaPhoneAppleApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DaPhoneAppleApplication.class, args);

		System.out.println("OD" + getSaltString());
	}

	public static String getSaltString() {
		String SALTCHARS = "0123456789";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() <= 1) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}
}
