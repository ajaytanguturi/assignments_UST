package com.simplemovie.service;
import java.util.List;
import com.simplemovie.entity.Booking;
public interface BookingService {
	Booking bookTickets(Booking booking);
	List<Booking> getAllBookings();
	void cancelBooking(Long bookingId);
}