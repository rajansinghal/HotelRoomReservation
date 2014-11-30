package com.thoughtworks.miami.main;

import com.thoughtworks.miami.serviceManager.ServiceManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceManager.getOnlinereservationservice().findCheapestHotel("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)");
	}

}
