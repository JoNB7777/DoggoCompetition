package com.qa.doggo_competition;

import java.util.ArrayList;
import java.util.List;

public class DoggoCompetition {
	public int place;
	
	public DoggoCompetition(int place) {
		this.place = place;
	}
	
	public List<String> removeMyRank() {
		List<String> places = new ArrayList<String>();
		String stringNumber = "";
		for (int i = 1; i <= 100; i ++) {
			String placeAsString = Integer.toString(i);
			if (placeAsString.endsWith("1") && placeAsString.equals("11") == false) {
				stringNumber = placeAsString + "st";
			} else if (placeAsString.endsWith("2") && placeAsString.equals("12") == false) {
				stringNumber = placeAsString + "nd";	
			} else if (placeAsString.endsWith("3") && placeAsString.equals("13") == false) {
				stringNumber = placeAsString + "rd";
			} else {
				stringNumber = placeAsString + "th";
			}
			
			places.add(stringNumber);
		}
		places.remove(place - 1);
		System.out.println(places);
		return places;
	}

}
