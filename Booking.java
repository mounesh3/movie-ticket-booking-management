package Movieticket;

import java.util.Scanner;

public class Booking {
	

	   Theatre theatre;
	    Coupon coupon;

	    double normalPrice = 150;

	    Booking(Theatre theatre) {

	        this.theatre = theatre;
	        coupon = new Coupon();
	    }

	    // Book ticket
	    public void bookTicket(Scanner sc) {

	        theatre.showSeats();

	        System.out.print("\nEnter row number (1-5): ");
	        int row = sc.nextInt();

	        System.out.print("Enter column number (1-6): ");
	        int column = sc.nextInt();

	        // Convert to array index
	        row--;
	        column--;

	        // Validate seat
	        if (row < 0 || row >= theatre.rows ||
	                column < 0 || column >= theatre.columns) {

	            System.out.println("Invalid seat number.");
	            return;
	        }

	        // Check availability
	        if (!theatre.isAvailable(row, column)) {

	            System.out.println("Sorry! Seat already booked.");
	            return;
	        }

	        double price = calculatePrice();

	        System.out.println("\nTicket Price: ₹" + price);

	        System.out.print("Do you have a coupon? (MOVIE10/MOVIE20/NO): ");
	        String couponCode = sc.next();

	        double finalPrice = coupon.applyCoupon(couponCode, price);

	        System.out.println("Final Ticket Price: ₹" + finalPrice);

	        // Book the seat
	        theatre.bookSeat(row, column);

	        System.out.println("\nTicket booked successfully!");
	        System.out.println("Seat: Row " + (row + 1)
	                + ", Column " + (column + 1));
	    }

	    // Weekend pricing
	    public double calculatePrice() {

	        java.time.DayOfWeek today =
	                java.time.LocalDate.now().getDayOfWeek();

	        if (today == java.time.DayOfWeek.SATURDAY ||
	                today == java.time.DayOfWeek.SUNDAY) {

	            System.out.println("Weekend pricing applied.");
	            return normalPrice + 50;
	        }

	        return normalPrice;
	    }

	    // Cancel ticket
	    public void cancelTicket(Scanner sc) {

	        theatre.showSeats();

	        System.out.print("\nEnter row number to cancel: ");
	        int row = sc.nextInt();

	        System.out.print("Enter column number to cancel: ");
	        int column = sc.nextInt();

	        row--;
	        column--;

	        if (row < 0 || row >= theatre.rows ||
	                column < 0 || column >= theatre.columns) {

	            System.out.println("Invalid seat number.");
	            return;
	        }

	        if (theatre.isAvailable(row, column)) {

	            System.out.println("This seat is not booked.");
	            return;
	        }

	        theatre.cancelSeat(row, column);

	        System.out.println("Ticket cancelled successfully.");
	        System.out.println("Seat Row " + (row + 1)
	                + ", Column " + (column + 1)
	                + " is now available.");
	    }
	}

