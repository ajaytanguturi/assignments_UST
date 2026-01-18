package com.simplemovie.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.simplemovie.entity.Booking;
import com.simplemovie.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	private final BookingService service;
	public BookingController(BookingService service) {
		this.service=service;
	}
	
	@PostMapping
	public Booking bookTickets(@RequestBody Booking booking) {
		return service.bookTickets(booking);
	}
	
	@GetMapping
	public List<Booking> getAllBookings(){
		return service.getAllBookings();
	}
	
	@DeleteMapping("/{bookingId}")
	public String cancelBooking(@PathVariable Long bookingId) {
		service.cancelBooking(bookingId);
		return "Booking Cancelled Successfully";
	}
}