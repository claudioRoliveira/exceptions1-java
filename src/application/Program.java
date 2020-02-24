package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date: ");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date: ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error: Check-out must be after check in");
		}
		else {
			Reservation reserva = new Reservation(number,checkIn,checkOut);
			System.out.println("Reservation: " + reserva);
			
			System.out.println();
			System.out.println("Enter Date to Update the reservation");
			System.out.println("Check-in date: ");
			Date checkIn2 = sdf.parse(sc.next());
			System.out.println("Check-out date: ");
			Date checkOut2 = sdf.parse(sc.next());
		
			reserva.updateDates(checkIn2, checkOut2);
			System.out.println("Reservation: " + reserva);
		}
	}

}
