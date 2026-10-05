package Movieticket;

public class Theatre {
	boolean[][] seats;

    int rows = 5;
    int columns = 6;

    Theatre() {
        seats = new boolean[rows][columns];
    }

    // Show available seats
    public void showSeats() {

        System.out.println("\n----- SEAT STATUS -----");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (seats[i][j] == false) {
                    System.out.print("[A] ");
                } else {
                    System.out.print("[B] ");
                }
            }

            System.out.println();
        }

        System.out.println("A = Available");
        System.out.println("B = Booked");
    }

    // Check whether seat is available
    public boolean isAvailable(int row, int column) {

        return seats[row][column] == false;
    }

    // Book seat
    public void bookSeat(int row, int column) {

        seats[row][column] = true;
    }

    // Cancel seat
    public void cancelSeat(int row, int column) {

        seats[row][column] = false;
    }

}
