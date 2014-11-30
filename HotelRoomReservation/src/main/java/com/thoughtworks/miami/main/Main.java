package com.thoughtworks.miami.main;

import com.thoughtworks.miami.serviceManager.ServiceManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceManager.getOnlinereservationservice().findCheapestHotel("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)");
		System.out.println(ServiceManager.getOnlinereservationservice().findCheapestHotel("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)"));
		System.out.println(ServiceManager.getOnlinereservationservice().findCheapestHotel("Regular: 22Mar2009(fri), 09Mar2009(sat), 11Mar2009(sun)"));
	

	}

}
