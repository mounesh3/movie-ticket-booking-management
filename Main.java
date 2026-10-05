package Movieticket;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Theatre theatre = new Theatre();
        Booking booking = new Booking(theatre);
        MovieRating rating = new MovieRating();

        int choice;

        System.out.println("=================================");
        System.out.println("     MOVIE TICKET BOOKING SYSTEM");
        System.out.println("=================================");

        do {

            System.out.println("\n--------- MAIN MENU ---------");

            System.out.println("1. Show Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Movie Rating");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    theatre.showSeats();
                    break;

                case 2:

                    booking.bookTicket(sc);
                    break;

                case 3:

                    booking.cancelTicket(sc);
                    break;

                case 4:

                    rating.giveRating(sc);
                    break;

                case 5:

                    System.out.println(
                            "Thank you for using Movie Ticket Booking System!");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}

