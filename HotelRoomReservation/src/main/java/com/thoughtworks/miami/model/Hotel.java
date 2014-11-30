package com.thoughtworks.miami.model;

public class Hotel {
	
	private String location;
	private int rating;
	private int regularWeekdayRate;
	private int regularWeekendRate;
	private int rewardsWeekdayRate;
	private int rewardsWeekendRate;
	
	public Hotel(String location, int rating, int regularWeekdayRate, int regularWeekendRate, int rewardsWeekdayRate, int rewardsWeekendRate ){
		
		this.location=location;
		this.rating=rating;
		this.regularWeekdayRate=regularWeekdayRate;
		this.regularWeekendRate=regularWeekendRate;
		this.rewardsWeekdayRate=rewardsWeekdayRate;
		this.rewardsWeekendRate=rewardsWeekendRate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRegularWeekdayRate() {
		return regularWeekdayRate;
	}

	public void setRegularWeekdayRate(int regularWeekdayRate) {
		this.regularWeekdayRate = regularWeekdayRate;
	}

	public int getRegularWeekendRate() {
		return regularWeekendRate;
	}

	public void setRegularWeekendRate(int regularWeekendRate) {
		this.regularWeekendRate = regularWeekendRate;
	}

	public int getRewardsWeekdayRate() {
		return rewardsWeekdayRate;
	}

	public void setRewardsWeekdayRate(int rewardsWeekdayRate) {
		this.rewardsWeekdayRate = rewardsWeekdayRate;
	}

	public int getRewardsWeekendRate() {
		return rewardsWeekendRate;
	}

	public void setRewardsWeekendRate(int rewardsWeekendRate) {
		this.rewardsWeekendRate = rewardsWeekendRate;
	}
	

}
