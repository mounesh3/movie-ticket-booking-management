package Movieticket;

public class Coupon {
	public double applyCoupon(String coupon, double amount) {

        if (coupon.equalsIgnoreCase("MOVIE10")) {

            System.out.println("10% discount applied.");
            return amount - (amount * 0.10);

        } else if (coupon.equalsIgnoreCase("MOVIE20")) {

            System.out.println("20% discount applied.");
            return amount - (amount * 0.20);

        } else if (coupon.equalsIgnoreCase("NO")) {

            System.out.println("No coupon applied.");
            return amount;

        } else {

            System.out.println("Invalid coupon.");
            return amount;
        }
    }
}


