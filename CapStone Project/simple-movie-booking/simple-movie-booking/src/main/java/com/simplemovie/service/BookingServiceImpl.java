package com.simplemovie.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import com.simplemovie.entity.Booking;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.BookingRepository;
import com.simplemovie.repository.ShowRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	private final BookingRepository bookingRepo;
	private final ShowRepository showRepo;
	
	public BookingServiceImpl(BookingRepository bookingRepo, ShowRepository showRepo) {
		this.bookingRepo=bookingRepo;
		this.showRepo=showRepo;
	}

	@Override
	public Booking bookTickets(Booking booking) {
		Long showId = booking.getShow().getShowId();
		Show show =showRepo.findById(booking.getShow().getShowId())
				.orElseThrow(() -> new RuntimeException("Show not found"));
		
		if(booking.getSeatsBooked() > show.getAvailableSeats()) {
			throw new RuntimeException("Seats Not Available");
		}
		show.setAvailableSeats(show.getAvailableSeats() - booking.getSeatsBooked());
		showRepo.save(show);
		booking.setShow(show);
		
		booking.setBookingDate(LocalDate.now());
		return bookingRepo.save(booking);
	}

	@Override
	public List<Booking> getAllBookings() {
		return bookingRepo.findAll();
	}

	@Override
	public void cancelBooking(Long bookingId) {
		Booking booking = bookingRepo.findById(bookingId)
				.orElseThrow(() -> new RuntimeException("Booking not found"));
		
		Show show =booking.getShow();
		
		show.setAvailableSeats(show.getAvailableSeats()+booking.getSeatsBooked());
		showRepo.save(show);
		bookingRepo.deleteById(bookingId);
	}
}
