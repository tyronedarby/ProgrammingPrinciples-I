/**
 * File: Movie.java
 * Class: CSCI 1301
 * Author: Tyrone Darby
 * Created on: 11/15/25
 * Last modified: 11/15/25
 * Description: a Java program that creates a Movie class.
 */

public class Movie {
	
	private String title;
	private int releaseYear;
	private String genre;
	private double rating;
	
	// Create 3 different constructor
	Movie() {
		setTitle("Untitled");
		setReleaseYear(2018);
		setGenre("Drama");
		setRating(0.0);
	}
	
	Movie(String title){
		setTitle(title);
		setReleaseYear(2018);
		setGenre("Drama");
		setRating(0.0);
	}
	
	Movie(String title, int releaseYear, String genre, double rating){
		setTitle(title);
		setReleaseYear(releaseYear);
		setGenre(genre);
		setRating(rating);
	}
	
	// Determine the rating category base on the rating figure
	public String getRatingCategory() {
		String category;
		if(rating >= 90) {
			category = "Excellent"; 
		} else if(rating >= 80){
			category = "Above Average";
		} else if(rating >= 70) {
			category = "Average";
		} else if(rating >= 60) {
			category = "Below Average";
		} else {
			category = "Poor";
		}
		return category;
	}
	
	// Get information about the movie
	public String getInfo() {
		return String.format("%s (%d), %s, Rating: %s", title, releaseYear, genre, getRatingCategory());
	}
	
	// Add ccessors and mutators for all data members
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public String getTitle() {
		return title;
	}
	public void setReleaseYear(int newReleaseYear) {
		releaseYear = newReleaseYear;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public void setGenre(String newGenre) {
		genre = newGenre;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setRating(double newRating) {
		rating = newRating;
	}
	
	public double getRating() {
		return rating;
	}
}
