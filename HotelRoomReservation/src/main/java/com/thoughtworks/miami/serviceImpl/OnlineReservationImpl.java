package com.thoughtworks.miami.serviceImpl;

import com.thoughtworks.miami.constants.Constants;
import com.thoughtworks.miami.model.Hotel;
import com.thoughtworks.miami.model.Hotels;
import com.thoughtworks.miami.service.OnlineReservation;

public class OnlineReservationImpl implements OnlineReservation{

	@Override
	public String findCheapestHotel(String input) {
		
		int finalCost=0;
		Hotel finalHotel=null;
		
		for(Hotel hotel:Hotels.getListofHotels()){
			
			int totalcost=0;
	
			if(input != null && input.length() >1 && input.split(":").length == 2){
				
				String firstToken=input.split(":")[0];
				String secondToken=input.split(":")[1];
				for(String str:secondToken.split(",")){
					String day=str.substring(str.length()-4,str.length()-1);
					if("sat".equalsIgnoreCase(day) ||
							"sun".equalsIgnoreCase(day)){
						if("regular".equalsIgnoreCase(firstToken))
							totalcost=totalcost+hotel.getRegularWeekendRate();
						else
							totalcost=totalcost+hotel.getRewardsWeekendRate();
					}
					else{
						
						if("regular".equalsIgnoreCase(firstToken))
							totalcost=totalcost+hotel.getRegularWeekdayRate();
						else
							totalcost=totalcost+hotel.getRewardsWeekdayRate();
					}
				}
				
			}
			else
				return Constants.NO_HOTEL_AVAILABLE;
			if(finalCost==0 ){
				finalCost=totalcost;
				finalHotel=hotel;
			}
			else{
				
				if(totalcost < finalCost){
					finalCost=totalcost;
					finalHotel=hotel;
				}
				else if(totalcost == finalCost){
					if( hotel.getRating() > finalHotel.getRating())
						finalHotel=hotel;
				}
			}
		}
		return finalHotel.getLocation();
	}

}
