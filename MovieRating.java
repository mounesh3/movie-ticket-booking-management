package Movieticket;

import java.util.Scanner;

public class MovieRating {
	

	    public void giveRating(Scanner sc) {

	        System.out.println("\n----- MOVIE RATING -----");

	        System.out.print("Enter your rating (1-5): ");
	        int rating = sc.nextInt();

	        if (rating >= 1 && rating <= 5) {

	            System.out.println("Thank you for rating the movie "
	                    + rating + "/5.");

	        } else {

	            System.out.println("Invalid rating.");
	            System.out.println("Please enter rating between 1 and 5.");
	        }
	    }
	}

