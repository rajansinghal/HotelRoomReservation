package com.thoughtworks.miami.serviceManager;

import com.thoughtworks.miami.service.OnlineReservation;
import com.thoughtworks.miami.serviceImpl.OnlineReservationImpl;


public class ServiceManager {

	private static final OnlineReservation onlineReservationService= new OnlineReservationImpl();

	public static OnlineReservation getOnlinereservationservice() {
		return onlineReservationService;
	}

	
	
	
}
