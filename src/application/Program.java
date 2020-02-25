package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

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
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date: ");
			checkOut = sdf.parse(sc.next());
		
			reserva.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reserva);
		}
		catch (ParseException e) {
			
		}
		catch (DomainException e) {
		 System.out.println("Error in reservation: " + e.getMessage());
		}
		sc.close();
	}

}
