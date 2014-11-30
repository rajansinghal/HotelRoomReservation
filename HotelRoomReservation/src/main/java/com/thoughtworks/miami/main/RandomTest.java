package com.thoughtworks.miami.main;

import java.util.Random;

public class RandomTest {
	/*private static final Random rnd = new Random();
	static int random(int n) {
		return Math.abs(rnd.nextInt()) % n;
	}*/
	
	public static void main(String[] args){
		/*for(int i=0;i<=9;i++)
			System.out.println(random(1));*/
		String url="http://shakeology.com:8080/en_US/shake-flavors";
		
		System.out.println(url.contains("enS"));
	}
}
