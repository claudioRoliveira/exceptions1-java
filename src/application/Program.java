package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			System.out.println("Room number: ");
			int number = sc.nextInt();
			System.out.println("Check-in date: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date: ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reserva = new Reservation(number,checkIn,checkOut);
			System.out.println("Reservation: " + reserva);
			
			System.out.println();
			System.out.println("Enter Date to Update the reservation");
			System.out.println("Check-in date: ");
			Date checkIn1 = sdf.parse(sc.next());
			System.out.println("Check-out date: ");
			Date checkOut1 = sdf.parse(sc.next());
		
			reserva.updateDates(checkIn1, checkOut1);
			System.out.println("Reservation: " + reserva);
		}
		catch (ParseException e) {
			
		}
		
	}

}
