package com.thoughtworks.miami.model;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;


public class Hotels {
	
	private static final List<Hotel> listOfHotels = new ArrayList<Hotel>();
	static{
		
		listOfHotels.add(new Hotel("Lakewood",3,110,90,80,80)); 
		listOfHotels.add(new Hotel("Bridgewood",4,160,60,110,50)); 
		listOfHotels.add(new Hotel("Ridgewood",5,220,150,100,40)); 
		       
	}
	
	public Hotels(){
		super();
	}
	public static List<Hotel> getListofHotels() {
		 return listOfHotels;
	}
	
	

}

